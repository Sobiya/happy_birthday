package app.com.example.android.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView atxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        atxt=(TextView) findViewById(R.id.textView4);
        Bundle bundle=getIntent().getExtras();
        String data=bundle.getString("custom-tag");
        if (data != null) {
            atxt.setText(data);
        }


    }
}
