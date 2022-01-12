package th.co.icc.tigerjob.api;

import android.support.annotation.NonNull;
import android.util.Log;
import org.json.JSONObject;
import retrofit2.Response;


public class CustomHttp
{

    public interface Header
    {
        String AUTHORIZATION = "Authorization";
        String CONTENT_TYPE = "Content-Type";

        String COMPANY_ID = "CompanyID";
    }

    public final static String CONTENT_TYPE_JSON = "application/json";



    protected String getErrorBody(@NonNull Response<Object> response)
    {
        Log.e("FAILED" , String.valueOf(response.message())) ;
        try
        {
            JSONObject jObjError = new JSONObject(response.errorBody().string());
            Log.e("ERR-BODY" , response.errorBody().string());
            return ( jObjError.getString("message"));

        }
        catch (Exception e)
        {
            Log.e("FAILED-JSON" , String.valueOf(  e.getMessage() )) ;
            return ( e.getMessage());
        }
    }
}