package appmoviles.com.solucionejercicioclase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SinginActivity extends AppCompatActivity {

    private EditText singinEmailEt, singinPassEt, singinRePassEt;
    private Button singinRegistrarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        singinEmailEt = findViewById(R.id.singin_email_et);
        singinPassEt = findViewById(R.id.singin_pass_et);
        singinRePassEt = findViewById(R.id.singin_repass_et);
        singinRegistrarBtn = findViewById(R.id.singin_singin_et);

        String email = getIntent().getExtras().getString("email");
        singinEmailEt.setText(email);
    }
}
