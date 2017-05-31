package plazmid.naktelecome.DrawerActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import plazmid.naktelecome.R;

public class KM_AddRequestActivity extends AppCompatActivity {

    private Spinner item_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_idea_layout);


        item_spinner = (Spinner) findViewById(R.id.item_spinner);



    }
}
