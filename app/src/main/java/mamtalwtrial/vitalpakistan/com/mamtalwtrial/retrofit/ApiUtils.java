package mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit;

public class ApiUtils {


    private ApiUtils() {}

 //  public static final String BASE_URL ="http://vitalpakistan.org/maamtalwtrial/";
           // "192.168.1.107:8080/form/crf/1/register";
     public static final String BASE_URL ="http://192.168.8.100:8080/";

  //public static final String BASE_URL ="http://vitalpakistan.org/qa/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
