package ashu.help.letshelp.com.letshelp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ashu.help.letshelp.com.letshelp.R;


public class Register extends Fragment {


    public Register() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=inflater.inflate(R.layout.fragment_register, container, false);

    return view;
    }

}
