package com.example.encrptyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityStudy2 extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.classic);

            findViewById(R.id.main1).setOnClickListener(myClick);
            findViewById(R.id.main2).setOnClickListener(myClick);
        }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(ActivityStudy2.this, StartCsc.class));
                    break;

                case R.id.main2:
                    startActivity(new Intent(ActivityStudy2.this, ActivityStudy3.class));
                    break;


            }
        }
    };




    }
