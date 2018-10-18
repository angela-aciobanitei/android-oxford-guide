package com.basic.udacity.oxfordguide.ui;

import android.content.Context;

import com.basic.udacity.oxfordguide.helpers.Utils;
import com.basic.udacity.oxfordguide.model.Place;

import java.util.List;


public class MuseumsFragment extends PlacesFragment {

    @Override
    public void getContents(List<Place> list, Context context) {
        Utils.populateMuseumsList(list,context);
    }
}
