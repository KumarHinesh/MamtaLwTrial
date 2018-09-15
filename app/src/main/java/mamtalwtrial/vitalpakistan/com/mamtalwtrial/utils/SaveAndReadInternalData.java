package mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils;

import android.content.Context;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowUpsCollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF4AllAnd5ADTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF5bCollectionsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF6CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf2toCrf3AllCollection;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Forms4AllAnd5ACollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.ArmReadingDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5bDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;

public  class SaveAndReadInternalData {


    static  final String FORM_COMPLETE_STATUS_FILE_NAME = "comp_form_report";
    static  final String FORM_INCOMPLETED_STATUS_FILE_NAME = "incomp_form_report";
    static  final String TASK_COMPLETED_STATUS_FILE_NAME = "comp_task_report";
    static  final String FOLLOWUPUS_FILE_NAME_NEW = "new_FollowUps";
    static  final String FOLLOWUPS_FILE_NAME = "followUps";
    static  final String CRF1_FORMS_FILE_NAME = "crf1_forms";
    static  final String CRF2_3ALL_FORMS_FILE_NAME = "crf2_3All_forms";
    static  final String CRF4A_4B_5A_FILE_NAME = "crf_4All_5a_froms";
    static  final String CRF5B_FILE_NAME = "crf_5b_forms";
    static  final String CRF6_FILE_NAME = "crf_6_forms";

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

    //perfect working crf1 saving from
    public static void saveCrf1FormInternal(Context context, FormCrf1DTO formCrf1DTO){

        FormCrf1CollectionDTO formCrf1CollectionDTO = new FormCrf1CollectionDTO();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf1CollectionDTO = new Gson().fromJson(temp,FormCrf1CollectionDTO.class);


        }
        catch(Exception e){
        }

        if(formCrf1CollectionDTO.getForms()!=null){
            formCrf1CollectionDTO.getForms().add(formCrf1DTO);
        }else {
            ArrayList<FormCrf1DTO> arrayList = new ArrayList<FormCrf1DTO>();
            arrayList.add(formCrf1DTO);
            formCrf1CollectionDTO.setForms(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(CRF1_FORMS_FILE_NAME, Context.MODE_PRIVATE);
            outputStream.write((new Gson().toJson(formCrf1CollectionDTO)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //perfect working crf1 getAll forms
    public static FormCrf1CollectionDTO getSavedCrf1FromsList(Context context){

     //   List<FormCrf1DTO> list =null;// = new List<FormCrf1DTO>();

        FormCrf1CollectionDTO formCrf1CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf1CollectionDTO = new Gson().fromJson(temp,FormCrf1CollectionDTO.class);


        }
        catch(Exception e){
        }

        return formCrf1CollectionDTO;
    }

    //perfect working crf1 delete by index wise
    public static boolean deleteCrf1FromIndex(Context context, int index){

        FormCrf1DTO formCrf1DTO = null;
        FormCrf1CollectionDTO formCrf1CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf1CollectionDTO = new Gson().fromJson(temp, FormCrf1CollectionDTO.class);

        }
        catch(Exception e){
        }

        if(formCrf1CollectionDTO!=null){

           formCrf1DTO =  formCrf1CollectionDTO.getForms().remove(index);


            try {
                FileOutputStream outputStream = context.openFileOutput(CRF1_FORMS_FILE_NAME, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(formCrf1CollectionDTO)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(formCrf1DTO!=null)
            return true;
        else
            return false;

    }

    //perfect working crf1 no of all forms
    public static int numOfCrf1Forms(Context context){

        FormCrf1CollectionDTO formCrf1CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf1CollectionDTO = new Gson().fromJson(temp, FormCrf1CollectionDTO.class);

        }
        catch(Exception e){
        }

        if(formCrf1CollectionDTO==null)
            return -1;
        else
            return formCrf1CollectionDTO.getForms().size();

    }

    //perfect working crf2 to 3 all
    public static void saveCrf2And3AllForms(Context context, FormsCrf2AndCrf3All formsCrf2AndCrf3All){

        FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection = new FormCrf2toCrf3AllCollection();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF2_3ALL_FORMS_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf2toCrf3AllCollection = new Gson().fromJson(temp,FormCrf2toCrf3AllCollection.class);


        }
        catch(Exception e){
        }

        if(formCrf2toCrf3AllCollection.getForms()!=null){
            formCrf2toCrf3AllCollection.getForms().add(formsCrf2AndCrf3All);
        }else {
            ArrayList<FormsCrf2AndCrf3All> arrayList = new ArrayList<FormsCrf2AndCrf3All>();
            arrayList.add(formsCrf2AndCrf3All);
            formCrf2toCrf3AllCollection.setForms(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(CRF2_3ALL_FORMS_FILE_NAME, Context.MODE_APPEND);
            outputStream.write((new Gson().toJson(formCrf2toCrf3AllCollection)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //perfect working crf2 to 3 all
    public static FormCrf2toCrf3AllCollection getSavedCrf2toCrf3AllCollection(Context context){

        //   List<FormCrf1DTO> list =null;// = new List<FormCrf1DTO>();

        FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF2_3ALL_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf2toCrf3AllCollection =  new Gson().fromJson(temp,FormCrf2toCrf3AllCollection.class);


        }
        catch(Exception e){
        }

        return formCrf2toCrf3AllCollection;
    }

    //perfect working crf2 to 3 all
    public static boolean deleteCrf2And3AllFromIndex(Context context, int index){

        FormsCrf2AndCrf3All formsCrf2AndCrf3All = null;
        FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF2_3ALL_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf2toCrf3AllCollection = new Gson().fromJson(temp, FormCrf2toCrf3AllCollection.class);

        }
        catch(Exception e){
        }

        if(formCrf2toCrf3AllCollection!=null){

            formsCrf2AndCrf3All =  formCrf2toCrf3AllCollection.getForms().remove(index);


            try {
                FileOutputStream outputStream = context.openFileOutput(CRF2_3ALL_FORMS_FILE_NAME, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(formCrf2toCrf3AllCollection)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(formsCrf2AndCrf3All!=null)
            return true;
        else
            return false;

    }

    //perfect working crf2 to 3 all
    public static int numOfCrf2And3AllForms(Context context){

        FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF2_3ALL_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCrf2toCrf3AllCollection = new Gson().fromJson(temp, FormCrf2toCrf3AllCollection.class);

        }
        catch(Exception e){
        }

        if(formCrf2toCrf3AllCollection==null)
            return -1;
        else
            return formCrf2toCrf3AllCollection.getForms().size();

    }

    //perfect working crf5b saving from
    public static void saveCrf5bFormInternal(Context context, FormCrf5b formCrf5b){

        FormCRF5bCollectionsDTO formCRF5bCollectionsDTO = new FormCRF5bCollectionsDTO();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF5B_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF5bCollectionsDTO = new Gson().fromJson(temp,FormCRF5bCollectionsDTO.class);


        }
        catch(Exception e){
        }

        if(formCRF5bCollectionsDTO.getForms()!=null){
            formCRF5bCollectionsDTO.getForms().add(formCrf5b);
        }else {
            ArrayList<FormCrf5b> arrayList = new ArrayList<FormCrf5b>();
            arrayList.add(formCrf5b);
            formCRF5bCollectionsDTO.setForms(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(CRF5B_FILE_NAME, Context.MODE_PRIVATE);
            outputStream.write((new Gson().toJson(formCRF5bCollectionsDTO)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //perfect working crf5b getAll forms
    public static FormCRF5bCollectionsDTO getSavedCrf5bFromsList(Context context){


        FormCRF5bCollectionsDTO formCRF5bCollectionsDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF5B_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF5bCollectionsDTO = new Gson().fromJson(temp,FormCRF5bCollectionsDTO.class);


        }
        catch(Exception e){
        }

        return formCRF5bCollectionsDTO;
    }

    //perfect working crf5b delete by index wise
    public static boolean deleteCrf5bFromIndex(Context context, int index){

        FormCrf5b formCrf5b = null;
        FormCRF5bCollectionsDTO formCRF5bCollectionsDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF5B_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF5bCollectionsDTO = new Gson().fromJson(temp, FormCRF5bCollectionsDTO.class);

        }
        catch(Exception e){
        }

        if(formCRF5bCollectionsDTO!=null){

            formCrf5b =  formCRF5bCollectionsDTO.getForms().remove(index);


            try {
                FileOutputStream outputStream = context.openFileOutput(CRF5B_FILE_NAME, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(formCRF5bCollectionsDTO)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(formCrf5b!=null)
            return true;
        else
            return false;

    }

    //perfect working crf5b no of all forms
    public static int numOfCrf5bForms(Context context){

        FormCRF5bCollectionsDTO formCRF5bCollectionsDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF5B_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF5bCollectionsDTO = new Gson().fromJson(temp, FormCRF5bCollectionsDTO.class);

        }
        catch(Exception e){
        }

        if(formCRF5bCollectionsDTO==null)
            return -1;
        else
            return formCRF5bCollectionsDTO.getForms().size();

    }

    //perfect working crf6 saving from
    public static void saveCrf6FormInternal(Context context, FormCrf6 formCrf6){

        FormCRF6CollectionDTO formCRF6CollectionDTO = new FormCRF6CollectionDTO();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF6_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF6CollectionDTO = new Gson().fromJson(temp,FormCRF6CollectionDTO.class);


        }
        catch(Exception e){
        }

        if(formCRF6CollectionDTO.getForms()!=null){
            formCRF6CollectionDTO.getForms().add(formCrf6);
        }else {
            ArrayList<FormCrf6> arrayList = new ArrayList<FormCrf6>();
            arrayList.add(formCrf6);
            formCRF6CollectionDTO.setForms(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(CRF6_FILE_NAME, Context.MODE_PRIVATE);
            outputStream.write((new Gson().toJson(formCRF6CollectionDTO)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //perfect working crf6 getAll forms
    public static FormCRF6CollectionDTO getSavedCrf6FromsList(Context context){


        FormCRF6CollectionDTO formCRF6CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF6_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF6CollectionDTO = new Gson().fromJson(temp,FormCRF6CollectionDTO.class);


        }
        catch(Exception e){
        }

        return formCRF6CollectionDTO;
    }

    //perfect working crf6 delete by index wise
    public static boolean deleteCrf6FromIndex(Context context, int index){

        FormCrf6 formCrf6 = null;
        FormCRF6CollectionDTO formCRF6CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF6_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF6CollectionDTO = new Gson().fromJson(temp, FormCRF6CollectionDTO.class);

        }
        catch(Exception e){
        }

        if(formCRF6CollectionDTO!=null){

            formCrf6 =  formCRF6CollectionDTO.getForms().remove(index);


            try {
                FileOutputStream outputStream = context.openFileOutput(CRF6_FILE_NAME, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(formCRF6CollectionDTO)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(formCrf6!=null)
            return true;
        else
            return false;

    }

    //perfect working crf6 no of all forms
    public static int numOfCrf6Forms(Context context){

        FormCRF6CollectionDTO formCRF6CollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF6_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRF6CollectionDTO = new Gson().fromJson(temp, FormCRF6CollectionDTO.class);

        }
        catch(Exception e){
        }

        if(formCRF6CollectionDTO==null)
            return -1;
        else
            return formCRF6CollectionDTO.getForms().size();

    }

    //perfect working crf4all and 5a saving from
    public static void saveCrf4AllAnd5AFormInternal(Context context, FormCRF4AllAnd5ADTO formCRF4AllAnd5ADTO){

        Forms4AllAnd5ACollectionDTO formCRForms4AllAnd5ACollectionDTO = new Forms4AllAnd5ACollectionDTO();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF4A_4B_5A_FILE_NAME);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            formCRForms4AllAnd5ACollectionDTO = new Gson().fromJson(temp,Forms4AllAnd5ACollectionDTO.class);


        }
        catch(Exception e){
        }

        if(formCRForms4AllAnd5ACollectionDTO.getForms()!=null){
            formCRForms4AllAnd5ACollectionDTO.getForms().add(formCRF4AllAnd5ADTO);
        }else {
            ArrayList<FormCRF4AllAnd5ADTO> arrayList = new ArrayList<FormCRF4AllAnd5ADTO>();
            arrayList.add(formCRF4AllAnd5ADTO);
            formCRForms4AllAnd5ACollectionDTO.setForms(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(CRF4A_4B_5A_FILE_NAME, Context.MODE_PRIVATE);
            outputStream.write((new Gson().toJson(formCRForms4AllAnd5ACollectionDTO)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //perfect working crf4all and 5a getAll forms
    public static Forms4AllAnd5ACollectionDTO getSavedCrf4AllAnd5AFromsList(Context context){


        Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF4A_4B_5A_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            forms4AllAnd5ACollectionDTO = new Gson().fromJson(temp,Forms4AllAnd5ACollectionDTO.class);

        }
        catch(Exception e){
        }

        return forms4AllAnd5ACollectionDTO;
    }

    //perfect working crf4all and 5a delete by index wise
    public static boolean deleteCrf4AllAnd5AFromIndex(Context context, int index){

        FormCRF4AllAnd5ADTO formCRF4AllAnd5ADTO = null;
        Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF4A_4B_5A_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            forms4AllAnd5ACollectionDTO = new Gson().fromJson(temp, Forms4AllAnd5ACollectionDTO.class);

        }
        catch(Exception e){
        }

        if(formCRF4AllAnd5ADTO!=null){

            formCRF4AllAnd5ADTO =  forms4AllAnd5ACollectionDTO.getForms().remove(index);


            try {
                FileOutputStream outputStream = context.openFileOutput(CRF4A_4B_5A_FILE_NAME, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(forms4AllAnd5ACollectionDTO)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(formCRF4AllAnd5ADTO!=null)
            return true;
        else
            return false;

    }

    //perfect working crf4all and 5a no of all forms
    public static int numOfCrf4AllAnd5AForms(Context context){

        Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF4A_4B_5A_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            forms4AllAnd5ACollectionDTO = new Gson().fromJson(temp, Forms4AllAnd5ACollectionDTO.class);

        }
        catch(Exception e){
        }

        if(forms4AllAnd5ACollectionDTO==null)
            return -1;
        else
            return forms4AllAnd5ACollectionDTO.getForms().size();

    }

    //perfect working followups saving
    public static void saveFollowUpsInternal(Context context, FollowupsDTO followupsDTO){

        FollowUpsCollectionDTO followUpsCollectionDTO = new FollowUpsCollectionDTO();

        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(FOLLOWUPUS_FILE_NAME_NEW);
            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            followUpsCollectionDTO = new Gson().fromJson(temp,FollowUpsCollectionDTO.class);


        }
        catch(Exception e){
        }

        if(followUpsCollectionDTO.getFollowUpsCollection()!=null){
            followUpsCollectionDTO.getFollowUpsCollection().add(followupsDTO);
        }else {
            ArrayList<FollowupsDTO> arrayList = new ArrayList<FollowupsDTO>();
            arrayList.add(followupsDTO);
            followUpsCollectionDTO.setFollowUpsCollection(arrayList);
        }



        try {
            FileOutputStream outputStream = context.openFileOutput(FOLLOWUPUS_FILE_NAME_NEW, Context.MODE_PRIVATE);
            outputStream.write((new Gson().toJson(followUpsCollectionDTO)).getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //perfect working followups getAll followups
    public static FollowUpsCollectionDTO getSavedFollowUpsList(Context context){

        FollowUpsCollectionDTO followUpsCollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(FOLLOWUPUS_FILE_NAME_NEW);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            followUpsCollectionDTO = new Gson().fromJson(temp, FollowUpsCollectionDTO.class);

        }
        catch(Exception e){
        }

        return followUpsCollectionDTO;
    }

    //perfect working followups delete by index wise
    public static boolean deleteFollowUpsByIndex(Context context, int index){

        FollowupsDTO followupsDTO = null;
        FollowUpsCollectionDTO followUpsCollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(FOLLOWUPUS_FILE_NAME_NEW);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            followUpsCollectionDTO = new Gson().fromJson(temp, FollowUpsCollectionDTO.class);

        }
        catch(Exception e){
        }

        if(followUpsCollectionDTO!=null){

            followupsDTO = followUpsCollectionDTO.getFollowUpsCollection().remove(index);

            try {
                FileOutputStream outputStream = context.openFileOutput(FOLLOWUPUS_FILE_NAME_NEW, Context.MODE_PRIVATE);
                outputStream.write((new Gson().toJson(followUpsCollectionDTO)).getBytes());
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



        if(followupsDTO!=null)
            return true;
        else
            return false;

    }

    //perfect working followups no of all followups
    public static int numOfFollowUps(Context context){

        FollowUpsCollectionDTO followUpsCollectionDTO = null;
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(FOLLOWUPUS_FILE_NAME_NEW);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            followUpsCollectionDTO = new Gson().fromJson(temp, FollowUpsCollectionDTO.class);

        }
        catch(Exception e){
        }

        if(followUpsCollectionDTO==null)
            return -1;
        else
            return followUpsCollectionDTO.getFollowUpsCollection().size();

    }



    /*public static void saveCrf2And3AllFormInternal(Context context, String fileMessage){

        try {

            FileOutputStream outputStream = context.openFileOutput(CRF2_3ALL_FORMS_FILE_NAME, Context.MODE_PRIVATE);
            outputStream.write((fileMessage+"<<").getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/


 /*   public static FormCrf2toCrf3AllCollection getListOfCrf2ToCrf3All(Context context){

        FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection  = null;

        try {

            File file = new File(context.getFilesDir(), CRF2_3ALL_FORMS_FILE_NAME);

            FileInputStream fin =  context.openFileInput(CRF2_3ALL_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            Gson gson = new Gson();

            if(!temp.equalsIgnoreCase("")){

                  formCrf2toCrf3AllCollection = gson.fromJson(temp,FormCrf2toCrf3AllCollection.class);
            }

        }
        catch(Exception e){

        }
        return formCrf2toCrf3AllCollection;
    }*/


   /* public static void uploadData(Context context){

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

    }*/

    public static FormCrf1CollectionDTO getCrf1Data(Context context){

        FormCrf1CollectionDTO formCrf1CollectionDTO = new FormCrf1CollectionDTO();
        ArrayList<FormCrf1DTO> list = new ArrayList<FormCrf1DTO>();
        String[] stringArrayOfObject = null;

        try {
            FileInputStream fin =  context.openFileInput(CRF1_FORMS_FILE_NAME);

            int c;
            String temp="";
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }

            stringArrayOfObject = temp.split("<<");

            for(int i = 0; i<stringArrayOfObject.length; i++){

                list.add(new Gson().fromJson(stringArrayOfObject[i],FormCrf1DTO.class));
            }

            formCrf1CollectionDTO.setForms(list);
        }
        catch(Exception e){
        }

        return formCrf1CollectionDTO;
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
