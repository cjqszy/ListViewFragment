package com.example.cln62.testtask;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Fragment_ListView extends Fragment {

    String[] myFood = {"pizza", "cake", "watermelon", "sushi"};
    int[] myImages = {R.drawable.pizza, R.drawable.cake, R.drawable.melon, R.drawable.shshi};
    ListView lv;
    MyCustomAdapter myCustomAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_lv, container, false);

        lv = view.findViewById(R.id.myListView);
        myCustomAdapter = new MyCustomAdapter(myFood, myImages, getActivity());
        lv.setAdapter(myCustomAdapter);
        return view;
    }
}
