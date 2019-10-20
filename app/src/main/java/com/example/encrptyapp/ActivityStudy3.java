package com.example.encrptyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityStudy3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classic2);

        findViewById(R.id.main1).setOnClickListener(myClick);
        findViewById(R.id.main2).setOnClickListener(myClick);
    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.main1:
                    startActivity(new Intent(ActivityStudy3.this, ActivityStudy2.class));
                    break;
                case R.id.main2:
                    startActivity(new Intent(ActivityStudy3.this, ActivityStudy4.class));
                    break;




            }
        }
    };


}

