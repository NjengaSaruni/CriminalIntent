package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by saruni on 1/14/17.
 */

public class Crime {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }
}
