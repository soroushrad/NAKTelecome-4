package plazmid.naktelecome.DrawerActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import plazmid.naktelecome.R;

public class FoodActivity extends AppCompatActivity {


    private WebView food_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        String Food_url = "http://5.160.202.6:2007/webrest/Default.aspx?expired=True";

        food_view = (WebView) findViewById(R.id.web_food);
        food_view.getSettings().setJavaScriptEnabled(true);
        food_view.setWebViewClient(new WebViewClient());

        food_view.loadUrl(Food_url);
    }
}
