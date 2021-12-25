package com.example.busroutebd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        chipNavigationBar = findViewById(R.id.bottom_nav_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.fregment_container,new Home_fragment()).commit();
        bottom_nevbar_work();

    }

    public void bottom_nevbar_work()
    {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;
                if(i == R.id.setting){
                    fragment = new Setting_fragment();
                }
                else if(i==R.id.All_Buses)
                {
                    fragment = new AllBusese_fragment();
                }
                else fragment = new Home_fragment();

                getSupportFragmentManager().beginTransaction().replace(R.id.fregment_container,fragment).commit();
            }
        });
    }
}