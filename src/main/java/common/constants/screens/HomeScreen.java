package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BaseScreen {

    private final By buttonCloseHomePopUpAlamat = MobileBy.AccessibilityId("ic close small gray");
    By btnhome = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Beranda\"`]");

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    private void clickButtonCloseHomePopUpAlamat() {
        tap(buttonCloseHomePopUpAlamat);
    }

    public void closeButtonCloseHomePopUpAlamat() throws InterruptedException {
        Thread.sleep(1000);
        clickButtonCloseHomePopUpAlamat();
    }

}
