package mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;

public  class SaveAndReadInternalData {


    static  final String FORM_COMPLETE_STATUS_FILE_NAME = "comp_form_report";
    static  final String FORM_INCOMPLETED_STATUS_FILE_NAME = "incomp_form_report";
    static  final String TASK_COMPLETED_STATUS_FILE_NAME = "comp_task_report";
    static  final String FOLLOWUPS_FILE_NAME = "followUps";
    static  final String CRF1_FORMS_FILE_NAME = "crf1_forms";
    static  final String CRF2_FORMS_FILE_NAME = "crf2_forms";


    public static ArrayList<FollowupsDTO> getFollowUpsList(Context context){

        ArrayList<FollowupsDTO> listOfFollowUps = new ArrayList<FollowupsDTO>();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(FOLLOWUPS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            stringArrayOfObject = temp.split("<<");


            Gson gson = new Gson();

            if(stringArrayOfObject != null && stringArrayOfObject[0]!=""){


                for (int i = 0; i<stringArrayOfObject.length; i++){

                    listOfFollowUps.add(gson.<FollowupsDTO>fromJson(stringArrayOfObject[i],FollowupsDTO.class));
                }
            }

        }
        catch(Exception e){
        }


        return listOfFollowUps;
    }

    public static void deleteFollowUpFromList(Context context, int position){

        ArrayList<FollowupsDTO> arrayList = getFollowUpsList(context);
        ArrayList<String> jsonObjList = new ArrayList<String>();


               arrayList.remove(position);
          // }

           for(int i =0; i< arrayList.size(); i++){

               jsonObjList.add(new Gson().toJson(arrayList.get(i)));

           }

           saveFollowUpsList(context,jsonObjList);
    }


    public static void saveFollowUpsList(Context context, ArrayList<String> jsonObj){

        try {

            File file = new File(context.getFilesDir(), FOLLOWUPS_FILE_NAME);
            file.delete();

            FileOutputStream outputStream = context.openFileOutput(FOLLOWUPS_FILE_NAME, Context.MODE_APPEND);

            for(int i =0; i<jsonObj.size(); i++){
                outputStream.write((jsonObj.get(i)+"<<").getBytes());
            }

            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveCrf1FormInternal(Context context, String fileMessage){

        try {

            FileOutputStream outputStream = context.openFileOutput(CRF1_FORMS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((fileMessage+"<<").getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void saveCrf2FormInternal(Context context, String fileMessage){


        try {

            FileOutputStream outputStream = context.openFileOutput(CRF2_FORMS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((fileMessage+"<<").getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }




    public static void uploadData(Context context){

        String[] stringArrayOfObject = null;
        ArrayList<FormCrf1DTO> formCrf1DTOS = new ArrayList<FormCrf1DTO>();

        try {

            File file = new File(context.getFilesDir(), CRF1_FORMS_FILE_NAME);

            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            stringArrayOfObject = temp.split("<<");


            Gson gson = new Gson();

            for(int i=0; i<stringArrayOfObject.length;i++){

                //formCrf1DTOS.add(gson.fromJson(stringArrayOfObject[i],FormCrf1DTO.class));

                SendDataToServer.sendCrf1Form(gson.fromJson(stringArrayOfObject[i],FormCrf1DTO.class));

            }
        //    val = stringArrayOfObject.length;
            file.delete();


        }
        catch(Exception e){

        }

    }

    public static String[] getCrf1Data(Context context){

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            stringArrayOfObject = temp.split("<<");

        }
        catch(Exception e){
        }


        return stringArrayOfObject;
    }


    public static int isDataAvailable(Context context){

        int val = 0;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            stringArrayOfObject = temp.split("<<");

            val = stringArrayOfObject.length;

        }
        catch(Exception e){

            val =  -1;

        }

            return val;
    }


    public  static  void insertcompleteTaskStatus(Context context){

        int val;

        try {
            FileInputStream fin =  context.openFileInput(TASK_COMPLETED_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

            File file = new File(context.getFilesDir(), TASK_COMPLETED_STATUS_FILE_NAME);
            file.delete();


            FileOutputStream outputStream = context.openFileOutput(TASK_COMPLETED_STATUS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((val+"").getBytes());
            outputStream.close();

        }
        catch(Exception e){
        }

    }



    public  static  void insertIncompleteFormStatus(Context context){

        int val;

        try {
            FileInputStream fin =  context.openFileInput(FORM_INCOMPLETED_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

            File file = new File(context.getFilesDir(), FORM_INCOMPLETED_STATUS_FILE_NAME);
            file.delete();


            FileOutputStream outputStream = context.openFileOutput(FORM_INCOMPLETED_STATUS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((val+"").getBytes());
            outputStream.close();


        }
        catch(Exception e){
        }



    }


    public  static  void insertCompleteFormStatus(Context context){

        int val;

        try {
            FileInputStream fin =  context.openFileInput(FORM_COMPLETE_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

            File file = new File(context.getFilesDir(), FORM_COMPLETE_STATUS_FILE_NAME);
            file.delete();


            FileOutputStream outputStream = context.openFileOutput(FORM_COMPLETE_STATUS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((val+"").getBytes());
            outputStream.close();

        }
        catch(Exception e){
        }


    }

    public static String getCompleteFormStatus(Context context){
        int val =0;

        try {
            FileInputStream fin =  context.openFileInput(FORM_COMPLETE_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

        }
        catch(Exception e){
        }


        return ""+val;
    }


    public static String getInCompleteFormStatus(Context context){
        int val =0;

        try {
            FileInputStream fin =  context.openFileInput(FORM_INCOMPLETED_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

        }
        catch(Exception e){
        }

        return ""+val;
    }

    public static String getCompleteTaskStatus(Context context){

        int val = 0;

        try {
            FileInputStream fin =  context.openFileInput(TASK_COMPLETED_STATUS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            val = Integer.parseInt(temp);
            val++;

        }
        catch(Exception e){
        }


        return val+"";
    }

}
