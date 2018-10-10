package com.example.cln62.testtask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentImage extends Fragment {

    int[] myImages = {R.drawable.pizza, R.drawable.cake, R.drawable.melon, R.drawable.shshi};
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image, container, false);

        imageView = view.findViewById(R.id.imageView2);

        Bundle bundle = getArguments();

        int position = bundle.getInt("key");

        imageView.setImageResource(myImages[position]);

        return view;
    }
}
