package com.jang.android20160117.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jang.android20160117.R;
import com.jang.android20160117.listitem.MyItem;

import java.util.ArrayList;

/**
 * Created by jang on 16. 1. 17.
 */
public class MyAdapter extends ArrayAdapter<MyItem> {
    private Context mContext = null;
    private ArrayList<MyItem> mContent = null;

    public MyAdapter(Context context, int resource, ArrayList<MyItem> content) {
        super(context, resource, content);
        mContext = context;
        mContent = content;


    }

    @Override
    public View getView(int positon, View v, ViewGroup container){
        if(v == null) v = LayoutInflater.from(mContext).inflate(R.layout.listitem_fragment_main, null);
        ((TextView)v.findViewById(R.id.textFragmentListTitle)).setText(mContent.get(positon).getTitle());
        ((TextView)v.findViewById(R.id.textFragmentListContent)).setText(mContent.get(positon).getTitle());

        return v;
    }

    @Override
    public int getCount(){
        if(mContent == null) return 5;
        else return mContent.size();
    }

    @Override
    public MyItem getItem(int positon){
        if(mContent == null) return null;
        else return mContent.get(positon);
    }

    @Override
    public long getItemId(int position){
        return position;
    }
}
