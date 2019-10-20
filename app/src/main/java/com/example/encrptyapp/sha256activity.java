package com.example.encrptyapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class sha256activity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shaalgorithm2);
        findViewById(R.id.main1).setOnClickListener(myClick);
    }
    //TODO SHA-224
    public void btnSHA224(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput4);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput4);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData,"SHA-224");

        }catch (Exception e){
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));

    }
    //TODO SHA-512
    public void btnSHA512(View v) {
        EditText etInput = (EditText) findViewById(R.id.etInput5);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput5);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData, "SHA-512");

        } catch (Exception e) {
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1, outputData);
        tvOutput.setText(shaData.toString(16));
    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(sha256activity.this, StartCsc.class));
                    break;




            }
        }
    };
}
