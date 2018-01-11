package com.example.administrator.getpostserialarduino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanCode2Activity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView zXingScannerView;
    private String resultString;
    private String tag = "11JanV1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zXingScannerView = new ZXingScannerView(ScanCode2Activity.this);
        setContentView(zXingScannerView);
    }   //Main Method

    @Override
    protected void onResume() {
        super.onResume();

        zXingScannerView.setResultHandler(ScanCode2Activity.this);
        zXingScannerView.startCamera();

    }
    @Override
    protected void onPause() {
        super.onPause();
        zXingScannerView.stopCamera();


    }

    @Override
    public void handleResult(Result result) {
        resultString = result.getText().toString();
        Log.d(tag,"result ==> " + resultString);

        if (resultString.length() != 0) {
            zXingScannerView.stopCamera();
            fileList();
        }

        zXingScannerView.resumeCameraPreview(ScanCode2Activity.this);

    }
}   //Main Class
