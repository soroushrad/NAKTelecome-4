package plazmid.naktelecome.FragmentS;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import plazmid.naktelecome.DrawerActivity.AboutUSActivity;
import plazmid.naktelecome.DrawerActivity.FactsActivity;
import plazmid.naktelecome.DrawerActivity.KMActivity;
import plazmid.naktelecome.R;

/**
 * Created by soroush on 3/30/2017 AD.
 */

public class Fragment_DrawerActivity extends Fragment {

    public static Fragment_DrawerActivity fragment_drawerActivity;

    public static Fragment_DrawerActivity newInstance() {

        if (fragment_drawerActivity == null)
            fragment_drawerActivity = new Fragment_DrawerActivity();
        return fragment_drawerActivity;
    }

    private SearchView searchView;
    private TextView contactus_text;
    private TextView facts_pic;
    private TextView knowledge_pic;
    private TextView aboutus_pic;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_drawer_layout, container, false);


        searchView = (SearchView) v.findViewById(R.id.searchBox);
        CharSequence query = searchView.getQuery();


        contactus_text = (TextView) v.findViewById(R.id.contactus_text);
        aboutus_pic = (TextView) v.findViewById(R.id.aboutus_pic);
        knowledge_pic = (TextView) v.findViewById(R.id.knowledge_pic);
        facts_pic = (TextView) v.findViewById(R.id.facts_pic);
        contactus_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent GotoContactUs = new Intent(getActivity(), ContactUsActivity.class);
                // startActivity(GotoContactUs);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ext.soroush.mostofirad@nak-mci.ir"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "NAK Telecom Android feedback");
                startActivity(Intent.createChooser(intent, "لطفا سرویس دهنده ایمیل خود را انتخاب کنید :)"));


            }
        });
        aboutus_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GotoAbouttUs = new Intent(getActivity(), AboutUSActivity.class);
                startActivity(GotoAbouttUs);


            }
        });
        facts_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GotoContactUs = new Intent(getActivity(), FactsActivity.class);
                startActivity(GotoContactUs);


            }
        });

        knowledge_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GotoContactUs = new Intent(getActivity(), KMActivity.class);
                startActivity(GotoContactUs);


            }
        });


        return v;

    }


}