package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PDPScreen extends BaseScreen {

    private final By buttonCart = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"+ Keranjang\"`]");
    private final By backButton = MobileBy.AccessibilityId("ic arrow left");
    private final By goToCartviaWishlist = MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther[2]/XCUIElementTypeButton");

    public PDPScreen(WebDriver driver) {
        super(driver);
    }

    private void clickBackButton() {
        tap(backButton);
    }

//    private void clickGoToCart(int qty) {
//        String goToCart1 = "//XCUIElementTypeStaticText[@name=\"";
//        String goToCart2 = "\"]";
//        By goToCart = MobileBy.xpath(goToCart1 + qty + goToCart2);
//        tap(goToCart);
//    }
    private void clickGoToCartviaWishlist() {
        tap(goToCartviaWishlist);
    }

    private void addProductToCart() {
        if (isDisplayed(buttonCart)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(buttonCart));
            driver.findElement(buttonCart).click();
            System.out.println("Element" + buttonCart + " exists");
        } else {
            Boolean cartAble = true;
            while (cartAble) {
                System.out.println("Element" + buttonCart + " not exists, choose another product");
                clickBackButton();
                //By productLink = MobileBy.iOSClassChain(productLinkPart1 + 2 + productLinkPart2);
                //tap(productLink);
                cartAble = false;
            }
        }
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        addProductToCart();
        Thread.sleep(2000);
        clickBackButton();
        Thread.sleep(1000);
        //clickGoToCart(qty);
        clickGoToCartviaWishlist();
        Thread.sleep(2000);

    }

}
