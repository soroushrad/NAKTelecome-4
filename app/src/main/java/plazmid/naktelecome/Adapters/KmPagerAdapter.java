package plazmid.naktelecome.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import plazmid.naktelecome.FragmentS.Fragment_Approved_Idea;
import plazmid.naktelecome.FragmentS.Fragment_ContactToKM;
import plazmid.naktelecome.FragmentS.Fragment_CreateNewIdea;

/**
 * Created by soroush on 3/31/2017 AD.
 */

public class KmPagerAdapter extends FragmentPagerAdapter {
    public KmPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return Fragment_CreateNewIdea.newInstance();
        if (position == 1)
            return Fragment_Approved_Idea.newInstance();
        if (position == 2)
            return Fragment_ContactToKM.newInstance();


        return null;

    }


    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0)
            return "ثبت ایده جدید";
        if (position==1)
            return "ایده های ثبت شده";
        if (position==2)
            return "ارتباط با واحد نوآوری";



        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
