package com.linda.design_support_library_demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by zhoulinda on 16/3/2.
 */
public class ListFragment extends Fragment {

    public ListFragment() {

    }

    public static Fragment getInstance(int tabPosition) {
        Fragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putInt("tabPosition", tabPosition);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        int tabPosition = args.getInt("tabPosition");
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            items.add("Tab #" + tabPosition + " item #" + i);
        }
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new DesignDemoRecyclerAdapter(items));
        return view;
    }
}
