package plazmid.naktelecome.DrawerActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import plazmid.naktelecome.MainPageActivity;
import plazmid.naktelecome.R;

public class AboutUSActivity extends AppCompatActivity {
    private ImageButton archive_btn;
    private ImageButton facts_btn;
    private ImageButton km_btn;
    private ImageButton contactus_btn;
    private ImageButton mainpage_btn;
    Boolean backClicked = false;
    private TextView intro_text;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Intent GotoHome = new Intent(AboutUSActivity.this, MainPageActivity.class);
                startActivity(GotoHome);
                return true;


        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        intro_text=(TextView)findViewById(R.id.intro_text);
        Typeface nastaligh = Typeface.createFromAsset(getAssets(), "iranNastaliq.ttf");
        intro_text.setTypeface(nastaligh);


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
