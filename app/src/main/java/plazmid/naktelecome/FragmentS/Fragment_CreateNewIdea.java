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

public class Fragment_CreateNewIdea extends Fragment {

    public static Fragment_CreateNewIdea fragment_createNewIdea;

    public static Fragment_CreateNewIdea newInstance() {

        if (fragment_createNewIdea == null)
            fragment_createNewIdea = new Fragment_CreateNewIdea();
        return fragment_createNewIdea;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_create_idea_layout, container, false);


        return v;

    }


}