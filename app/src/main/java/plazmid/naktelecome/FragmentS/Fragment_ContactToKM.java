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

public class Fragment_ContactToKM extends Fragment {

    public static Fragment_ContactToKM fragment_contactToKM;

    public static Fragment_ContactToKM newInstance() {

        if (fragment_contactToKM == null)
            fragment_contactToKM = new Fragment_ContactToKM();
        return fragment_contactToKM;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_contact_km_layout, container, false);


        return v;

    }


}