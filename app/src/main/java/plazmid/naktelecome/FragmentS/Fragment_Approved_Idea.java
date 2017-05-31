package plazmid.naktelecome.FragmentS;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import plazmid.naktelecome.R;

/**
 * Created by soroush on 3/30/2017 AD.
 */

public class Fragment_Approved_Idea extends Fragment {

    public static Fragment_Approved_Idea fragment_approved_idea;

    public static Fragment_Approved_Idea newInstance() {

        if (fragment_approved_idea == null)
            fragment_approved_idea = new Fragment_Approved_Idea();
        return fragment_approved_idea;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_approved_idea_layout, container, false);

        return v;

    }


}