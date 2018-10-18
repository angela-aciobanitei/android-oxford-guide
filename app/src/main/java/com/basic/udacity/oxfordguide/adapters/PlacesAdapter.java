package com.basic.udacity.oxfordguide.adapters;


import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.basic.udacity.oxfordguide.R;
import com.basic.udacity.oxfordguide.model.Place;

/**
 * {@link PlacesAdapter} is a custom adapter that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlacesAdapter extends ArrayAdapter<Place> {

    /**
     * Constructs a new {@link PlacesAdapter}. This adapter needs to know the context
     * and the data source to adapt, a list of {@link Place}objects.
     *
     * @param context The current context. This value must never be null.
     * @param resource The resource ID for a layout file containing a TextView
     *                  to use when instantiating views.
     * @param placesList The {@link Place} objects to represent in the ListView.
     *                      This value must never be null.
     */
    public PlacesAdapter(Context context, int resource, List<Place> placesList) {
        super(context, 0, placesList);
    }

    /**
     * Use the ViewHolder pattern. It avoids unnecessary calls to findViewById(),
     * making ListView scrolling smooth.
     */
    private static class ViewHolder {
        TextView name;
        TextView description;
        TextView address;
        TextView website;
        TextView phone;
        TextView schedule;
        ImageView photo;
    }

    /**
     * Get a View that displays the data at the specified position in the data set.
     *
     * @param position The position of the item within the adapter's data set of the item whose
     *                 view we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this
     *                    view is non-null and of an appropriate type before using. If it is not
     *                    possible to convert this view to display the correct data, this method
     *                    can create a new view.
     * @param parent The parent that this view will eventually be attached to.
     *               This value must never be null.
     * @return A View corresponding to the data at the specified position.
     *         This value will never be null.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        // Inflate a new view.
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            // Populate the view holder and store it inside the layout.
            holder = new ViewHolder();
            holder.name = convertView.findViewById(R.id.name);
            holder.description = convertView.findViewById(R.id.description);
            holder.address = convertView.findViewById(R.id.address);
            holder.website = convertView.findViewById(R.id.website);
            holder.phone = convertView.findViewById(R.id.phone);
            holder.schedule = convertView.findViewById(R.id.schedule);
            holder.photo = convertView.findViewById(R.id.photo);

            // Set tag on the view to be recycled.
            convertView.setTag(holder);
        }
        else {
            // Reuse view.
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the current place requested for display.
        final Place currentPlace = getItem(position);

        // Set the data for the current list item.
        assert currentPlace != null;
        holder.name.setText(currentPlace.getName());

        if (currentPlace.hasDescription()){
            holder.description.setText(currentPlace.getDescription());
            holder.description.setVisibility(View.VISIBLE);
        } else {
            holder.description.setVisibility(View.GONE);
        }

        if (currentPlace.hasAddress()){
            holder.address.setText(currentPlace.getAddress());
            // Note: the attribute android:autoLink="map" seems to be supported only for the US.
            // By setting an onClickListener on the address text view, we can mimic the behaviour
            // of this attribute. For consistence, we should also set the text to be underlined,
            // to make the user aware that this is a clickable text.
            holder.address.setPaintFlags(holder.address.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            holder.address.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode(currentPlace.getAddress()));
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    getContext().startActivity(mapIntent);
                }
            });
        } else {
            holder.address.setVisibility(View.GONE);
        }

        if (currentPlace.hasWebsite()){
            holder.website.setText(currentPlace.getWebsite());
        } else {
            holder.website.setVisibility(View.GONE);
        }

        if (currentPlace.hasPhone()){
            holder.phone.setText(currentPlace.getPhone());
        } else {
            holder.phone.setVisibility(View.GONE);
        }

        if (currentPlace.hasSchedule()){
            holder.schedule.setText(currentPlace.getSchedule());
        } else {
            holder.schedule.setVisibility(View.GONE);
        }

        if (currentPlace.hasImage()){
            holder.photo.setImageResource(currentPlace.getImageResourceId());
        } else {
            holder.photo.setVisibility(View.GONE);
        }

        return convertView;
    }


}
