package mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class ApiUtils {

    private ApiUtils() {}
    //public static final String BASE_URL ="http://vitalpakistan.org/maamtalwtrial/";
           // "192.168.1.107:8080/form/crf/1/register";
     public static final String BASE_URL ="http://192.168.10.42:8080/";

   // public static final String BASE_URL ="http://windows-p20fb01/";

 // public static final String BASE_URL ="http://vitalpakistan.org/qa/";

    public static APIService getAPIService() {

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();


        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
