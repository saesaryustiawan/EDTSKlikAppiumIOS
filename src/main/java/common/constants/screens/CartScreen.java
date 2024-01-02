package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartScreen extends BaseScreen {

    private final By cartMenu = MobileBy.AccessibilityId("Keranjang");
    private final By perubahanCartButton = MobileBy.AccessibilityId("ic close gray");
    private final By closePopUpAlamatButton = MobileBy.AccessibilityId("ic close small gray");
    private final By deleteAllCart = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Hapus\"`]");
    private final By deleteCartButton = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"Hapus\"])[2]");
    private final String beli1 = "**/XCUIElementTypeButton[`label == \"Beli (";
    private final String beli2 = ")\"`]";

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    private void clickCartMenu() {
        tap(cartMenu);
    }
    private void clickPerubahanCartButton() {
        tap(perubahanCartButton);
    }
    private void clickClosePopUpAlamatButton() {
        tap(closePopUpAlamatButton);
    }
    private void clickDeleteAllCart() {
        tap(deleteAllCart);
    }
    private void clickDeleteCartButton() {
        tap(deleteCartButton);
    }
    private void clickBeliButton(int qty) {
        By beliButton = MobileBy.iOSClassChain(beli1 + qty + beli2);
        tap(beliButton);
    }
    private void clickShippingType() throws InterruptedException{
        By shippingType = MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther" +
                "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]" +
                "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]" +
                "/XCUIElementTypeOther/XCUIElementTypeButton");
        By shippingOpt = MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther" +
                "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]" +
                "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]" +
                "/XCUIElementTypeOther/XCUIElementTypeOther");
        By confirmShippingButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Konfirmasi\"`]");

        tap(shippingType);
        Thread.sleep(2000);
        tap(shippingOpt);
        Thread.sleep(2000);
        tap(confirmShippingButton);
    }

    public void clearCart() throws InterruptedException {
        Thread.sleep(1000);
        clickCartMenu();
        Thread.sleep(1000);
        if(!driver.findElements(closePopUpAlamatButton).isEmpty()) {
            clickClosePopUpAlamatButton();
        }
        Thread.sleep(2000);
        if(!driver.findElements(perubahanCartButton).isEmpty()) {
            clickPerubahanCartButton();
        }
        Thread.sleep(2000);
        if(!driver.findElements(deleteAllCart).isEmpty()) {
            Thread.sleep(3000);
            clickDeleteAllCart();
            Thread.sleep(3000);
            clickDeleteCartButton();
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
    }
    public void processToPaymentQty(int qty) throws InterruptedException {
        Thread.sleep(1000);
        clickCartMenu();
        Thread.sleep(1000);
        clickShippingType();
        Thread.sleep(5000);
        clickBeliButton(qty);
        Thread.sleep(5000);
    }
}
