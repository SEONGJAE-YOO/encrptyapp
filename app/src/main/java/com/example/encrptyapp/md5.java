package com.example.encrptyapp;

import java.security.*;




public class md5 extends md5activity {

    public static byte[] encryptMD5(byte[] data) throws Exception {

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(data);
        return md5.digest();

    }
}