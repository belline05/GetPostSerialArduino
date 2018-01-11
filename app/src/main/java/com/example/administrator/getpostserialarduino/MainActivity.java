package com.example.administrator.getpostserialarduino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.getpostserialarduino.fragment.MainFragmeng;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contenMainFragment, new MainFragmeng())
                    .commit();


        }








    }   //Main Method
}   //Main class
