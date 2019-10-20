package com.example.encrptyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class md5activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.md5algorithm);
        findViewById(R.id.main1).setOnClickListener(myClick);
    }

    public  void btnMD5(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput);

        byte[] md5Input = etInput.getText().toString().getBytes();
        BigInteger md5Data = null;

        try {
            md5Data = new BigInteger(1,md5.encryptMD5(md5Input));
        }catch (Exception e){
            e.printStackTrace();
        }

        String md5str = md5Data.toString(16);

        tvOutput.setText(md5str);
    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(md5activity.this, StartCsc.class));
                    break;




            }
        }
    };
}
