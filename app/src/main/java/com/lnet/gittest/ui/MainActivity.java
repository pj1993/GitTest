package com.lnet.gittest.ui;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


    private Button bt_accout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        bt_accout = (Button) findViewById(R.id.bt_accout);
//        bt_accout.setOnClickListener(this);
//        findViewById(R.id.bt_firstpage).setOnClickListener(this);


    }


    



    public void btnFirst(View view)
    {
        Intent intent=new Intent(this,First_Activity.class);
        startActivity(intent);
    }
    public void btnfenlei(View view) {
        Intent intent = new Intent(this, FenLei_Activity.class);
        startActivity(intent);
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
