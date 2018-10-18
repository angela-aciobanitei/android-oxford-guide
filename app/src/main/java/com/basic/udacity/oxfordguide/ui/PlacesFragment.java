package com.basic.udacity.oxfordguide.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.basic.udacity.oxfordguide.R;
import com.basic.udacity.oxfordguide.adapters.PlacesAdapter;
import com.basic.udacity.oxfordguide.model.Place;

/**
 * Abstract class used as reference for all the other fragments in our app.
 * Each fragment in our app has the same layout, the only thing that is different is the content.
 * So a fragment that implements this class must implement the method getContents().
 */

public abstract class PlacesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create a list of {@link Place} objects and populate it.
        List<Place> placesList = new ArrayList<>();
        getContents(placesList, getContext());

        // Inflate the view for the fragment based on layout XML.
        View view = inflater.inflate(R.layout.places_fragment, container, false);

        // Create a custom adapter and attach it to the places list view.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), 0, placesList);
        ListView placesListView = (ListView) view.findViewById(R.id.list_view);
        placesListView.setAdapter(adapter);

        return view;
    }

    public abstract void getContents(List<Place> list, Context context);
}