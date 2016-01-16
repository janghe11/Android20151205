package com.jang.android20160115;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Window;

import com.jang.android20160115.fragment.MainFragment;

public class MainActivity extends FragmentActivity {

    private android.support.v4.app.FragmentTransaction mFrgTransaction = null;

    private MainFragment mMain = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
        moveFragment();
    }

    public void onPause(){
        super.onPause();
    }

    public void makeView(){
        mMain = new MainFragment();
    }

    public void moveFragment(){
        mFrgTransaction= getSupportFragmentManager().beginTransaction();
        mFrgTransaction.add(R.id.container, mMain);
        mFrgTransaction.commit();
    }
}
