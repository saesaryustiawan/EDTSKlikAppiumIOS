package common.constants;

import static util.PropertyFileReader.getPropertyValue;

/**
 * Project Name    : KlikAppiumIOS
 * Developer       : Saesar Yustiawan
 * Version         : 1.0.0
 * Description     :
 **/

public class DriverConstants {
    // Appium Constants
    public static final String APPIUM_URL = getAppiumPropertyValue("appium_url");
    public static final Long APPIUM_DRIVER_TIMEOUT_IN_SECONDS = Long.parseLong(
            getAppiumPropertyValue("appium_driver_timeout_in_seconds")
    );

    // Android Constants
    public static final String ANDROID = "ANDROID";
    public static final String ANDROID_DEVICE_NAME = getDevicePropertyValue("android_device_name");
    public static final String ANDROID_AUTOMATION_NAME = getDevicePropertyValue("android_automation_name");
    public static final String ANDROID_PLATFORM_VERSION = getDevicePropertyValue("android_platform_version");
    public static final String ANDROID_APP_FILE_PATH = getDevicePropertyValue("android_app_file_path");
    public static final String ANDROID_APP_PACKAGE = getDevicePropertyValue("android_app_package");
    public static final String ANDROID_APP_ACTIVITY = getDevicePropertyValue("android_app_activity");
    public static final String ANDROID_NO_RESET = getDevicePropertyValue("android_no_reset");
    public static final String ANDROID_FULL_RESET = getDevicePropertyValue("android_full_reset");

    // iOS Constants
    public static final String IOS = "IOS";
    public static final String IOS_DEVICE_NAME = getDevicePropertyValue("ios_device_name");
    public static final String IOS_AUTOMATION_NAME = getDevicePropertyValue("ios_automation_name");
    public static final String IOS_PLATFORM_VERSION = getDevicePropertyValue("ios_platform_version");
    public static final String IOS_APP_FILE_PATH = getDevicePropertyValue("ios_app_file_path");
    public static final String IOS_SHOULD_TERMINATE_APP = getDevicePropertyValue("ios_should_terminate_app");
    public static final String IOS_NO_RESET = getDevicePropertyValue("ios_no_reset");
    public static final String IOS_FULL_RESET = getDevicePropertyValue("ios_full_reset");

    //ENV Constants
    public static final String BUNDLEID_KLIK = getEnvPropertyValue("bundleid_klik");
    public static final String API_URL = getEnvPropertyValue("api_url");


    private static String getAppiumPropertyValue(String propertyName) {
        return getPropertyValue("appium.properties", propertyName);
    }

    private static String getDevicePropertyValue(String propertyName) {
        return getPropertyValue("device.properties", propertyName);
    }

    private static String getEnvPropertyValue(String propertyName) {
        return getPropertyValue("environment.properties", propertyName);
    }
}
