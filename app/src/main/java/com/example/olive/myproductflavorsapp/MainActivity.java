package com.example.olive.myproductflavorsapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.olive.myproductflavorsapp.character_lists.CharacterListFragment;

public class MainActivity extends AppCompatActivity {
    private static FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager = getSupportFragmentManager();
        if(savedInstanceState == null){
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, new CharacterListFragment())
                    .commit();
        }
    }
}
