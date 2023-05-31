package com.unir.geocalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class segundaActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);


        getSupportActionBar().setElevation(0);


        VPAdapter vpAdapter = new VPAdapter(
                getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                        vpAdapter.addFragment(new TrianguloFragment(), "Triângulo");
                        vpAdapter.addFragment(new TrapezioFragment(), "Trapézio");
                        vpAdapter.addFragment(new LosangoFragment(), "Losango");


        viewPager.setAdapter(vpAdapter);
        //smartTabLayout.setViewPager(viewPager);


        //com.ogaclejapan.smarttablayout.SmartTabLayout.viewPagerTab(com.ogaclejapan.smarttablayout.SmartTabLayout)findViewById(R.id.)

    }

    public static class triangulo_fragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_triangulo, container, false);
        }
    }
}