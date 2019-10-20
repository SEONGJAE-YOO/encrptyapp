package com.example.encrptyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigInteger;
import java.util.Map;

public class rsaActivity extends AppCompatActivity {

    private EditText etInput,etOutput;

    private  String publicKey="";
    private  String privateKey="";
    private  byte[] encodeData =null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsa);
        findViewById(R.id.main1).setOnClickListener(myClick);
        etInput =(EditText) findViewById(R.id.etInput);
        etOutput =(EditText) findViewById(R.id.etOutput);

        try {
            Map<String,Object> keyMap = rsa.initKey();
            publicKey = rsa.getPublicKey(keyMap);
            privateKey= rsa.getPublicKey(keyMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void encrypt(View v){

        byte[] rsaData = etInput.getText().toString().getBytes();

        try {
            encodeData = rsa.encryptByPublicKey(rsaData,getPublicKey());
            String encodeStr = new BigInteger(1,encodeData).toString();
            etOutput.setText(encodeStr);
        } catch (Exception e){
                e.printStackTrace();
            }
    }
    public void decrypt(View v){


        try {
         byte[] decodeData = rsa.encryptByPublicKey(encodeData,getPrivateKey());
            String dncodeStr = new String(decodeData);
            etOutput.setText(dncodeStr);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    Button.OnClickListener myClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.main1:
                    startActivity(new Intent(rsaActivity.this, StartCsc.class));
                    break;




            }
        }
    };


    public String getPublicKey() {
        return publicKey;
    }



    public String getPrivateKey() {
        return privateKey;
    }


}
