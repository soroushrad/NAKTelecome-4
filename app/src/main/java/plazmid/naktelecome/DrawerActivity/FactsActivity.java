package plazmid.naktelecome.DrawerActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ListView;

import plazmid.naktelecome.Adapters.FactListAdapter;
import plazmid.naktelecome.MainPageActivity;
import plazmid.naktelecome.R;

public class FactsActivity extends AppCompatActivity {
    private ImageButton archive_btn;
    private ImageButton aboutus_btn;
    private ImageButton km_btn;
    private ImageButton contactus_btn;
    private ImageButton mainpage_btn;

    private ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts_listview);


        mylist = (ListView) findViewById(R.id.my_list);
        Integer icons[] = {
                R.drawable.it_icons,
                R.drawable.legal_icons,
                R.drawable.hse_icon,
                R.drawable.telecom_icon,
        };
        String names[] = {"فناوری اطلاعات", "حقوقی", "HSE", "مخابرات"};
        final Typeface khandevaneh = Typeface.createFromAsset(getAssets(), "Khandevane.ttf");
        FactListAdapter factListAdapter = new FactListAdapter(FactsActivity.this, names, icons);


        mylist.setAdapter(factListAdapter);


        mainpage_btn = (ImageButton) findViewById(R.id.mainpage_org);
        aboutus_btn = (ImageButton) findViewById(R.id.aboutus_org);
        km_btn = (ImageButton) findViewById(R.id.km_org);
        contactus_btn = (ImageButton) findViewById(R.id.contactus_org);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Intent GotoHome = new Intent(FactsActivity.this, MainPageActivity.class);
                startActivity(GotoHome);
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
