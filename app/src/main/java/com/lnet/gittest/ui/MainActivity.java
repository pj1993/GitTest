package com.lnet.gittest.ui;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnet.gittest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 用fragment做
 * fragmenttablehost进行切换
 * 4个fragment之间切换，内容画在每一个对应的fragment上
 * 一个星期，把这个东西画完
 * fragmenttablehost不会用的话先百度一下，还是不会玩，我帮你搭一下,2,3,4
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    @Override
    public void onClick(View v) {

    }
    public void btnAccout(View view)
    {
        Intent intent=new Intent(this,AccoutActivity.class);
        startActivity(intent);
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
}
