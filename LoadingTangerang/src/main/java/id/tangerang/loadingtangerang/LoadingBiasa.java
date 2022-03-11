package id.tangerang.loadingtangerang;

import android.app.ProgressDialog;
import android.content.Context;
public class LoadingBiasa {
    private final Context context;
    private ProgressDialog progressDialog;
    private Boolean cancelable;
    private Boolean cancelableoutdialog;

    public LoadingBiasa(Context context,Boolean cancelable,Boolean cancelableoutdialog) {
        this.context = context;
        progressDialog = new ProgressDialog(context);
        this.cancelable = cancelable;
        this.cancelableoutdialog = cancelableoutdialog;
    }
    public void showDialog() {
        progressDialog.setCanceledOnTouchOutside(cancelableoutdialog);
        progressDialog.show();
        progressDialog.setCancelable(cancelable);
        progressDialog.setContentView(R.layout.loading);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }
    public void dismissDialog() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
