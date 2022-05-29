package com.example.fortune_news_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fortune_news_app.Adapter.ViewPagerAdapter;

public class SplashScreen extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout mDotLayout;
    AppCompatButton nxtbtn,skipbtn;

    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        nxtbtn = findViewById(R.id.nxtbtn);
        skipbtn = findViewById(R.id.skipbtn);

        nxtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getItem(0) < 2) {
                    viewPager.setCurrentItem(getItem(1),true);
                } else {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
            }
        });

        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });

        viewPager = findViewById(R.id.slideViewPager);
        mDotLayout = findViewById(R.id.indicator_layout);

        viewPagerAdapter = new ViewPagerAdapter(getApplicationContext());

        viewPager.setAdapter(viewPagerAdapter);

        setUpIndicator(0);
        viewPager.addOnPageChangeListener(onPageChangeListener);
    }

    public void setUpIndicator(int position) {
        dots = new TextView[3];
        mDotLayout.removeAllViews();

        for(int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(getApplicationContext());
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.Inactive,getApplicationContext().getTheme()));
            mDotLayout.addView(dots[i]);
        }

        dots[position].setTextColor(getResources().getColor(R.color.Active,getApplicationContext().getTheme()));
    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            setUpIndicator(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }
}