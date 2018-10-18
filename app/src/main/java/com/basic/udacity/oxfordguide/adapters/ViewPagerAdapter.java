package com.basic.udacity.oxfordguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.basic.udacity.oxfordguide.R;
import com.basic.udacity.oxfordguide.ui.MuseumsFragment;
import com.basic.udacity.oxfordguide.ui.ParksFragment;
import com.basic.udacity.oxfordguide.ui.SightsFragment;
import com.basic.udacity.oxfordguide.ui.ToursFragment;


/**
 * ViewPager is a layout manager that allows the user to flip left and right through pages of data.
 * ViewPager is most often used in conjunction with Fragment, which is a convenient way to
 * supply and manage the lifecycle of each page.
 *
 * You must supply an implementation of a PagerAdapter to generate the pages that the view shows.
 * There are standard adapters implemented for using fragments with the ViewPager, such as
 * FragmentPagerAdapter and FragmentStatePagerAdapter.
 *
 * FragmentPagerAdapter is an implementation of PagerAdapter that represents each page as a
 * Fragment that is persistently kept in the fragment manager as long as the user can return
 * to the page. This version of the pager is best for use when there are a handful of typically
 * more static fragments to be paged through, such as a set of tabs. The fragment of each page
 * the user visits will be kept in memory, though its view hierarchy may be destroyed when
 * not visible. This can result in using a significant amount of memory since fragment instances
 * can hold on to an arbitrary amount of state. For larger sets of pages, consider
 * FragmentStatePagerAdapter.
 * When using FragmentPagerAdapter the host ViewPager must have a valid ID set.
 * Subclasses only need to implement getItem(int) and getCount() to have a working adapter.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager manager) {
        super(manager);
        mContext = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position The position of the item.
     * @return The Fragment associated with a specified position.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2){
            return new MuseumsFragment();
        } else {
            return new ToursFragment();
        }
    }

    /**
     * Return the number of views available.
     *
     * @return The number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }


    /**
     * This method may be called by the ViewPager to obtain a title string to describe
     * the specified page. This method may return null indicating no title for this page.
     *
     * @param position  The position of the title requested.
     * @return  A title for the requested page.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museums);
        } else {
            return mContext.getString(R.string.category_tours);
        }
    }
}


