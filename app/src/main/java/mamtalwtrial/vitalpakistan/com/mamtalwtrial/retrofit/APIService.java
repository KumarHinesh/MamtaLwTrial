package mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit;


import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.LoginDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.SearchResult;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {


  /*  @POST("/test.php")
    Call<FormCrf1DTO> sendForm(@Body FormCrf1DTO body);*/

    @POST("form/crf/1/register")
    Call<FormCrf1DTO> sendCrf1Form(@Body FormCrf1DTO body);

    @POST("form/crf/2/save")
    Call<FormCrf2DTO> postCrf2(@Body FormCrf2DTO body);

    @POST("form/crf/3a/save")
    Call<FormCrf3aDTO> postCrf3a(@Body FormCrf3aDTO body);

    @POST("form/crf/3b/save")
    Call<FormCrf3bDTO> postCrf3b(@Body FormCrf3bDTO body);

    @POST("form/crf/3c/save")
    Call<FormCrf3cDTO> postCrf3c(@Body FormCrf3cDTO body);

    @POST("form/crf/4a/save")
    Call<Crf4Complete> postCrf4Complete(@Body Crf4Complete body);

    @POST("form/crf/5a/save")
    Call<FormCrf5a> postCrf5a(@Body FormCrf5a body);

    @POST("user/login")
    Call<LoginDTO> userLogin(@Body TeamDTO body);

    @GET("search/site/{s}/para/{p}/block/{b}/structrue/{st}")
    Call<SearchResult> searchWoman(@Path("s") String site, @Path("p") String para, @Path("b")String block, @Path("st")String structure);

    @POST("register/multi")
    Call<FormCrf1CollectionDTO> sendCrf1ListToServer(@Body FormCrf1CollectionDTO body);

    @POST("form/crf/5b/save")
    Call<FormCrf5b> postCrf5b(@Body FormCrf5b body);

    @POST("form/crf/6/save")
    Call<FormCrf6> postCrf6(@Body FormCrf6 body);


}
