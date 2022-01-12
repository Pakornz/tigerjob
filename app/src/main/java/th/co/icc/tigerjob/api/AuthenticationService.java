package th.co.icc.tigerjob.api;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import okhttp3.*;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import th.co.icc.tigerjob.database.RealmDb;
import th.co.icc.tigerjob.database.modelrealm.User;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static th.co.icc.tigerjob.config.App.*;


public class AuthenticationService extends CustomHttp
{
    String nickname = "89898989";

    interface CheckUser
    {
        @GET(WEB_GET_API_CHECK_USER)
        Call<Object> checkUser(@QueryMap Map<String, String> options);
    }

    interface CheckUserRight
    {
        @GET(WEB_GET_API_CHECK_USERRIGHT)
        Call<Object> checkUserRight(@QueryMap Map<String, String> options);
    }

    interface GenToken
    {
        @POST(WEB_POST_API_GENTOKEN)
        Call<Object> genToken(@Body RequestBody body);
    }

    interface CheckToken
    {
        @POST(WEB_POST_API_CHECKTOKEN)
        Call<Object> checkToken(@Body RequestBody body);
    }


    public interface OnCheckAuthenticationListener
    {
        void onAuthResult(AuthResult result);
    }


    final Context context;

    public AuthenticationService(final Context context) {
        this.context = context;
    }

    public void checkUser(final String username , final String password, final OnCheckAuthenticationListener onCheckAuthenListener)
    {
        final AuthResult authResult = new AuthResult();
        authResult.setAutherUser(false);

        final CallbackListener checkAuthCallback = new CallbackListener()
        {
            @Override
            public void callback(Object object) {
                if( onCheckAuthenListener != null)
                {
                    onCheckAuthenListener.onAuthResult(authResult);
                }
            }
        };

        final Auth authModel = new Auth();
        authModel.setUsername(username);
        authModel.setPassword(password);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        OkHttpClient client = httpClient.build();

        Retrofit.Builder builder =   new Retrofit.Builder()
                .baseUrl( WEB_GET_API_BASE_URL )
                .client(client)
                .addConverterFactory(GsonConverterFactory.create());

        CheckUser authorization = builder.build().create(CheckUser.class);

        Map<String, String> data = new HashMap<>();
        data.put("user_id",username);
        data.put("password_id",password);

        Call<Object> call = authorization.checkUser(data);

        call.enqueue(new Callback<Object>()
        {
            @Override
            public void onResponse(@NonNull Call<Object> call, @NonNull Response<Object> response)
            {
                String errMsg = null;
                if(response.isSuccessful())
                {
                    authResult.setAutherUser(true);
                }
                else
                {
                    errMsg = getErrorBody(response);
                    Log.e("ERROR-AUTHEN" , String.valueOf(response.errorBody()));
                }

                authResult.setMessage(errMsg);
                checkAuthCallback.callback(authResult);
            }

            @Override
            public void onFailure(@NonNull Call<Object> call, @NonNull Throwable t)
            {
                authResult.setMessage(t.getMessage());
                checkAuthCallback.callback(authResult);
            }
        });

    }

    public void checkUserRight(final String username , final String password, final OnCheckAuthenticationListener onCheckAuthenListener)
    {
        final AuthResult authResult = new AuthResult();
        authResult.setAutherUser(false);

        final CallbackListener checkAuthCallback = new CallbackListener()
        {
            @Override
            public void callback(Object object) {
                if( onCheckAuthenListener != null)
                {
                    onCheckAuthenListener.onAuthResult(authResult);
                }
            }
        };

        final Auth authModel = new Auth();
        authModel.setUsername(username);
        authModel.setPassword(password);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        OkHttpClient client = httpClient.build();

        Retrofit.Builder builder =   new Retrofit.Builder()
                .baseUrl( WEB_GET_API_BASE_URL )
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()) ;

        CheckUserRight authorization = builder.build().create(CheckUserRight.class);

        Map<String, String> data = new HashMap<>();
        data.put("user_id",username);
        data.put("screen_id",APP_SCREEN);

        Call<Object> call = authorization.checkUserRight(data);

        call.enqueue(new Callback<Object>()
        {
            @Override
            public void onResponse(@NonNull Call<Object> call, @NonNull Response<Object> response)
            {
                String errMsg = null;
                if(response.isSuccessful())
                {
                    final Gson gson =  new GsonBuilder().serializeNulls().create();
                    JsonObject jsonObject = gson.toJsonTree(response.body()).getAsJsonObject();

                    JsonArray datas = jsonObject.getAsJsonArray("datas");

                    String user_name = datas.get(0).getAsJsonObject().get("user_name").getAsString();

                    RealmDb realmDatabase = new RealmDb();
                    User user = new User();
                    user.setName(user_name);
                    nickname = user_name;

                    realmDatabase.insertOrUpdateUser(user);
                    realmDatabase.close();

                    authResult.setAutherUser(true);
                    Log.e("AUTHEN-USER-NAME" , String.valueOf(nickname));
                    Log.e("AUTHEN-USER-NAME" , String.valueOf(user.getName()));
                }
                else
                {
                    errMsg = getErrorBody(response);
                    Log.e("ERROR-AUTHEN" , String.valueOf(response.errorBody()));
                }

                authResult.setMessage(errMsg);
                checkAuthCallback.callback(authResult);
            }

            @Override
            public void onFailure(@NonNull Call<Object> call, @NonNull Throwable t)
            {
                authResult.setMessage(t.getMessage());
                checkAuthCallback.callback(authResult);
            }
        });

    }

    public void genTokenAuth(final String username , final String password, final OnCheckAuthenticationListener onCheckAuthenListener) throws JSONException
    {
        final AuthResult authResult = new AuthResult();
        authResult.setAuthorization(false);

        final CallbackListener checkAuthCallback = new CallbackListener()
        {
            @Override
            public void callback(Object object) {
                if( onCheckAuthenListener != null)
                {
                    onCheckAuthenListener.onAuthResult(authResult);
                }
            }
        };

        final Auth authModel = new Auth();

        authModel.setUsername(username);
        authModel.setAdminSecretKey(SECRET_KEY);
        authModel.setExpireDay(EXPIRE_DAY_TOKEN);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        OkHttpClient client = httpClient.build();

        Interceptor interceptor = new Interceptor()
        {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException
            {
                final Request request = chain.request().newBuilder()
                        .addHeader(Header.CONTENT_TYPE, CONTENT_TYPE_JSON)
                        .build();

                return chain.proceed(request);
            }
        };
        httpClient.addInterceptor(interceptor);

        Retrofit.Builder builder =   new Retrofit.Builder()
                .baseUrl( WEB_GET_API_BASE_URL )
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()) ;

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .serializeNulls()
                .create();

        GenToken authorization = builder.build().create(GenToken.class);

        final String appName = gson.toJson(authModel);
        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON),appName);
        Call<Object> call = authorization.genToken(body);

        call.enqueue(new Callback<Object>()
        {
            @Override
            public void onResponse(@NonNull Call<Object> call, @NonNull Response<Object> response)
            {
                String errMsg = null;
                if(response.isSuccessful())
                {
                    final Gson gson =  new GsonBuilder().serializeNulls().create();
                    JsonObject jsonObject = gson.toJsonTree(response.body()).getAsJsonObject();

                    String token = jsonObject.get("token").getAsString();
                    String expire = jsonObject.get("expireDatetime").getAsString();

                    RealmDb realmDatabase = new RealmDb();

                    realmDatabase.deleteUser();
                    User user = new User();
                    user.setAuthDate(new Date());
                    user.setAuthToken(token);
                    user.setName(username);
                    user.setExpiredate(expire);

                    realmDatabase.insertOrUpdateUser(user);
                    realmDatabase.close();

                    Log.wtf("NAME" , user.getName());
                    Log.wtf("TOKEN" , user.getAuthToken());
                    Log.wtf("DATE" , user.getExpiredate());

                    authResult.setAuthorization(true);
                }
                else
                {
                    errMsg = getErrorBody(response);
                    Log.e("ERROR-AUTHEN" , String.valueOf(response.errorBody()));
                }

                authResult.setMessage(errMsg);
                checkAuthCallback.callback(authResult);
            }

            @Override
            public void onFailure(@NonNull Call<Object> call, @NonNull Throwable t)
            {
                authResult.setMessage(t.getMessage());
                checkAuthCallback.callback(authResult);
            }
        });
    }

    
    public void checkTokenAuth(final User user , final OnCheckAuthenticationListener onCheckAuthenListener) throws JSONException
    {
        final AuthResult authResult = new AuthResult();
        authResult.setAuthorization(false);

        final CallbackListener checkAuthCallback = new CallbackListener()
        {
            @Override
            public void callback(Object object)
            {
                if( onCheckAuthenListener != null)
                {
                    onCheckAuthenListener.onAuthResult(authResult);
                }
            }
        };

        OkHttpClient client = new SelfSigningClientBuilder().getHeaderBearerToken(user.getAuthToken()) ;

        Retrofit.Builder builder =   new Retrofit.Builder()
                .baseUrl( WEB_GET_API_BASE_URL )
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()) ;

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .serializeNulls()
                .create();

        CheckToken verifyAuthToken = builder.build().create(CheckToken.class);

        final Auth authModel = new Auth();

        authModel.setAdminSecretKey(SECRET_KEY);

        String appName = gson.toJson(authModel);
        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON),appName) ;
        Call<Object> call = verifyAuthToken.checkToken(body);

        call.enqueue(new Callback<Object>()
        {
            @Override
            public void onResponse(@NonNull Call<Object> call, @NonNull Response<Object> response)
            {
                String errMsg = null;
                authResult.setStatusCode(response.code());

                if(response.isSuccessful())
                {
                    authResult.setAuthorization(true);

                    Log.wtf("CHECK-NAME-PASS" , user.getName());
                    Log.wtf("CHECK-TOKEN-PASS" , user.getAuthToken());
                }
                else
                {
                    errMsg = getErrorBody(response);
                    Log.wtf("11111111111111111" , user.getAuthToken());
                    Log.wtf("11111111111111111" , String.valueOf(authResult.authorization));
                }

                authResult.setMessage(errMsg);
                checkAuthCallback.callback(authResult);
            }

            @Override
            public void onFailure(@NonNull Call<Object> call, @NonNull Throwable t)
            {
                authResult.setMessage(t.getMessage());
                checkAuthCallback.callback(authResult);
                Log.wtf("11111111111111111" , String.valueOf(authResult.getMessage()));
            }
        });
    }

    private class Auth
    {
        @Expose
        @SerializedName("username")
        private String username ;


        @Expose
        @SerializedName("password")
        private String password;

        @Expose
        @SerializedName("adminSecretKey")
        private String adminSecretKey;

        @Expose
        @SerializedName("expireDay")
        private Integer expireDay;


        public Auth()
        {

        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAdminSecretKey() {
            return adminSecretKey;
        }

        public void setAdminSecretKey(String adminSecretKey) {
            this.adminSecretKey = adminSecretKey;
        }

        public Integer getExpireDay() {
            return expireDay;
        }

        public void setExpireDay(Integer expireDay) {
            this.expireDay = expireDay;
        }

        @Override
        public String toString() {
            return "Auth{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", adminSecretKey='" + adminSecretKey + '\'' +
                    ", expireDay='" + expireDay + '\'' +
                    '}';
        }
    }

    public class AuthResult
    {
         boolean authorization = false;
         String message ;
         int statusCode = -1;
         boolean autherUser = false;

        public boolean isAuthorization() {
            return authorization;
        }

        public void setAuthorization(boolean authorization) {
            this.authorization = authorization;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public boolean isAutherUser() {
            return autherUser;
        }

        public void setAutherUser(boolean autherUser) {
            this.autherUser = autherUser;
        }
    }

}
