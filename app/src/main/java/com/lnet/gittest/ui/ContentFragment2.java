package com.lnet.gittest.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnet.gittest.R;

/**
 * Created by zhao on 2017/8/5.
 */

public class ContentFragment2 extends Fragment {
    @Nullable
    int []content={R.layout.activity_first_,R.layout.activity_fen_lei_,R.layout.activity_my_study_,R.layout.activity_accout};
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(content[getPosition()],container,false);
    }

    public int getPosition() {
        return this.getArguments().getInt("position");
    }

    public static ContentFragment2 getInstance(int position){
        ContentFragment2 cf=new ContentFragment2();
        Bundle bundle=new Bundle();
        bundle.putInt("position",position);
        cf.setArguments(bundle);
        return cf;
    }
}
