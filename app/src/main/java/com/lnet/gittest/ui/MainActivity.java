package com.lnet.gittest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.lnet.gittest.R;

/**
 * 用fragment做
 * fragmenttablehost进行切换
 * 4个fragment之间切换，内容画在每一个对应的fragment上
 * 一个星期，把这个东西画完
 * fragmenttablehost不会用的话先百度一下，还是不会玩，我帮你搭一下,2
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
}
