package deepmehtait.com.mycloudhomemusic.retrofit.Utils;

import android.util.Log;

import deepmehtait.com.mycloudhomemusic.constants.GenConstants;
import deepmehtait.com.mycloudhomemusic.modals.configUrl.ConfigUrl;
import deepmehtait.com.mycloudhomemusic.retrofit.Interfaces.ConfigService;
import deepmehtait.com.mycloudhomemusic.retrofit.client.RetrofitClient;

/**
 * Created by deepmetha on 6/14/17.
 */

public class ApiUtils {

    public static ConfigService getConfigservice() {
        Log.d("config",GenConstants.CONFIG_URL);
        return RetrofitClient.getClient("https://dev1-config.remotewd1.com/config/v1/config/").create(ConfigService.class);
    }
}
