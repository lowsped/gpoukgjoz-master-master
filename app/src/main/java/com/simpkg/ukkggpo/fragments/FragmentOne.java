package com.simpkg.ukkggpo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.simpkg.ukkggpo.R;

public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Home.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        View view2 = inflater.inflate(R.layout.fragment_one, container, false);
        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), profile.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        View view3 = inflater.inflate(R.layout.fragment_one, container, false);
        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), nilai.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        View view4 = inflater.inflate(R.layout.fragment_one, container, false);
        Button button4 = (Button) view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), latihan.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        View view5 = inflater.inflate(R.layout.fragment_one, container, false);
        Button button5 = (Button) view.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), hasil.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        View view6 = inflater.inflate(R.layout.fragment_one, container, false);
        Button button6 = (Button) view.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), website.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        return view;

     }


}