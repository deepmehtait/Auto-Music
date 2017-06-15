package deepmehtait.com.mycloudhomemusic.modals.configUrl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by deepmetha on 6/14/17.
 */

public class CloudServiceUrls implements Serializable {

    private final static long serialVersionUID = 5936916711279979367L;
    @SerializedName("analytics.client.desktop.macOS.url")
    @Expose
    private String analyticsClientDesktopMacOSUrl;
    @SerializedName("service.device.url")
    @Expose
    private String serviceDeviceUrl;
    @SerializedName("service.das.url")
    @Expose
    private String serviceDasUrl;
    @SerializedName("service.tsm.url")
    @Expose
    private String serviceTsmUrl;
    @SerializedName("service.ota.url")
    @Expose
    private String serviceOtaUrl;
    @SerializedName("analytics.url")
    @Expose
    private String analyticsUrl;
    @SerializedName("webclient.desktop.app.url")
    @Expose
    private String webclientDesktopAppUrl;
    @SerializedName("webclient.new_session.url")
    @Expose
    private String webclientNewSessionUrl;
    @SerializedName("service.feebackservice.url")
    @Expose
    private String serviceFeebackserviceUrl;
    @SerializedName("service.auth0.url")
    @Expose
    private String serviceAuth0Url;
    @SerializedName("service.swupdate.url")
    @Expose
    private String serviceSwupdateUrl;
    @SerializedName("analytics.client.desktop.windows.url")
    @Expose
    private String analyticsClientDesktopWindowsUrl;
    @SerializedName("service.communication.ws.url")
    @Expose
    private String serviceCommunicationWsUrl;
    @SerializedName("analytics.device.url")
    @Expose
    private String analyticsDeviceUrl;
    @SerializedName("service.auth.url")
    @Expose
    private String serviceAuthUrl;
    @SerializedName("service.logdump.url")
    @Expose
    private String serviceLogdumpUrl;
    @SerializedName("webclient.mycloud.url")
    @Expose
    private String webclientMycloudUrl;
    @SerializedName("service.config.url")
    @Expose
    private String serviceConfigUrl;
    @SerializedName("service.communication.url")
    @Expose
    private String serviceCommunicationUrl;
    @SerializedName("service.share.url")
    @Expose
    private String serviceShareUrl;
    @SerializedName("service.portal.url")
    @Expose
    private String servicePortalUrl;
    @SerializedName("service.notification.url")
    @Expose
    private String serviceNotificationUrl;
    @SerializedName("webclient.signup.url")
    @Expose
    private String webclientSignupUrl;
    @SerializedName("service.appcatalog.url")
    @Expose
    private String serviceAppcatalogUrl;
    @SerializedName("analytics.client.mobile.url")
    @Expose
    private String analyticsClientMobileUrl;
    @SerializedName("service.sumoproxy.url")
    @Expose
    private String serviceSumoproxyUrl;
    @SerializedName("webclient.forgot_password.url")
    @Expose
    private String webclientForgotPasswordUrl;
    @SerializedName("service.client.url")
    @Expose
    private String serviceClientUrl;

    public String getAnalyticsClientDesktopMacOSUrl() {
        return analyticsClientDesktopMacOSUrl;
    }

    public void setAnalyticsClientDesktopMacOSUrl(String analyticsClientDesktopMacOSUrl) {
        this.analyticsClientDesktopMacOSUrl = analyticsClientDesktopMacOSUrl;
    }

    public String getServiceDeviceUrl() {
        return serviceDeviceUrl;
    }

    public void setServiceDeviceUrl(String serviceDeviceUrl) {
        this.serviceDeviceUrl = serviceDeviceUrl;
    }

    public String getServiceDasUrl() {
        return serviceDasUrl;
    }

    public void setServiceDasUrl(String serviceDasUrl) {
        this.serviceDasUrl = serviceDasUrl;
    }

    public String getServiceTsmUrl() {
        return serviceTsmUrl;
    }

    public void setServiceTsmUrl(String serviceTsmUrl) {
        this.serviceTsmUrl = serviceTsmUrl;
    }

    public String getServiceOtaUrl() {
        return serviceOtaUrl;
    }

    public void setServiceOtaUrl(String serviceOtaUrl) {
        this.serviceOtaUrl = serviceOtaUrl;
    }

    public String getAnalyticsUrl() {
        return analyticsUrl;
    }

    public void setAnalyticsUrl(String analyticsUrl) {
        this.analyticsUrl = analyticsUrl;
    }

    public String getWebclientDesktopAppUrl() {
        return webclientDesktopAppUrl;
    }

    public void setWebclientDesktopAppUrl(String webclientDesktopAppUrl) {
        this.webclientDesktopAppUrl = webclientDesktopAppUrl;
    }

    public String getWebclientNewSessionUrl() {
        return webclientNewSessionUrl;
    }

    public void setWebclientNewSessionUrl(String webclientNewSessionUrl) {
        this.webclientNewSessionUrl = webclientNewSessionUrl;
    }

    public String getServiceFeebackserviceUrl() {
        return serviceFeebackserviceUrl;
    }

    public void setServiceFeebackserviceUrl(String serviceFeebackserviceUrl) {
        this.serviceFeebackserviceUrl = serviceFeebackserviceUrl;
    }

    public String getServiceAuth0Url() {
        return serviceAuth0Url;
    }

    public void setServiceAuth0Url(String serviceAuth0Url) {
        this.serviceAuth0Url = serviceAuth0Url;
    }

    public String getServiceSwupdateUrl() {
        return serviceSwupdateUrl;
    }

    public void setServiceSwupdateUrl(String serviceSwupdateUrl) {
        this.serviceSwupdateUrl = serviceSwupdateUrl;
    }

    public String getAnalyticsClientDesktopWindowsUrl() {
        return analyticsClientDesktopWindowsUrl;
    }

    public void setAnalyticsClientDesktopWindowsUrl(String analyticsClientDesktopWindowsUrl) {
        this.analyticsClientDesktopWindowsUrl = analyticsClientDesktopWindowsUrl;
    }

    public String getServiceCommunicationWsUrl() {
        return serviceCommunicationWsUrl;
    }

    public void setServiceCommunicationWsUrl(String serviceCommunicationWsUrl) {
        this.serviceCommunicationWsUrl = serviceCommunicationWsUrl;
    }

    public String getAnalyticsDeviceUrl() {
        return analyticsDeviceUrl;
    }

    public void setAnalyticsDeviceUrl(String analyticsDeviceUrl) {
        this.analyticsDeviceUrl = analyticsDeviceUrl;
    }

    public String getServiceAuthUrl() {
        return serviceAuthUrl;
    }

    public void setServiceAuthUrl(String serviceAuthUrl) {
        this.serviceAuthUrl = serviceAuthUrl;
    }

    public String getServiceLogdumpUrl() {
        return serviceLogdumpUrl;
    }

    public void setServiceLogdumpUrl(String serviceLogdumpUrl) {
        this.serviceLogdumpUrl = serviceLogdumpUrl;
    }

    public String getWebclientMycloudUrl() {
        return webclientMycloudUrl;
    }

    public void setWebclientMycloudUrl(String webclientMycloudUrl) {
        this.webclientMycloudUrl = webclientMycloudUrl;
    }

    public String getServiceConfigUrl() {
        return serviceConfigUrl;
    }

    public void setServiceConfigUrl(String serviceConfigUrl) {
        this.serviceConfigUrl = serviceConfigUrl;
    }

    public String getServiceCommunicationUrl() {
        return serviceCommunicationUrl;
    }

    public void setServiceCommunicationUrl(String serviceCommunicationUrl) {
        this.serviceCommunicationUrl = serviceCommunicationUrl;
    }

    public String getServiceShareUrl() {
        return serviceShareUrl;
    }

    public void setServiceShareUrl(String serviceShareUrl) {
        this.serviceShareUrl = serviceShareUrl;
    }

    public String getServicePortalUrl() {
        return servicePortalUrl;
    }

    public void setServicePortalUrl(String servicePortalUrl) {
        this.servicePortalUrl = servicePortalUrl;
    }

    public String getServiceNotificationUrl() {
        return serviceNotificationUrl;
    }

    public void setServiceNotificationUrl(String serviceNotificationUrl) {
        this.serviceNotificationUrl = serviceNotificationUrl;
    }

    public String getWebclientSignupUrl() {
        return webclientSignupUrl;
    }

    public void setWebclientSignupUrl(String webclientSignupUrl) {
        this.webclientSignupUrl = webclientSignupUrl;
    }

    public String getServiceAppcatalogUrl() {
        return serviceAppcatalogUrl;
    }

    public void setServiceAppcatalogUrl(String serviceAppcatalogUrl) {
        this.serviceAppcatalogUrl = serviceAppcatalogUrl;
    }

    public String getAnalyticsClientMobileUrl() {
        return analyticsClientMobileUrl;
    }

    public void setAnalyticsClientMobileUrl(String analyticsClientMobileUrl) {
        this.analyticsClientMobileUrl = analyticsClientMobileUrl;
    }

    public String getServiceSumoproxyUrl() {
        return serviceSumoproxyUrl;
    }

    public void setServiceSumoproxyUrl(String serviceSumoproxyUrl) {
        this.serviceSumoproxyUrl = serviceSumoproxyUrl;
    }

    public String getWebclientForgotPasswordUrl() {
        return webclientForgotPasswordUrl;
    }

    public void setWebclientForgotPasswordUrl(String webclientForgotPasswordUrl) {
        this.webclientForgotPasswordUrl = webclientForgotPasswordUrl;
    }

    public String getServiceClientUrl() {
        return serviceClientUrl;
    }

    public void setServiceClientUrl(String serviceClientUrl) {
        this.serviceClientUrl = serviceClientUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
