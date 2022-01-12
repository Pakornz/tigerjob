package th.co.icc.tigerjob.api;


import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.cert.CertificateException;

import static th.co.icc.tigerjob.config.App.SKYFROG_ICC_COMPANY_ID;


public class SelfSigningClientBuilder extends CustomHttp
{

    public  OkHttpClient getUnsafeOkHttpClient(String username , String password)
    {

        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager()
            {
                @Override
                public void checkClientTrusted(
                        java.security.cert.X509Certificate[] chain,
                        String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(
                        java.security.cert.X509Certificate[] chain,
                        String authType) throws CertificateException {
                }

                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[0];
                }
            } };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts,
                    new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext
                    .getSocketFactory();

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder().sslSocketFactory(sslSocketFactory).hostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            if(username != null && password != null )
            {
                final String authToken = Credentials.basic(username, password);

                Interceptor interceptor = new Interceptor()
                {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException
                    {
                        final Request request = chain.request().newBuilder()
                                .addHeader(Header.AUTHORIZATION, authToken)
                                .addHeader(Header.COMPANY_ID, SKYFROG_ICC_COMPANY_ID)
                                .addHeader(Header.CONTENT_TYPE, CONTENT_TYPE_JSON)
                                .build();

                        return chain.proceed(request);
                    }
                };

                httpClient.addInterceptor(interceptor);
            }
            return httpClient.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public  OkHttpClient getUnsafeOkHttpClient()
    {
        return  getUnsafeOkHttpClient(null , null) ;
    }

    public OkHttpClient getHeaderBearerToken(String token)
    {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        final String authToken = "Bearer "+token;

        Interceptor interceptor = new Interceptor()
        {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException
            {
                final Request request = chain.request().newBuilder()
                        .addHeader(Header.AUTHORIZATION, authToken)
                        .addHeader(Header.CONTENT_TYPE, CONTENT_TYPE_JSON)
                        .build();

                return chain.proceed(request);
            }
        };

        httpClient.addInterceptor(interceptor);
        return httpClient.build();


    }

}