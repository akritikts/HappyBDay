package in.silive.happyb_day.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import in.silive.happyb_day.Adapters.SListAdapter;
import in.silive.happyb_day.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeUpto extends Fragment {
    ListView stud_list;
    String s_name[]= {"Abhinandan Agarwal","Akriti Verma","Anant Srivastava","Manisha Mishra","Nihal Rastogi","Prakhar Sharma","Srishti Lalchandani","Yash Raj"};
    String s_ocp[] = {"Web Development","Android Application Development","Database Management","Java and .Net","Mechanical Engineering","Web development","C and Java","Java"};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public WeUpto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_we_upto, container, false);
        stud_list = (ListView)view.findViewById(R.id.stud_list);
        stud_list.setAdapter(new SListAdapter(s_name,s_ocp,getContext()));
        return view;
    }

}
