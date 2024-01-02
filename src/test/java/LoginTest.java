import org.testng.annotations.Test;

import static common.constants.LoginConstants.*;

public class LoginTest extends BaseTest {

    @Test(description = "Login with Phone Number, First Install")
    public void LoginWithPhoneNumber() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
    }

    @Test(description = "Login with Email, First Install", enabled = false)
    public void LoginWithEmail() throws InterruptedException {
        screen().getLoginScreen().login(
                EMAIL,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
    }
}
