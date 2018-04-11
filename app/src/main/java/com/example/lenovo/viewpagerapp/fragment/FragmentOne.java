package com.example.lenovo.viewpagerapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;

import com.example.lenovo.viewpagerapp.R;

public class FragmentOne extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);

        return view;
    }
}
