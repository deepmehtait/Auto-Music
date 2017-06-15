package deepmehtait.com.mycloudhomemusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("splash", "#########");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }
}
