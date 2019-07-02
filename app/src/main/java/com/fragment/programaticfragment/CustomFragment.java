package com.fragment.programaticfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class CustomFragment extends Fragment {
        GridView grid;
        ArrayAdapter<String> adapter;
        String[] data = {"neha", "neha", "neha","neha","neha","neha","neha",};

        public CustomFragment(){
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            /** Inflating the layout for this fragment **/
            View v = inflater.inflate(R.layout.custom_fragment_layout, container, false);


            grid = (GridView) v.findViewById(R.id.gridview);
            adapter = new ArrayAdapter<String>( getContext() ,android.R.layout.simple_list_item_1,data );
            grid.setAdapter(adapter);
            return v;
        }
}
