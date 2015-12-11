package com.jang.android20151205;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TITLE BAR 지우기 (초기화)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 화면에 출력될 View 선택
        setContentView(R.layout.activity_main);
    }
}
