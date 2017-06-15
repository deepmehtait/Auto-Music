package deepmehtait.com.mycloudhomemusic;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import deepmehtait.com.mycloudhomemusic.modals.configUrl.CloudServiceUrls;
import deepmehtait.com.mycloudhomemusic.utils.Validator;

public class MainActivity extends AppCompatActivity {

    EditText emailId, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("splash", "#########");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        emailId = (EditText) findViewById(R.id.input_email);
        password = (EditText) findViewById(R.id.input_password);
        login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = emailId.getText().toString();
                final String pass = password.getText().toString();
                if(!Validator.isValidEmail(email)) {
                    emailId.setError("Invalid Email");
                }
                if(!Validator.isValidPassword(pass)) {
                    password.setError("Min 8 characters");
                }
            }
        });
    }
}
