package com.lnet.gittest.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnet.gittest.R;

/**
 * Created by zhao on 2017/8/2.
 */

public class ContentFragment extends Fragment {
    @Nullable
    int []content={R.layout.fragment1_layout,R.layout.fragment2_layout,R.layout.fragment3_layout,R.layout.fragment4_layout,R.layout.fragment5_layout,R.layout.fragment6_layout};
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(content[getPosition()],container,false);
    }

    public int getPosition() {
        return this.getArguments().getInt("position");
    }

    public static ContentFragment getInstance(int position){
        ContentFragment cf=new ContentFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("position",position);
        cf.setArguments(bundle);
        return cf;
    }

}
