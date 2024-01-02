package util.driver;

public class MobileDriverFactory {
    public MobileDriverService getDriverService() {
        MobileDriverService driver;
        //final String platform = System.getProperty("IOS");
//        if (platform != null) {
//            switch (platform.toUpperCase()) {
//                case ANDROID:
//                    driver = new AndroidDriverServiceImpl();
//                    break;
//                case IOS:
//                    driver = new IosDriverServiceImpl();
//                    break;
//                default:
//                    throw new InvalidParameterException("Please use platform as '" + ANDROID + "' or '" + IOS + "'");
//            }
//        } else
//            driver = new AndroidDriverServiceImpl();
        driver = new IosDriverServiceImpl();
        return driver;
    }
}
