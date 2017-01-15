package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by saruni on 1/15/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
