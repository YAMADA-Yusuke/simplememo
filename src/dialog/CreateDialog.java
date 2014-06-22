package dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;

public class CreateDialog {

	public void simpleDialog(Activity a, String message) {
		Builder b = new AlertDialog.Builder(a);
		b.setTitle(message);
		b.show();
	}

	public void btnDialog(Activity a, String message,
			DialogInterface.OnClickListener positiveL,
			DialogInterface.OnClickListener negativeL) {
		Builder b = new AlertDialog.Builder(a);
		b.setTitle(message);
		b.setPositiveButton("Yes", positiveL);
		b.setNegativeButton("No", negativeL);
		b.show();
	}

}
