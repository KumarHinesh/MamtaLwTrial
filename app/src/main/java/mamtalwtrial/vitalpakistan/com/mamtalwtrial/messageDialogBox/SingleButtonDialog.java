package mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;

/**
 * Created by Hknar on 5/16/2018.
 */

public class SingleButtonDialog {


    SingleButtonDialog(Context context, String message){

    }



    public  static void singleBtnDialog(Context context, String engMessage, String romanEng){

        Button btnConform;
        TextView tv_engText, tv_RomanEngText;

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.single_btn_dialog);
        dialog.setCancelable(false);

        btnConform = (Button) dialog.findViewById(R.id.btnok);

        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        tv_engText.setText(engMessage);
        tv_RomanEngText.setText(romanEng);

        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

            }
        });

    dialog.show();
    }


   /* */






}
