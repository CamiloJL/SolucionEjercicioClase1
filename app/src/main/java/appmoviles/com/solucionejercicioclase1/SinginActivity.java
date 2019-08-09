package appmoviles.com.solucionejercicioclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

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


        singinRegistrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(singinEmailEt.getText().toString().isEmpty()
                    || singinPassEt.getText().toString().isEmpty()
                        || singinRePassEt.getText().toString().isEmpty()){
                    Toast.makeText(SinginActivity.this, "Uno de los campos está vacio", Toast.LENGTH_SHORT).show();
                    return;
                }if(!singinPassEt.getText().toString().equals(singinRePassEt.getText().toString())){
                    Toast.makeText(SinginActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i = new Intent();
                i.putExtra("resultado", "registro exitoso");
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
