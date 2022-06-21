package com.example.FortuneNewsApp.Views.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.FortuneNewsApp.Adapters.NewsScrollAdapter;
import com.example.FortuneNewsApp.R;
import com.example.FortuneNewsApp.Views.ViewPager.VerticalViewPager;
import com.example.FortuneNewsApp.Views.fragments.pageFragmentOne;
import com.example.FortuneNewsApp.Views.fragments.pageFragmentThree;
import com.example.FortuneNewsApp.Views.fragments.pageFragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class NewsScroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        private VerticalViewPager viewPager;
        private NewsScrollAdapter newsScrollAdapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_scroll);

        List<Fragment> list = new ArrayList<>();
        list.add(new pageFragmentOne());
        list.add(new pageFragmentTwo());
        list.add(new pageFragmentThree());

        viewPager = findViewById(R.id.);
        newsScrollAdapter = new VPagerAdapter(getSupportFragmentManager(),list );
        viewPager.setAdapter(newsScrollAdapter);

    }
}