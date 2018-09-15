package mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CounselingCRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hknar on 5/16/2018.
 */

public class SendDataToServer {

    static boolean b = false;

        /*public  static  boolean sendCrf1Form(FormCrf1DTO formCrf1DTO) {

            APIService mAPIService = ApiUtils.getAPIService();

            mAPIService.sendCrf1Form(formCrf1DTO).enqueue(new Callback<FormCrf1DTO>() {
                @Override
                public void onResponse(Call<FormCrf1DTO> call, Response<FormCrf1DTO> response) {

                    if(response.code()==200){

                    }else {

                      //  SaveAndReadInternalData.saveCrf1FormInternal(,new Gson().toJson(formCrf1DTO, FormCrf1DTO.class));\
                    }
                }
                @Override
                public void onFailure(Call<FormCrf1DTO> call, Throwable t) {

                }
            });
            return b;
        }*/
        //final FormCrf1DTO dto;

  /*  public  static  void sendCrf1MultiForm(FormCrf1CollectionDTO formCrf1CollectionDTO){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf1DTO dto;
        mAPIService.sendCrf1ListToServer(formCrf1CollectionDTO).enqueue(new Callback<FormCrf1CollectionDTO>() {
            @Override
            public void onResponse(Call<FormCrf1CollectionDTO> call, Response<FormCrf1CollectionDTO> response) {

              *//*  if(response.body()){


                }*//*

            }

            @Override
            public void onFailure(Call<FormCrf1CollectionDTO> call, Throwable t) {

            }
        });

        }*/



    public  static  void sendCrf2Form(final Context context, final FormCrf2DTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf2(body).enqueue(new Callback<FormCrf2DTO>() {

            @Override
            public void onResponse(Call<FormCrf2DTO> call, Response<FormCrf2DTO> response) {

                if(response.code()!=200){

                   // SaveAndReadInternalData.saveCrf2And3AllFormInternal(context, new Gson().toJson(body, FormCrf2DTO.class));
                }

                Log.e("Geting Responce", "Sucsesfulluy submited"+response);
            }

            @Override
            public void onFailure(Call<FormCrf2DTO> call, Throwable t) {

              //  SaveAndReadInternalData.saveCrf2And3AllFormInternal(context, new Gson().toJson(body, FormCrf2DTO.class));

            }
        });

    }

    public  static  void sendCrf3aForm(FormCrf3aDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf3a(body).enqueue(new Callback<FormCrf3aDTO>() {
            @Override
            public void onResponse(Call<FormCrf3aDTO> call, Response<FormCrf3aDTO> response) {

                Log.d("responce", response+"0008");

            }

            @Override
            public void onFailure(Call<FormCrf3aDTO> call, Throwable t) {

                Log.d("responce", t+"0009");

            }
        });


    }



    public  static  void sendCrf3bForm(FormCrf3bDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf3b(body).enqueue(new Callback<FormCrf3bDTO>() {
            @Override
            public void onResponse(Call<FormCrf3bDTO> call, Response<FormCrf3bDTO> response) {

            }

            @Override
            public void onFailure(Call<FormCrf3bDTO> call, Throwable t) {

            }
        });

    }


    public  static  void sendCrf3cForm(FormCrf3cDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf3c(body).enqueue(new Callback<FormCrf3cDTO>() {
            @Override
            public void onResponse(Call<FormCrf3cDTO> call, Response<FormCrf3cDTO> response) {

            }

            @Override
            public void onFailure(Call<FormCrf3cDTO> call, Throwable t) {

            }
        });

    }




}
