package com.jang.android20160117;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jang.android20160117.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    private MainFragment mMain = null;
    private android.support.v4.app.FragmentTransaction mFrgTransaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onResume(){
        super.onResume();

        makeView();
        moveFragment(Contants.MAIN);
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mMain = new MainFragment();
    }

    public void moveFragment(int type){
        mFrgTransaction = getSupportFragmentManager().beginTransaction();

        switch (type){
            case Contants.MAIN: mFrgTransaction.add(R.id.container, mMain);
                break;
        }
        mFrgTransaction.commit();
    }
}
