package deepmehtait.com.mycloudhomemusic.modals.configUrl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;
import java.io.Serializable;

/**
 * Created by deepmetha on 6/14/17.
 */

public class ConfigUrl implements Serializable {
    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }
    public void setData (Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
