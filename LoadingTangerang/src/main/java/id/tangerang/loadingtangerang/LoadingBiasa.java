package id.tangerang.loadingtangerang;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

public class LoadingBiasa {
    private final Context context;
    private ProgressDialog progressDialog;

    public LoadingBiasa(Context context) {
        this.context = context;
        progressDialog = new ProgressDialog(context);
    }


    public void showDialog() {
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        progressDialog.setCancelable(false);
        progressDialog.setContentView(R.layout.loading);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }



    public void dismissDialog() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    public void toastError() {
        Toast.makeText(context, "Terjadi kesalahan.", Toast.LENGTH_SHORT).show();
    }


    public double parseDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            Toast.makeText(context, "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
            return 0;
        }
    }
}
