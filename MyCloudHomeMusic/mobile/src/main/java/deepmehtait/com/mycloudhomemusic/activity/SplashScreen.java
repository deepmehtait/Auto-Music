package deepmehtait.com.mycloudhomemusic.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import deepmehtait.com.mycloudhomemusic.MainActivity;
import deepmehtait.com.mycloudhomemusic.modals.configUrl.CloudServiceUrls;
import deepmehtait.com.mycloudhomemusic.modals.configUrl.ConfigUrl;
import deepmehtait.com.mycloudhomemusic.retrofit.Interfaces.ConfigService;
import deepmehtait.com.mycloudhomemusic.retrofit.Utils.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by deepmetha on 6/13/17.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("splash", "------");
        super.onCreate(savedInstanceState);
        Log.d("splash", "started");
        Log.d("splash", "Call");
        ConfigService mConfigService = ApiUtils.getConfigservice();
        mConfigService.getConfigservice().enqueue(new Callback<ConfigUrl>() {
            @Override
            public void onResponse(Call<ConfigUrl> call, Response<ConfigUrl> response) {
                if (response.isSuccessful()) {
                    Log.d("success","got response"+ response.body().getData().getComponentMap().getCloudServiceUrls().getServiceAuth0Url());
                    CloudServiceUrls cloudServiceUrls = response.body().getData().getComponentMap().getCloudServiceUrls();
                    Gson gson = new Gson();
                    String json = gson.toJson(cloudServiceUrls);
                    Log.d("urls", json);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("cloudServiceUrls", json);
                    editor.commit();

                } else {
                    Log.d("error","yyyy");
                }
            }

            @Override
            public void onFailure(Call<ConfigUrl> call, Throwable t) {
                Log.d("error","xxxx"+ t.toString());
            }
        });
        Intent intent = new Intent(this, MainActivity.class);
        Log.d("splash", "start activity");
        startActivity(intent);
        finish();
    }
}
