package plazmid.naktelecome.DrawerActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;

import plazmid.naktelecome.Adapters.KmPagerAdapter;
import plazmid.naktelecome.MainPageActivity;
import plazmid.naktelecome.R;

public class KMActivity extends AppCompatActivity {


    private ImageButton archive_btn;
    private ImageButton aboutus_btn;
    private ImageButton fact_btn;
    private ImageButton contactus_btn;
    private ImageButton mainpage_btn;
    Boolean backClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        KmPagerAdapter kmPagerAdapter = new KmPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(kmPagerAdapter);
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(pager);

        mainpage_btn = (ImageButton) findViewById(R.id.mainpage_org);
        aboutus_btn = (ImageButton) findViewById(R.id.aboutus_org);
        fact_btn = (ImageButton) findViewById(R.id.facts_org);
        contactus_btn = (ImageButton) findViewById(R.id.contactus_org);


//

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();


        if (backClicked == true) {
            finish();
        } else {
            Toast.makeText(this, "برای خروج از برنامه بار دیگر کلیک کنید", Toast.LENGTH_SHORT).show();
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                backClicked = false;
            }
        }, 3000);


        backClicked = true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case android.R.id.home:
                Intent GotoHome = new Intent(KMActivity.this, MainPageActivity.class);
                startActivity(GotoHome);
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
