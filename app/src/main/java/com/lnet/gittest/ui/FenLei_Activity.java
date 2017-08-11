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
    static final int COLOR2= Color.parseColor("#e8e8e8");

    TextView tv_pragromdevelopment;
    TextView tv_productanddesign;
    TextView tv_lifestyle;
    TextView tv_professiondevelopment;
    TextView tv_maketmanangerment;
    TextView tv_officerate;

//    View view1=(View) findViewById(R.id.view_1);
//    View view2=(View) findViewById(R.id.view_2);
//    View view3=(View) findViewById(R.id.view_3);
//    View view4=(View) findViewById(R.id.view_4);
//    View view5=(View) findViewById(R.id.view_5);
//    View view6=(View) findViewById(R.id.view_6);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fen_lei_);

        tv_pragromdevelopment=(TextView)findViewById(R.id.tv_pragromdevelopment);
        tv_pragromdevelopment.setOnClickListener(this);
        tv_productanddesign=(TextView)findViewById(R.id.tv_productanddesign);
        tv_productanddesign.setOnClickListener(this);
        tv_lifestyle=(TextView)findViewById(R.id.tv_lifestyle);
        tv_lifestyle.setOnClickListener(this);
        tv_professiondevelopment=(TextView)findViewById(R.id.tv_professiondevelopment);
        tv_professiondevelopment.setOnClickListener(this);
        tv_maketmanangerment=(TextView)findViewById(R.id.tv_maketmanangerment);
        tv_maketmanangerment.setOnClickListener(this);
        tv_officerate=(TextView)findViewById(R.id.tv_officerate);
        tv_officerate.setOnClickListener(this);



    }


    public  void show(int position){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        changeBackGround(position);

        showTheGreenLinear(position);
        ContentFragment cf2=ContentFragment.getInstance(position);
        ft.replace(R.id.fl_content,cf2);
        ft.commit();
    }



    //textview左边绿色条纹
    private void showTheGreenLinear(int position) {
        if(position==0)
        {
            findViewById(R.id.view_1).setVisibility(View.VISIBLE);
            findViewById(R.id.view_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_6).setVisibility(View.INVISIBLE);

        }
        if(position==1)
        {
            findViewById(R.id.view_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_2).setVisibility(View.VISIBLE);
            findViewById(R.id.view_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_6).setVisibility(View.INVISIBLE);

        }
        if(position==2)
        {
            findViewById(R.id.view_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_3).setVisibility(View.VISIBLE);
            findViewById(R.id.view_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_6).setVisibility(View.INVISIBLE);

        }
        if(position==3)
        {
            findViewById(R.id.view_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_4).setVisibility(View.VISIBLE);
            findViewById(R.id.view_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_6).setVisibility(View.INVISIBLE);

        }
        if(position==4)
        {
            findViewById(R.id.view_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_5).setVisibility(View.VISIBLE);
            findViewById(R.id.view_6).setVisibility(View.INVISIBLE);

        }
        if(position==5)
        {
            findViewById(R.id.view_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.view_6).setVisibility(View.VISIBLE);

        }

    }
//textview background
    private void changeBackGround(int position) {
        if(position==0){

            tv_pragromdevelopment.isSelected();
            tv_pragromdevelopment.setBackgroundColor(COLOR1);
            tv_officerate.setBackgroundColor(COLOR2);
            tv_productanddesign.setBackgroundColor(COLOR2);
            tv_lifestyle.setBackgroundColor(COLOR2);
            tv_professiondevelopment.setBackgroundColor(COLOR2);
            tv_maketmanangerment.setBackgroundColor(COLOR2);
        }
        if(position==1){


            tv_officerate.isSelected();
            tv_officerate.setBackgroundColor(COLOR1);
            tv_pragromdevelopment.setBackgroundColor(COLOR2);
            tv_productanddesign.setBackgroundColor(COLOR2);
            tv_lifestyle.setBackgroundColor(COLOR2);
            tv_professiondevelopment.setBackgroundColor(COLOR2);
            tv_maketmanangerment.setBackgroundColor(COLOR2);
        }
        if(position==2){


            tv_productanddesign.isSelected();
            tv_productanddesign.setBackgroundColor(COLOR1);
            tv_pragromdevelopment.setBackgroundColor(COLOR2);
            tv_officerate.setBackgroundColor(COLOR2);

            tv_lifestyle.setBackgroundColor(COLOR2);
            tv_professiondevelopment.setBackgroundColor(COLOR2);
            tv_maketmanangerment.setBackgroundColor(COLOR2);
        }
        if(position==3){


            tv_lifestyle.isSelected();
            tv_lifestyle.setBackgroundColor(COLOR1);
            tv_pragromdevelopment.setBackgroundColor(COLOR2);
            tv_officerate.setBackgroundColor(COLOR2);
            tv_productanddesign.setBackgroundColor(COLOR2);

            tv_professiondevelopment.setBackgroundColor(COLOR2);
            tv_maketmanangerment.setBackgroundColor(COLOR2);
        }
        if(position==4){


            tv_professiondevelopment.isSelected();
            tv_professiondevelopment.setBackgroundColor(COLOR1);
            tv_pragromdevelopment.setBackgroundColor(COLOR2);
            tv_officerate.setBackgroundColor(COLOR2);
            tv_productanddesign.setBackgroundColor(COLOR2);
            tv_lifestyle.setBackgroundColor(COLOR2);

            tv_maketmanangerment.setBackgroundColor(COLOR2);
        }
        if(position==5){


            tv_maketmanangerment.isSelected();
            tv_maketmanangerment.setBackgroundColor(COLOR1);
            tv_pragromdevelopment.setBackgroundColor(COLOR2);
            tv_officerate.setBackgroundColor(COLOR2);
            tv_productanddesign.setBackgroundColor(COLOR2);
            tv_lifestyle.setBackgroundColor(COLOR2);
            tv_professiondevelopment.setBackgroundColor(COLOR2);

        }


}
    @Override
    public void onClick(View v) {
        int position;
            switch (v.getId()) {
                case R.id.tv_pragromdevelopment:
                    position = 0;
                    show(position);
                    break;
                case R.id.tv_officerate:
                    position = 1;
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
