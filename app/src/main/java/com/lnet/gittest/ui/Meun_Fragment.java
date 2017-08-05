package com.lnet.gittest.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lnet.gittest.R;

/**
 * Created by zhao on 2017/8/2.
 */

public class Meun_Fragment extends ListFragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
//        ListView listView=getListView();
//        String[] objects={"办公效率","编程开发","产品与设计","生活方式","职业发展","市场营销"};;
//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(),
//                android.R.layout.simple_expandable_list_item_1,
//                android.R.id.text1,
//                objects);
//        setListAdapter(adapter);
    }

    @Override
    public  void onListItemClick(ListView l, View v, int position, long id) {
//        FragmentManager fm=getFragmentManager();
//        FragmentTransaction ft= fm.beginTransaction();
//        ContentFragment cf=(ContentFragment) fm.findFragmentById(R.id.fl_content);
//        if(cf==null||position!=cf.getPosition())
//        {
//            cf=ContentFragment.getInstance(position);
//            ft.replace(R.id.fl_content,cf);
//            ft.commit();
//        }
        super.onListItemClick(l, v, position, id);



    }
}
