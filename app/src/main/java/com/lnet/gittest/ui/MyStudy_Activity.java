package com.lnet.gittest.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lnet.gittest.R;

public class MyStudy_Activity extends AppCompatActivity implements View.OnClickListener{

    static final int COLOR1 = Color.parseColor("#FFF2F4F2");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_study_);


        findViewById(R.id.tv_mystudypage).setOnClickListener(this);
    }

    FragmentManager fm1=getFragmentManager();
    FragmentTransaction ft1= fm1.beginTransaction();
    public  void showmian(int position){

        TextView textView=(TextView) findViewById(R.id.tv_officerate);
        textView.setBackgroundColor(COLOR1);
        ContentFragment2 cf2=ContentFragment2.getInstance(position);
        ft1.replace(R.id.fl1_content,cf2);
        ft1.commit();
    }
    @Override
    public void onClick(View v) {

        int position=0;
        switch (v.getId())
        {
            case R.id.tv_mystudypage:
                position=0;
                showmian(position);

        }

    }
}
