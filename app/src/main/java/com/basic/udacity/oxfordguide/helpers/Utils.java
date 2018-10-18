package com.basic.udacity.oxfordguide.helpers;


import android.content.Context;

import com.basic.udacity.oxfordguide.R;
import com.basic.udacity.oxfordguide.model.Place;

import java.util.List;

public class Utils {

    public static void populateSightsList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.sights_oxford_university_name),
                context.getString(R.string.sights_oxford_university_description),
                context.getString(R.string.sights_oxford_university_address),
                context.getString(R.string.sights_oxford_university_website),
                null,
                context.getString(R.string.sights_oxford_university_phone),
                R.drawable.sights_oxford_university
        ));

        list.add(new Place(
                context.getString(R.string.sights_bodleian_library_name),
                context.getString(R.string.sights_bodleian_library_description),
                context.getString(R.string.sights_bodleian_library_address),
                context.getString(R.string.sights_bodleian_library_website),
                context.getString(R.string.sights_bodleian_library_schedule),
                context.getString(R.string.sights_bodleian_library_phone),
                R.drawable.sights_bodleian_library3
        ));

        list.add(new Place(
                context.getString(R.string.sights_oxford_castle_name),
                context.getString(R.string.sights_oxford_castle_description),
                context.getString(R.string.sights_oxford_castle_address),
                context.getString(R.string.sights_oxford_castle_website),
                context.getString(R.string.sights_oxford_castle_schedule),
                context.getString(R.string.sights_oxford_castle_phone),
                R.drawable.sights_oxford_castle
        ));

        list.add(new Place(
                context.getString(R.string.sights_sheldonian_theatre_name),
                context.getString(R.string.sights_sheldonian_theatre_description),
                context.getString(R.string.sights_sheldonian_theatre_address),
                context.getString(R.string.sights_sheldonian_theatre_website),
                context.getString(R.string.sights_sheldonian_theatre_schedule),
                context.getString(R.string.sights_sheldonian_theatre_phone),
                R.drawable.sights_sheldonian_theatre
        ));

        list.add(new Place(
                context.getString(R.string.sights_radcliffe_camera_name),
                context.getString(R.string.sights_radcliffe_camera_description),
                context.getString(R.string.sights_radcliffe_camera_address),
                context.getString(R.string.sights_radcliffe_camera_website),
                context.getString(R.string.sights_radcliffe_camera_schedule),
                context.getString(R.string.sights_radcliffe_camera_phone),
                R.drawable.sights_radcliffe_camera
        ));

        list.add(new Place(
                context.getString(R.string.sights_magdalen_college_name),
                context.getString(R.string.sights_magdalen_college_description),
                context.getString(R.string.sights_magdalen_college_address),
                context.getString(R.string.sights_magdalen_college_website),
                null,
                context.getString(R.string.sights_magdalen_college_phone),
                R.drawable.sights_magdalene_college
        ));

        list.add(new Place(
                context.getString(R.string.sights_new_college_name),
                context.getString(R.string.sights_new_college_description),
                context.getString(R.string.sights_new_college_address),
                context.getString(R.string.sights_new_college_website),
                null,
                context.getString(R.string.sights_new_college_phone),
                R.drawable.sights_new_college
        ));

        list.add(new Place(
                context.getString(R.string.sights_bridge_of_sighs_name),
                context.getString(R.string.sights_bridge_of_sighs_description),
                context.getString(R.string.sights_bridge_of_sighs_address),
                null,
                null,
                null,
                R.drawable.sights_bridge_of_sighs
        ));

        list.add(new Place(
                context.getString(R.string.sights_university_church_st_mary_name),
                context.getString(R.string.sights_university_church_st_mary_description),
                context.getString(R.string.sights_university_church_st_mary_address),
                context.getString(R.string.sights_university_church_st_mary_website),
                context.getString(R.string.sights_university_church_st_mary_schedule),
                context.getString(R.string.sights_university_church_st_mary_phone),
                R.drawable.sights_university_church_st_mary
        ));

        list.add(new Place(
                context.getString(R.string.sights_balliol_college_name),
                context.getString(R.string.sights_balliol_college_description),
                context.getString(R.string.sights_balliol_college_address),
                context.getString(R.string.sights_balliol_college_website),
                null,
                context.getString(R.string.sights_balliol_college_phone),
                R.drawable.sights_balliol_college
        ));
    }

    public static void populateParksList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.parks_botanic_garden_name),
                context.getString(R.string.parks_oxford_botanic_gardens_description),
                context.getString(R.string.parks_oxford_botanic_gardens_address),
                context.getString(R.string.parks_oxford_botanic_gardens_website),
                context.getString(R.string.parks_oxford_botanic_gardens_schedule),
                context.getString(R.string.parks_oxford_botanic_gardens_phone),
                R.drawable.parks_oxford_botanic_gardens
        ));

        list.add(new Place(
                context.getString(R.string.parks_christ_church_meadow_name),
                context.getString(R.string.parks_christ_church_meadow_description),
                context.getString(R.string.parks_christ_church_meadow_address),
                context.getString(R.string.parks_christ_church_meadow_website),
                context.getString(R.string.parks_christ_church_meadow_schedule),
                context.getString(R.string.parks_christ_church_meadow_phone),
                R.drawable.parks_christ_church_meadow
        ));

        list.add(new Place(
                context.getString(R.string.parks_oxford_university_parks_name),
                context.getString(R.string.parks_oxford_university_parks_description),
                context.getString(R.string.parks_oxford_university_parks_address),
                context.getString(R.string.parks_oxford_university_parks_website),
                context.getString(R.string.parks_oxford_university_parks_schedule),
                context.getString(R.string.parks_oxford_university_parks_phone),
                R.drawable.parks_oxford_university_parks
        ));

        list.add(new Place(
                context.getString(R.string.parks_port_meadow_name),
                context.getString(R.string.parks_port_meadow_description),
                context.getString(R.string.parks_port_meadow_address),
                context.getString(R.string.parks_port_meadow_website),
                context.getString(R.string.parks_port_meadow_schedule),
                context.getString(R.string.parks_port_meadow_phone),
                R.drawable.parks_port_meadow
        ));

        list.add(new Place(
                context.getString(R.string.parks_south_park_name),
                context.getString(R.string.parks_south_park_description),
                context.getString(R.string.parks_south_park_address),
                context.getString(R.string.parks_south_park_website),
                context.getString(R.string.parks_south_park_schedule),
                context.getString(R.string.parks_south_park_phone),
                R.drawable.parks_south_park
        ));
    }

    public static void populateMuseumsList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.museums_ashmolean_name),
                context.getString(R.string.museums_ashmolean_description),
                context.getString(R.string.museums_ashmolean_address),
                context.getString(R.string.museums_ashmolean_website),
                context.getString(R.string.museums_ashmolean_schedule),
                context.getString(R.string.museums_ashmolean_phone),
                R.drawable.museums_ashmolean
        ));

        list.add(new Place(
                context.getString(R.string.museums_pitt_rivers_name),
                context.getString(R.string.museums_pitt_rivers_description),
                context.getString(R.string.museums_pitt_rivers_address),
                context.getString(R.string.museums_pitt_rivers_website),
                context.getString(R.string.museums_pitt_rivers_schedule),
                context.getString(R.string.museums_pitt_rivers_phone),
                R.drawable.museums_pitt_rivers
        ));

        list.add(new Place(
                context.getString(R.string.museums_natural_history_name),
                context.getString(R.string.museums_natural_history_description),
                context.getString(R.string.museums_natural_history_address),
                context.getString(R.string.museums_natural_history_website),
                context.getString(R.string.museums_natural_history_schedule),
                context.getString(R.string.museums_natural_history_phone),
                R.drawable.museums_natural_history
        ));

        list.add(new Place(
                context.getString(R.string.museums_history_of_science_name),
                context.getString(R.string.museums_history_of_science_description),
                context.getString(R.string.museums_history_of_science_address),
                context.getString(R.string.museums_history_of_science_website),
                context.getString(R.string.museums_history_of_science_schedule),
                context.getString(R.string.museums_history_of_science_phone),
                R.drawable.museums_history_of_science
        ));

        list.add(new Place(
                context.getString(R.string.museums_the_story_name),
                context.getString(R.string.museums_the_story_description),
                context.getString(R.string.museums_the_story_address),
                context.getString(R.string.museums_the_story_website),
                context.getString(R.string.museums_the_story_schedule),
                context.getString(R.string.museums_the_story_phone),
                R.drawable.museums_the_story
        ));

        list.add(new Place(
                context.getString(R.string.museums_modern_art_name),
                context.getString(R.string.museums_modern_art_description),
                context.getString(R.string.museums_modern_art_address),
                context.getString(R.string.museums_modern_art_website),
                context.getString(R.string.museums_modern_art_schedule),
                context.getString(R.string.museums_modern_art_phone),
                R.drawable.museums_modern_art
        ));

        list.add(new Place(
                context.getString(R.string.museums_museum_of_oxford_name),
                context.getString(R.string.museums_museum_of_oxford_description),
                context.getString(R.string.museums_museum_of_oxford_address),
                context.getString(R.string.museums_museum_of_oxford_website),
                context.getString(R.string.museums_museum_of_oxford_schedule),
                context.getString(R.string.museums_museum_of_oxford_phone),
                R.drawable.museums_museum_of_oxford
        ));

        
    }

    public static void populateToursList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.tours_footprints_name),
                null,
                context.getString(R.string.tours_footprints_address),
                context.getString(R.string.tours_footprints_website),
                null,
                context.getString(R.string.tours_footprints_phone),
                R.drawable.tours_footprints
        ));

        list.add(new Place(
                context.getString(R.string.tours_walkingtoursoxford_name),
                null,
                context.getString(R.string.tours_walkingtoursoxford_address),
                context.getString(R.string.tours_walkingtoursoxford_website),
                null,
                context.getString(R.string.tours_walkingtoursoxford_phone),
                R.drawable.tours_walkingtoursoxford
        ));

        list.add(new Place(
                context.getString(R.string.tours_wanderwalkingtour_name),
                null,
                context.getString(R.string.tours_wanderwalkingtour_address),
                context.getString(R.string.tours_wanderwalkingtour_website),
                context.getString(R.string.tours_wanderwalkingtour_schedule),
                context.getString(R.string.tours_wanderwalkingtour_phone),
                R.drawable.tours_wanderwalkingtour
        ));

        list.add(new Place(
                context.getString(R.string.tours_oxfordwalkingtours_name),
                null,
                context.getString(R.string.tours_oxfordwalkingtours_address),
                context.getString(R.string.tours_oxfordwalkingtours_website),
                context.getString(R.string.tours_oxfordwalkingtours_schedule),
                context.getString(R.string.tours_oxfordwalkingtours_phone),
                R.drawable.tours_oxfordwalkingtours
        ));

        list.add(new Place(
                context.getString(R.string.tours_oxford_river_cruises_name),
                null,
                context.getString(R.string.tours_oxford_river_cruises_address),
                context.getString(R.string.tours_oxford_river_cruises_website),
                null,
                context.getString(R.string.tours_oxford_river_cruises_phone),
                R.drawable.tours_oxford_river_cruises
        ));
    }
}
