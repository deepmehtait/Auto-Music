package deepmehtait.com.mycloudhomemusic.modals.configUrl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by deepmetha on 6/14/17.
 */

public class Data implements Serializable {

    @SerializedName("configurationId")
    @Expose
    private String configurationId;
    @SerializedName("componentMap")
    @Expose
    private ComponentMap componentMap;

    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public ComponentMap getComponentMap() {
        return componentMap;
    }

    public void setComponentMap(ComponentMap componentMap) {
        this.componentMap = componentMap;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}