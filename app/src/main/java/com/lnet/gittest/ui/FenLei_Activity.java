package com.lnet.gittest.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lnet.gittest.R;

public class FenLei_Activity extends AppCompatActivity implements View.OnClickListener{
    static final int COLOR1 = Color.parseColor("#FFF2F4F2");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fen_lei_);

        findViewById(R.id.tv_pragromdevelopment).setOnClickListener(this);
        findViewById(R.id.tv_productanddesign).setOnClickListener(this);
        findViewById(R.id.tv_lifestyle).setOnClickListener(this);
        findViewById(R.id.tv_professiondevelopment).setOnClickListener(this);
        findViewById(R.id.tv_maketmanangerment).setOnClickListener(this);
        findViewById(R.id.tv_officerate).setOnClickListener(this);

    }

    FragmentManager fm=getFragmentManager();
    FragmentTransaction ft= fm.beginTransaction();
    public void show(int position){

        TextView textView=(TextView) findViewById(R.id.tv_officerate);
        textView.setBackgroundColor(COLOR1);
        ContentFragment cf2=ContentFragment.getInstance(position);
        ft.replace(R.id.fl_content,cf2);
        ft.commit();
    }
    @Override
    public void onClick(View v) {
        int position;
            switch (v.getId()) {
                case R.id.tv_pragromdevelopment:
                    position = 1;
                    show(position);
                    break;
                case R.id.tv_officerate:
                    position = 0;
                    show(position);
                    break;
                case R.id.tv_productanddesign:
                    position = 2;
                    show(position);
                    break;
                case R.id.tv_lifestyle:
                    position = 3;
                    show(position);
                    break;
                case R.id.tv_professiondevelopment:
                    position = 4;
                    show(position);
                    break;
                case R.id.tv_maketmanangerment:
                    position = 5;
                    show(position);
                    break;
            }

    }
}
