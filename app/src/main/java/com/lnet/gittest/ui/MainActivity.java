package com.lnet.gittest.ui;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lnet.gittest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private TextView tv_1;
    private TextView tv_2;
    private SharedPreferences sp1;
    private SharedPreferences.Editor edit1;
    private SharedPreferences sp2;
    private SharedPreferences.Editor edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = getSharedPreferences("11111111", MODE_PRIVATE);
        edit1 = sp1.edit();
        sp2 = getSharedPreferences("22222222", MODE_PRIVATE);
        edit2 = sp2.edit();


        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);

        tv_1.setText(sp1.getString("test",""));
        tv_2.setText(sp2.getString("test",""));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_1:
                edit1.putString("test","111111");
                edit1.apply();
                break;
            case R.id.bt_2:
                edit2.putString("test","222222");
                edit2.apply();
                break;
        }
    }
}
