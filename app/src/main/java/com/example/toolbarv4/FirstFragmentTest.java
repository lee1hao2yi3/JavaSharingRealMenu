package com.example.toolbarv4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FirstFragmentTest extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
      //  Toast toast = Toast.makeText(getApplicationContext(), "Simple Toast", Toast.LENGTH_LONG); // initiate the Toast with context, message and duration for the Toast
        //toast.show();
    }
}
