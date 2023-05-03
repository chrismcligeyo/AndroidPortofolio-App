package mcligeyo.mcligeyodev.com.mcligeyodev;

import android.graphics.Color;
//import android.support.design.widget.TabLayout;
//import androidx.core.view.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


import mcligeyo.mcligeyodev.com.R;
import mcligeyo.mcligeyodev.com.mcligeyodev.controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);

        tabs.setTabTextColors(Color.GRAY, Color.parseColor("white"));
    }
}
