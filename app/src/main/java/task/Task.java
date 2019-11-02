package task;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Task {
      public static void showMessage(Context context, String message)
      {
    	  AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(context);
    	  dlgAlert.setMessage(message);
    	  dlgAlert.setTitle("Задание");
    	  dlgAlert.setPositiveButton("OK", null);
    	  dlgAlert.setCancelable(true);
    	  dlgAlert.setPositiveButton("Ok",
    			    new DialogInterface.OnClickListener() {
    			        public void onClick(DialogInterface dialog, int which) {
    			         
    			        }
    			    });
    	  dlgAlert.create().show();
      }
      
}
