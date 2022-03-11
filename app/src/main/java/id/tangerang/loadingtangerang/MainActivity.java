package id.tangerang.loadingtangerang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonView;
    MainActivity context = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonView = findViewById(R.id.buttonView);
        LoadingCustom loadingBiasa = new LoadingCustom(context,true,true,R.drawable.chibi);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadingBiasa.showDialog();
            }
        });
    }
}