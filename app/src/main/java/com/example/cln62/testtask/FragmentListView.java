package com.example.cln62.testtask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentListView extends Fragment {

    String[] myFood = {"pizza", "cake", "西瓜", "sushi"};
    int[] myImages = {R.drawable.pizza, R.drawable.cake, R.drawable.melon, R.drawable.shshi};
    ListView listView;
    MyCustomAdapter myCustomAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container, false);

        listView = view.findViewById(R.id.myListView);
        myCustomAdapter = new MyCustomAdapter(myFood, myImages, getActivity());
        listView.setAdapter(myCustomAdapter);
        return view;
    }
}
