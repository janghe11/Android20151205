package com.jang.android20151205;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TITLE BAR 지우기 (초기화)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 화면에 출력될 View 선택
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume(){
        super.onResume();
        makeView();
    }

    private void makeView(){
        Button btn = (Button)findViewById(R.id.btnMainActivityLogin);
        btn.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id = v.getId();

            if(id == R.id.btnMainActivityLogin){
                Log.d("20151212", "login clicked");
            }
        }
    };
}
