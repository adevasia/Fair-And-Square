package com.duallens.fairandsquare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

//Connects with Pick Method Fragments that displays the Choosing Methods page
public class pickMethod extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_method);

        //Connects the Fragment to the activity
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.pickMethod_fragment);

        if (fragment == null) {
            fragment = new pickMethod_Fragment();
            fragmentManager.beginTransaction()
                    .add(R.id.pickMethod_fragment, fragment)
                    .commit();
        }


    }
}
