package appewtc.masterung.ungrestaurant;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by com1test on 21/3/2559.
 */
public class Mynittaya {

    public void mynittaya(Context context,
                          String strTitle,
                          String strMassage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.danger);
        builder.setTitle(strTitle);
        builder.setMessage(strMassage);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

        }



}//main class

