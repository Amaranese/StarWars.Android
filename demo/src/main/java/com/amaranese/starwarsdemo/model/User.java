package com.amaranese.starwarsdemo.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import com.amaranese.starwarsdemo.R;

/**
 * Created by Artem Kholodnyi on 11/19/15.
 */
public class User {
    private final String mFullName;
    private final boolean mDarkSide;
    private final String mHomeworld;
    private final String mBirthday;

    public User(boolean darkSide, String fullName, String homeworld, String birthday) {
        mDarkSide = darkSide;
        mFullName = fullName;
        mHomeworld = homeworld;
        mBirthday = birthday;
    }

    public @DrawableRes int getPhotoRes() {
        return mDarkSide ? R.drawable.darth : R.drawable.anakin;
    }

    public boolean isDarkSide() {
        return mDarkSide;
    }

    public String getFullName() {
        return mFullName;
    }

    public String getHomeworld() {
        return mHomeworld;
    }

    public String getBirthday() {
        return mBirthday;
    }

    public @StringRes int getSideText() {
        return isDarkSide() ? R.string.dark_side_label : R.string.light_side_label;
    }
}
