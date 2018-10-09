package com.example.cln62.testtask;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyCustomAdapter extends BaseAdapter {

    String[] myFood;
    int[] myImages;
    Context ctx;
    ImageView iv;
    TextView tv;


    public MyCustomAdapter(String[] myFood, int[] myImages, Context ctx) {
        this.myFood = myFood;
        this.myImages = myImages;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return myFood.length;
    }


    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_layout, null);
        iv = view.findViewById(R.id.imageView2);
        tv = view.findViewById(R.id.textView);

        iv.setImageResource(myImages[position]);
        tv.setText(myFood[position]);


        Bundle bundle2 = new Bundle();
        bundle2.putInt("key", position);

        final Fragment_Img fragment_img = new Fragment_Img();

        fragment_img.setArguments(bundle2);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).getFragmentManager().beginTransaction().replace(R.id.myRelativeLayout, fragment_img).addToBackStack(null).commit();
            }
        });

        Bundle bundle = new Bundle();
        bundle.putString("key", myFood[position]);

        final Fragment_Text fragment_text = new Fragment_Text();

        fragment_text.setArguments(bundle);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).getFragmentManager().beginTransaction().replace(R.id.myRelativeLayout, fragment_text).addToBackStack(null).commit();
            }
        });


        return view;
    }

}
