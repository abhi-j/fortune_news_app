package com.example.fortune_news_app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.fortune_news_app.R;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int[] images = {R.drawable.splash_image_2,R.drawable.splash_image_2,R.drawable.splash_image_3};

    String[] headings = {"Heading 1", "Heading 2", "Heading 3"};

    String[] descriptions = {"Desc 1", "Desc 2", "Desc 3"};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.splash_slider_layout,container,false);
        ImageView slideTitleImage = (ImageView) view.findViewById(R.id.titleImage);
        TextView slideHeading = (TextView) view.findViewById(R.id.texttitle);
        TextView slideDescription = (TextView) view.findViewById(R.id.textdescription);

        slideTitleImage.setImageResource(images[position]);
        slideHeading.setText(headings[position]);
        slideDescription.setText(descriptions[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
