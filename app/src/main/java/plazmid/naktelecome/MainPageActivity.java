package plazmid.naktelecome;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import plazmid.naktelecome.DrawerActivity.AboutUSActivity;
import plazmid.naktelecome.DrawerActivity.FactsActivity;
import plazmid.naktelecome.DrawerActivity.FoodActivity;
import plazmid.naktelecome.DrawerActivity.KMActivity;

public class MainPageActivity extends AppCompatActivity {
    private TextView persian_cal;
    private ImageButton archive_btn;
    private ImageButton facts_btn;
    private ImageButton km_btn;
    private ImageButton food_btn;
    private ImageButton contactus_btn;
    private ImageButton Exit_img;
    private ImageButton aboutus_btn;
    Boolean backClicked = false;
    private DrawerLayout mDrawerLayout;
    private TextView safeAsli_txt;
    private TextView Archive_txt;
    private TextView contactus_text;
    private TextView aboutus_txt;
    private TextView facts_txt;
    private TextView food_txt;
    private TextView exit_txt;
    private TextView knowledge_txt;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.DrawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        persian_cal = (TextView) findViewById(R.id.persian_cal);

        PersianCalendar sc = new PersianCalendar();
        String s = sc.strWeekDay + " " + sc.day + " " +
                sc.strMonth + " " + sc.year;

        persian_cal.setText(s);


        Typeface nastaligh = Typeface.createFromAsset(getAssets(), "iranNastaliq.ttf");
        Typeface Yekan = Typeface.createFromAsset(getAssets(), "BYekan+.ttf");
        Typeface sans = Typeface.createFromAsset(getAssets(), "AIranianSans.ttf");
        Typeface Fantastic = Typeface.createFromAsset(getAssets(), "Fantastic Beasts Fa.ttf");
        Typeface Entezar = Typeface.createFromAsset(getAssets(), "Entezar.ttf");
        Typeface khandevaneh = Typeface.createFromAsset(getAssets(), "Khandevane.ttf");
        persian_cal.setTypeface(Fantastic);

        food_txt = (TextView) findViewById(R.id.food_txt);
        safeAsli_txt = (TextView) findViewById(R.id.safeAsli_txt);
        exit_txt = (TextView) findViewById(R.id.Exit_txt);
        aboutus_txt = (TextView) findViewById(R.id.aboutus_txt);
        contactus_text = (TextView) findViewById(R.id.contactus_text);
        knowledge_txt = (TextView) findViewById(R.id.knowledge_txt);
        facts_txt = (TextView) findViewById(R.id.facts_txt);
        Archive_txt = (TextView) findViewById(R.id.Archive_txt);
        Exit_img = (ImageButton) findViewById(R.id.Exit_img);
        aboutus_btn = (ImageButton) findViewById(R.id.aboutus_org);
        km_btn = (ImageButton) findViewById(R.id.km_org);
        food_btn = (ImageButton) findViewById(R.id.food_img);
        facts_btn = (ImageButton) findViewById(R.id.facts_org);
        contactus_btn = (ImageButton) findViewById(R.id.contactus_org);
        safeAsli_txt.setTypeface(Yekan);
        Archive_txt.setTypeface(Yekan);
        facts_txt.setTypeface(Yekan);
        knowledge_txt.setTypeface(Yekan);
        contactus_text.setTypeface(Yekan);
        aboutus_txt.setTypeface(Yekan);
        exit_txt.setTypeface(Yekan);
        food_txt.setTypeface(Yekan);

        aboutus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tunnel_aboutUs = new Intent(MainPageActivity.this, AboutUSActivity.class);
                startActivity(Tunnel_aboutUs);
                finish();
            }
        });

        contactus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ext.soroush.mostofirad@nak-mci.ir"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "NAK Telecom Android feedback");
                startActivity(Intent.createChooser(intent, "لطفا سرویس دهنده ایمیل خود را انتخاب کنید :)"));
            }
        });
        km_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tunnel_KM = new Intent(MainPageActivity.this, KMActivity.class);
                Tunnel_KM.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Tunnel_KM);
                finish();

            }
        });
        facts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tunnel_Fact = new Intent(MainPageActivity.this, FactsActivity.class);
                startActivity(Tunnel_Fact);
                finish();

            }
        });


        exit_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Tunnel_loginPage = new Intent(MainPageActivity.this, LoginPage.class);
                startActivity(Tunnel_loginPage);
                finish();


            }
        });

        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tunnel_FoodPage = new Intent(MainPageActivity.this, FoodActivity.class);
                startActivity(Tunnel_FoodPage);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_page_actionbar, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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
}
