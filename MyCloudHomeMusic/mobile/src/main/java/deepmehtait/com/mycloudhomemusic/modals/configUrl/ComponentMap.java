package deepmehtait.com.mycloudhomemusic.modals.configUrl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by deepmetha on 6/14/17.
 */

public class ComponentMap implements Serializable {

    private final static long serialVersionUID = 4633420179549858596L;
    @SerializedName("cloud.service.urls")
    @Expose
    private CloudServiceUrls cloudServiceUrls;

    public CloudServiceUrls getCloudServiceUrls() {
        return cloudServiceUrls;
    }

    public void setCloudServiceUrls(CloudServiceUrls cloudServiceUrls) {
        this.cloudServiceUrls = cloudServiceUrls;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
