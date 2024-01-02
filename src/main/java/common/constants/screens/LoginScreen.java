package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseScreen {
    private final By gabungButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Gabung Sekarang\"`]");
    private final By akunButton = MobileBy.AccessibilityId("Akun");
    private final By masukOrDaftarButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Masuk / Daftar \"`]");
    private final By phoneNoOrEmailTextBox = MobileBy.className("XCUIElementTypeTextField");
    private final By lanjutkanButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Lanjutkan\"`]");
    private final By showPasswordButton = MobileBy.AccessibilityId("ic invisible gray");
    private final By passwordTextBox = MobileBy.className("XCUIElementTypeTextField");
    private final By loginButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Masuk\"`]");
    private final By confirmUpdateVersion = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Nanti Saja\"`]");
    private final By logoutButton = MobileBy.AccessibilityId("Logout");

    private void setPhoneNoOrEmail(String phoneNoOrEmail) {
        inputText(phoneNoOrEmailTextBox, phoneNoOrEmail);
    }
    private void getLoginPage() {
        if(isDisplayed(gabungButton)) {
            //login via registration
            tap(gabungButton);
        } else if(isDisplayed(akunButton)) {
            //login via profile
            clickConfirmUpdateVersion();
            tap(akunButton);
            tap(masukOrDaftarButton);
        } else {
            //when user login
            tap(logoutButton);
            clickConfirmUpdateVersion();
            tap(akunButton);
            tap(masukOrDaftarButton);
        }
    }
    private void clickLanjutkanButton() {
        tap(lanjutkanButton);
    }
    private void clickShowPasswordButton() {
        tap(showPasswordButton);
    }
    private void setPasswordTextBox(String password) {
        inputText(passwordTextBox, password);

    }
    private void clickMasukButton() {
        tap(loginButton);
    }
    private void clickConfirmUpdateVersion() {
        if(isDisplayed(confirmUpdateVersion)) {
            tap(confirmUpdateVersion);
        }
    }
//    private void clickLogoutButton() {
//            tap(logoutButton);
//    }

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public void login(String phoneNoOrEmail, String password) throws InterruptedException {
        getLoginPage();
        Thread.sleep(1000);
        setPhoneNoOrEmail(phoneNoOrEmail);
        clickLanjutkanButton();
        Thread.sleep(2000);
        clickShowPasswordButton();
        setPasswordTextBox(password);
        clickMasukButton();
        Thread.sleep(3000);
        clickConfirmUpdateVersion();
        Thread.sleep(5000);
    }

//    public void logout() {
//        tap(akunButton);
//        clickLogoutButton();
//    }
}
