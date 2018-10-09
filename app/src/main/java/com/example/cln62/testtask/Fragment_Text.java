package com.example.cln62.testtask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_Text extends Fragment {

    TextView tv2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text, container, false);

        tv2 = view.findViewById(R.id.textView2);

        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        tv2.setText(data);
        return view;
    }
}
