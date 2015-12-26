package com.jang.assignment20151226;

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

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
    }

    //@Override
    protected void onRusume() {
        super.onResume();
        makeView();
    }

    private void makeView() {
        Button btn = (Button)findViewById(R.id.btnMainActivitySubmit);
        btn.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();

            if(id == R.id.btnMainActivitySubmit){
                Log.d("20151226", "form submitted");
            }
        }
    };
}
