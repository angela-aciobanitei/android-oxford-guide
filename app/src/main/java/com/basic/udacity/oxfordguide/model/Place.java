package com.basic.udacity.oxfordguide.model;

/**
 * The Data Model is a {@link Place} object with the following properties:
 *
 *      name - the name of that particular place
 *      description - the description of that place
 *      address - the address of that place
 *      website - an official website url to that particular place
 *      schedule - the schedule for that particular place
 *      phone - the phone for the specific place
 *      image resource id - the resource id for the image, if such image is provided.
 *
 */

public class Place {

    // Member variables
    private String mName;
    private String mDescription;
    private String mAddress;
    private String mWebsite;
    private String mPhone;
    private String mSchedule;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constructor
    public Place(String name, String description, String address, String website,
                 String schedule, String phone, int imageResourceId) {

        mName = name;
        mDescription = description;
        mAddress = address;
        mWebsite = website;
        mSchedule = schedule;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

   // Getters
    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getSchedule() {
        return mSchedule;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Helpers
    public boolean hasDescription() {
        return mDescription != null;
    }

    public boolean hasWebsite(){
        return getWebsite() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasSchedule(){
        return getSchedule() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        String output;
        output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId();

        return output;
    }
}

