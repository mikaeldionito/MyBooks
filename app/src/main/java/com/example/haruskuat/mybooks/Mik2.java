package com.example.haruskuat.mybooks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Mik2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Mik2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Mik2 extends Fragment {
    public Mik2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mik2, container, false);
    }
}
