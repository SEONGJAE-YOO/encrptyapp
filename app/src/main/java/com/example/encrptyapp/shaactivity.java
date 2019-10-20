package com.example.encrptyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class shaactivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shaalgorithm);
        findViewById(R.id.main1).setOnClickListener(myClick);
        findViewById(R.id.main2).setOnClickListener(myClick);
    }
   //TODO SHA-1
    public void btnSHA(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData,"SHA-1");

        }catch (Exception e){
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));

    }
    //TODO SHA-256
    public void btnSHA256(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput2);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput2);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData,"SHA-256");

        }catch (Exception e){
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));

    }
    //TODO SHA-384
    public void btnSHA384(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput3);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput3);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData,"SHA-384");

        }catch (Exception e){
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));

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
    public void btnSHA512(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput5);
        TextView tvOutput = (TextView) findViewById(R.id.tvoutput5);


        byte[] inputData = etInput.getText().toString().getBytes();
        byte[] outputData = new byte[0];


        try {
            outputData = sha.encryptSHA(inputData,"SHA-512");

        }catch (Exception e){
            e.printStackTrace();
        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));

    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(shaactivity.this, sha256activity.class));
                    break;

                case R.id.main2:
                    startActivity(new Intent(shaactivity.this, StartCsc.class));
                    break;


            }
        }
    };
}
