package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by saruni on 1/14/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }
}
