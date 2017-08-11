package com.lnet.gittest.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lnet.gittest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 用fragment做
 * fragmenttablehost进行切换
 * 4个fragment之间切换，内容画在每一个对应的fragment上
 * 一个星期，把这个东西画完
 * fragmenttablehost不会用的话先百度一下，还是不会玩，我帮你搭一下,2,3,4,5
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static final int COLOR1 = Color.parseColor("#FFF2F4F2");
    private Button bt_accout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        bt_accout = (Button) findViewById(R.id.bt_accout);
//        bt_accout.setOnClickListener(this);
//        findViewById(R.id.bt_firstpage).setOnClickListener(this);


//        findViewById(R.id.tv_mystudypage).setOnClickListener(this);
        findViewById(R.id.tv_firstpage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=0;
                switch (v.getId())
                {
                    case R.id.tv_firstpage:
                        position=0;
                        showmian(position);
                        break;
                }
            }
        });

    }


    



//    public void btnFirst(View view)
//    {
//        Intent intent=new Intent(this,First_Activity.class);
//        startActivity(intent);
//    }
//    public void btnfenlei(View view) {
//        Intent intent = new Intent(this, FenLei_Activity.class);
//        startActivity(intent);
//    }

    public  void showmian(int position){

        FragmentManager fm1=getFragmentManager();
        FragmentTransaction ft1= fm1.beginTransaction();
        TextView textView=(TextView) findViewById(R.id.tv_officerate);
        textView.setBackgroundColor(COLOR1);
        ContentFragment cf2=ContentFragment.getInstance(position);
        ft1.replace(R.id.fl_content,cf2);
        ft1.commit();
    }
    @Override
    public void onClick(View v) {


    }

    //@Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.bt_accout:
//                Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.bt_firstpage:
//                Toast.makeText(this, "bbbb", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }
}
