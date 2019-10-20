package com.example.encrptyapp;

import java.security.*;


public class sha256 extends sha256activity{

    public static byte[] encryptSHA(byte[] data1, String shaN1) throws Exception {

        MessageDigest sha256 = MessageDigest.getInstance(shaN1);
        sha256.update(data1);
        return sha256.digest();

    }
}
