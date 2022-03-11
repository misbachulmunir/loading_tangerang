package id.tangerang.loadingtangerang;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class LoadingCustom {
    private final Context context;
    private ProgressDialog progressDialog;
    private Boolean cancelable;
    private Boolean cancelableoutdialog;
    private int drawable;

    public LoadingCustom(Context context, Boolean cancelable, Boolean cancelableoutdialog, int drawablegif ) {
        this.context = context;
        progressDialog = new ProgressDialog(context);
        this.cancelable = cancelable;
        this.cancelableoutdialog = cancelableoutdialog;
        this.drawable = drawablegif;
    }
    public void showDialog() {
        progressDialog.setCanceledOnTouchOutside(cancelableoutdialog);
        progressDialog.show();
        progressDialog.setCancelable(cancelable);
        View view = View.inflate(context,R.layout.loading_gif,null);
        ImageView imageView = view.findViewById(R.id.imageView);
        Glide
                .with(context)
                .load(drawable)
                .centerCrop()
                .into(imageView);
        progressDialog.setContentView(view);

        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }
    public void dismissDialog() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
