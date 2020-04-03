package com.test.encryption.strategy;

/**
Welcome to encryption! As mentioned DES is symmetric and requires the same key for encryption as decryption. That key needs to be the right number of bits for the cipher that you're using. For DES that's 56-bit. Before you go too far with that though, here are a few things you might want to consider:

    You should use a stronger encryption standard like AES. It's possible to break DES encryption now.
    If you want to use a string as the key, then you should use a strong hash function like SHA-256 against that key string. Then take as many bits from that hash output as you need for the encryption key, 128-bit is plenty sufficient for AES. Your key string should be long like you have.
    It'll be best to use a block cipher mode that doesn't generate the same output for the same input each time. See block cipher modes of operation for info and a visualization of why ECB mode is bad.

Here's a working example of using 128-bit AES encryption in CBC mode with PKCS #5 padding:
Reference URL - http://stackoverflow.com/questions/5520640/encrypting-and-decrypting-using-java

**/
import java.security.MessageDigest;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptDecryptMain {
    public static void main(String[] args) throws Exception {
        // here are your inputs
        String keyString = "1bobui76m677W1eCxjFM79mJ189G2zxo";
        String input = "john doe i a dead man sdhfhdshfihdoifo";

        // setup AES cipher in CBC mode with PKCS #5 padding
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // setup an IV (initialization vector) that should be
        // randomly generated for each input that's encrypted
        byte[] iv = new byte[cipher.getBlockSize()];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // hash keyString with SHA-256 and crop the output to 128-bit for key
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(keyString.getBytes());
        byte[] key = new byte[16];
        System.arraycopy(digest.digest(), 0, key, 0, key.length);
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");

        // encrypt
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        byte[] encrypted = cipher.doFinal(input.getBytes("UTF-8"));
        System.out.println("encrypted: " + new String(encrypted));

        // include the IV with the encrypted bytes for transport, you'll
        // need the same IV when decrypting (it's safe to send unencrypted)

        // decrypt
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("decrypted: " + new String(decrypted, "UTF-8"));
    }
}