package com.pmcoder.pruebarecyclerview.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pmcoder.pruebarecyclerview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class imageFragment extends Fragment {


    public imageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRoot = inflater.inflate(R.layout.fragment_image, container, false);

        return viewRoot;
    }

}
