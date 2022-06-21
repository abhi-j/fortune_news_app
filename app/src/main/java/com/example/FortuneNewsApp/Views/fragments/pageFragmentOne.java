package com.example.FortuneNewsApp.Views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.FortuneNewsApp.R;

public class pageFragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.page_fragment_one, container, false);

            return rootView;
        };
    };
