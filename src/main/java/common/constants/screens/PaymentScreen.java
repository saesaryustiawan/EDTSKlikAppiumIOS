package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentScreen extends BaseScreen {

    private final By isakuLink = MobileBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Payment\"`]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]");
    private final By hubungkanIsakuButton = MobileBy.AccessibilityId("Lanjut");
    //private final By cimbRekponButton = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"CIMB Niaga Rekening Ponsel\"`]");
    private final By cimbRekponButton = MobileBy.AccessibilityId("CIMB Niaga Rekening Ponsel");
    private final By cimbRekponTextfield = MobileBy.className("XCUIElementTypeTextField");
    private final By cimbRekponBayarSekarangButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Bayar Sekarang\"`]");
    private final By lihatDetailTrx = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Lihat Detail Transaksi\"`]");
    private final By backFromDetailTrx = MobileBy.AccessibilityId("ic arrow left");

    public PaymentScreen(WebDriver driver) {
        super(driver);
    }

    private void clickIsakuLink() {
        wait.until(ExpectedConditions.presenceOfElementLocated(isakuLink));
        tap(isakuLink);
    }
    private void clickHubungkanIsakuButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(hubungkanIsakuButton));
        tap(hubungkanIsakuButton);
    }
    private void setCIMBRekpon(String pin) {
        tap(cimbRekponButton);
        inputText(cimbRekponTextfield, pin);
        tap(cimbRekponBayarSekarangButton);
    }

    private void clickLihatDetailTrx() {
        tap(lihatDetailTrx);
    }

    private void clickBackFromDetailTrx() {
        tap(backFromDetailTrx);
    }

    public void payWithIsaku() throws InterruptedException {
        Thread.sleep(2000);
        clickIsakuLink();
        Thread.sleep(2000);
        if(isDisplayed(hubungkanIsakuButton)) {
            clickHubungkanIsakuButton();
        }
    }

    public void payWithRekpon(String pinRekpon) throws InterruptedException {
        Thread.sleep(2000);
        scrollForMobile(cimbRekponButton);
        Thread.sleep(5000);
        setCIMBRekpon(pinRekpon);
        Thread.sleep(5000);
        clickLihatDetailTrx();
        Thread.sleep(2000);
        clickBackFromDetailTrx();
    }

}
