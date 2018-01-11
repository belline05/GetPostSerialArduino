package com.example.administrator.getpostserialarduino.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.getpostserialarduino.R;

/**
 * Created by Administrator on 11/01/2018.
 */

public class MainFragmeng extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Button Controller
        buttonController();



    }   //Main Method

    private void buttonController() {
        Button button = getView().findViewById(R.id.btnReceive);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScanQRcode();
            }
        });
    }

    private void openScanQRcode() {
        Toast.makeText(getActivity(),getString(R.string.receive_ok),
                Toast.LENGTH_SHORT).show();


    }   //openScanQRcode

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}   //main class
