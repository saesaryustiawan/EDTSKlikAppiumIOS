package common.constants;

import static util.PropertyFileReader.getPropertyValue;


public class LoginConstants {
    // Login Data Property File Path
    public static final String LOGIN_DATA_PROPERTY_FILE_PATH = "test_data/login_data.properties";

    // Login Credentials
    public static final String PHONE_NO = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "phoneNo");
    public static final String PASSWORD = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "password");
    public static final String EMAIL = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "email");
}
