package com.example.fingerprint;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private Button button;

//    private BiometricManager biometricManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_authenticate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mBiometricManager = new BiometricManager.BiometricBuilder(MainActivity.this)
//                        .setTitle(getString(R.string.biometric_title))
//                        .setSubtitle(getString(R.string.biometric_subtitle))
//                        .setDescription(getString(R.string.biometric_description))
//                        .setNegativeButtonText(getString(R.string.biometric_negative_button_text))
//                        .build();
//
//                mBiometricManager.authenticate(MainActivity.this);
            }
        });
    }
}
