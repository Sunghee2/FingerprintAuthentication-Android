package com.example.fingerprint;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;

import java.security.KeyStore;
import java.util.UUID;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

@TargetApi(Build.VERSION_CODES.M)
public class BiometricManagerV23 {

    private static final String KEY_NAME = UUID.randomUUID().toString();

    private Cipher cipher;
    private KeyStore keyStore;
    private KeyGenerator keyGenerator;
    private FingerprintManagerCompat.CryptoObject cryptoObject;

    protected Context context;

    protected String title;
    protected String subtitle;
    protected String description;
    protected String negativeButtonText;
    private BiometricManagerV23 biometricManagerV23;
    protected CancellationSignal cancellationSignalV23 = new CancellationSignal();

    public void displayBiometricPromptV23() {

    }
}
