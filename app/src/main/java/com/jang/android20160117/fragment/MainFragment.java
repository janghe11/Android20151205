package com.jang.android20160117.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jang.android20160117.R;
import com.jang.android20160117.adapter.MyAdapter;
import com.jang.android20160117.listitem.MyItem;

import java.util.ArrayList;

/**
 * Created by jang on 16. 1. 17.
 */
public class MainFragment extends Fragment {

    private View wholeView = null;

    private ListView mList = null;
    private MyAdapter myAdapter = null;
    private ArrayList <MyItem> mContent = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data) {
        wholeView = inflater.inflate(R.layout.fragment_main, null);

        return wholeView;
    }

    @Override
    public void onResume() {
        super.onResume();
        makeView();
    }

    public void onPause() {
        super.onPause();
    }

    private void makeView(){
        mList = (ListView)wholeView.findViewById(R.id.listFragmentList);

        if(myAdapter == null){
            mContent = new ArrayList<MyItem>();
            for (int i = 0; i < 10; i++) mContent.add(new MyItem("Title #" + i, "my content is " + i));
            myAdapter = new MyAdapter(getActivity(), R.layout.listitem_fragment_main, mContent);
        }
        mList.setAdapter(myAdapter);
    }

}
