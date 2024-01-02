package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchScreen extends BaseScreen {

    private final By gabungButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Gabung Sekarang\"`]");

    public SearchScreen(WebDriver driver) {
        super(driver);
    }

}
