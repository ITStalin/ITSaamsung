package task;

import android.content.Context;
import android.widget.Toast;

public class Stub {
      public static void show(Context context, String message)
      {
    	  Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
    	  toast.show();
      }
      
}
