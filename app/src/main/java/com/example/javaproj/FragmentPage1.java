package com.example.javaproj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentPage1 extends Fragment {

    public FragmentPage1() {
        // Required empty public constructor
    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
//        TextView textView = rootView.findViewById(R.id.textView);
//        textView.setText("This is Page 1");
//
//        return rootView;
//    }

    public static List<String> generateItems(int itemCount) {
        List<String> itemList = new ArrayList<>();
        for (int i = 1; i <= itemCount; i++) {
            itemList.add("Item " + i);
        }
        return itemList;
    }
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_page1, container, false);

    ListView listView = rootView.findViewById(R.id.listView);

    // Create an array of items to populate the ListView
    String[] items = generateItems(30).toArray(new String[0]);
    // {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", /* Add more items here */};

    // Create an ArrayAdapter to populate the ListView with the array of items
    ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, items);

    // Set the ArrayAdapter as the adapter for the ListView
    listView.setAdapter(adapter);
    listView.requestDisallowInterceptTouchEvent(false);

// Set the ListView height to show all items without scrolling
//    setListViewHeightBasedOnItems(listView);
    return rootView;
}
//    private void setListViewHeightBasedOnItems(ListView listView) {
//        // Get the Adapter used by the ListView
//        ArrayAdapter<?> adapter = (ArrayAdapter<?>) listView.getAdapter();
//        if (adapter == null) {
//            return;
//        }
//
//        int totalHeight = 0;
//        int count = adapter.getCount();
//        for (int i = 0; i < count; i++) {
//            View listItem = adapter.getView(i, null, listView);
//            listItem.measure(0, 0);
//            totalHeight += listItem.getMeasuredHeight();
//        }
//
//        // Set the ListView height
//        ViewGroup.LayoutParams params = listView.getLayoutParams();
//        params.height = totalHeight + (listView.getDividerHeight() * (count - 1));
//        listView.setLayoutParams(params);
//        listView.requestLayout();
//    }
}
