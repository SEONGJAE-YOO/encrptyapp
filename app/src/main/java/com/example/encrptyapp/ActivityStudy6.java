package com.example.encrptyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityStudy6 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symmetry);
        findViewById(R.id.main1).setOnClickListener(myClick);

    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(ActivityStudy6.this, StartCsc.class));
                    break;




            }
        }
    };

}