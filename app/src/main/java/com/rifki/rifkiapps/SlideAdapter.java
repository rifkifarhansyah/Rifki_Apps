package com.rifki.rifkiapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/*

14/04/2020
membuat keseluruhan program dan tampilan

nim   : 10117193
nama  : Rifki Farhansyah
kelas : if-5

 */
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context){
        this.context = context;
    }

    //array
    public int[] slide_images = {
            R.drawable.orientation,
            R.drawable.calendars,
            R.drawable.profile
    };

    public String[] slide_headings = {
            "SELAMAT DATANG",
            "PROFILE",
            "DAILY ACTIVITY"
    };

    public String[] slide_descs = {
            "Aplikasi ini adalah aplikasi tentang mahasiswa bernama Rifki Farhansyah, di aplikasi ini kita akan lebih mengenal lebih dalam tentang Rifki Farhansyah",
            "di menu profile ini kita akan mengetahui info pribadi tentang Rifki Farhansyah" +
                    " seperti cita, hobi dan masih banyak lagi",
            "di menu daily activity ini kita juga bisa tahu keseharian Rifki Farhansyah dan masih" +
                    " banyak lagi fitur lainnya pada aplikasi ini agar kita lebih mengenal Rifki Farhansyah"
    };

    @Override
    public int getCount(){
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view,Object o){
        return view == (RelativeLayout) o;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
