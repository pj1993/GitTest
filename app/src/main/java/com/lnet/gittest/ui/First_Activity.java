package com.lnet.gittest.ui;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
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

public class First_Activity extends AppCompatActivity {
    ViewPager vp;
    List<View> lists;
    int i=0;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
//            switch (msg.what) {
//                case
//            }case
            i++;
            vp.setCurrentItem(i%3);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_);


        vp=(ViewPager) findViewById(R.id.vp);
        lists=new ArrayList<View>();


        View page1= LayoutInflater.from(this).inflate(R.layout.page1_layout,null);
        View page2= LayoutInflater.from(this).inflate(R.layout.page2_layout,null);
        View page3= LayoutInflater.from(this).inflate(R.layout.page3_layout,null);

        lists.add(page1);
        lists.add(page2);
        lists.add(page3);

        MyPagerAdapter adapter=new MyPagerAdapter();
        vp.setAdapter(adapter);



        new Thread(){
            @Override
            public void run() {
                super.run();
                while (true)
                {
                    handler.sendEmptyMessage(1);
//                    Message msg = handler.obtainMessage();
//                    msg.what=3;
//                    handler.sendMessage(msg);
                    SystemClock.sleep(2000);
                }
            }
        }.start();
    }

    private class MyPagerAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view= lists.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view= lists.get(position);
            container.removeView(view);
        }

        @Override
        public int getCount() {
            return lists.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }


    }
}
