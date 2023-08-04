package com.example.javaproj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class PhotosFragment extends Fragment {

    public PhotosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photos, container, false);
        // Customize the content for the Photos tab
        // For example, set up a RecyclerView and load images
        // into the grid using a GridLayoutManager
        // You can also add any other UI elements specific to this tab
        return view;
    }
}
