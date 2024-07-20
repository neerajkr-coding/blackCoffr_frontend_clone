package com.example.blackcofferassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageButton imageButton, imageButton2;

    private NavigationView navigationView;
    ViewPager2 viewPager2;
    ViewPagerAdaptor viewPagerAdaptor;

    TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.main);
        imageButton = findViewById(R.id.drawerBtn);
        imageButton2 =findViewById(R.id.imageButton2);
        Toolbar toolbar = findViewById(R.id.toolBar);
        navigationView = findViewById(R.id.drawer);
        tabLayout = findViewById(R.id.tabLayout2);


//        setSupportActionBar(toolbar);  //set toolbar as application bar

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.openDrawer(GravityCompat.START);
                }else{
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });

        viewPagerAdaptor = new ViewPagerAdaptor(getSupportFragmentManager(),getLifecycle());
        viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        viewPagerAdaptor.addFragment(new buy());
        viewPagerAdaptor.addFragment(new rent());

        viewPager2.setAdapter(viewPagerAdaptor);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {

            String[] title = {"Buy","Rent"};
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                tab.setText(title[i]);
            }
        }).attach();


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), SecondScreen.class);

                startActivity(i);
            }
        });

    }
}