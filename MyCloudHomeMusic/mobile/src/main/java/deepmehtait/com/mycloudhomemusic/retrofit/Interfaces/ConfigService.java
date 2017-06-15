package deepmehtait.com.mycloudhomemusic.retrofit.Interfaces;

import deepmehtait.com.mycloudhomemusic.constants.GenConstants;
import deepmehtait.com.mycloudhomemusic.modals.configUrl.ConfigUrl;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by deepmetha on 6/14/17.
 */

public interface ConfigService {
    public String URL = GenConstants.CONFIG_URL;
    @GET("/config/v1/config/")
    Call<ConfigUrl> getConfigservice();

}
