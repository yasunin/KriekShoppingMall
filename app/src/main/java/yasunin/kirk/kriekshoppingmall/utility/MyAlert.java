package yasunin.kirk.kriekshoppingmall.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import yasunin.kirk.kriekshoppingmall.R;

/**
 * Created by fany on 3/6/2018.
 */

public class MyAlert {


    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }


    public void myDialog(String titleString, String messsgeString){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(titleString);
        builder.setMessage(messsgeString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        builder.show();
    }


}  //Main Calss
