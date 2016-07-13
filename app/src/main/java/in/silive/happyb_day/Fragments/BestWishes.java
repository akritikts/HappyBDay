package in.silive.happyb_day.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.silive.happyb_day.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BestWishes extends Fragment {


    public BestWishes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_best_wishes, container, false);
    }

}
