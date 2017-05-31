package plazmid.naktelecome;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Enter;
    private TextView reset_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        Username = (EditText) findViewById(R.id.loginpage_username);
        reset_pwd = (TextView) findViewById(R.id.reset_pwd);
        Password = (EditText) findViewById(R.id.loginpage_password);
        Enter = (Button) findViewById(R.id.loginpage_enter);

        Typeface Khandevaneh_font = Typeface.createFromAsset(getAssets(), "Khandevane.ttf");
        Username.setTypeface(Khandevaneh_font);
        Password.setTypeface(Khandevaneh_font);
        Enter.setTypeface(Khandevaneh_font);


//        reset_pwd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ext.soroush.mostofirad@nak-mci.ir"});
//                intent.putExtra(Intent.EXTRA_SUBJECT, "Request-Reset Password");
//                intent.putExtra(Intent.EXTRA_TEXT,"با سلام خواهشمند است رمز عبور اینجانب را ریست فرمایید");
//                startActivity(Intent.createChooser(intent, "لطفا سرویس دهنده ایمیل خود را انتخاب کنید :)"));
//
//
//            }
//        });

    }
}
