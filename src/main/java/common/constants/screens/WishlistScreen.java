package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistScreen extends BaseScreen {

    private final By profileMenu = MobileBy.AccessibilityId("Akun");
    private final By wishlistLink = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeButton");
    private final String productLinkPart1 = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[";
    private final String productLinkPart2 = "]/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage";

    public WishlistScreen(WebDriver driver) {
        super(driver);
    }

    private void clickProfileMenu() {
        tap(profileMenu);
    }
    private void clickWishlistLink() {
        tap(wishlistLink);
    }
    private void chooseProductWishlist() {
        By productLink = MobileBy.iOSClassChain(productLinkPart1 + "1" + productLinkPart2);
        tap(productLink);
        System.out.println("Element" + productLink + " exists");
    }

    public void getProductWishlist() throws InterruptedException {
        Thread.sleep(1000);
        clickProfileMenu();
        Thread.sleep(1000);
        clickWishlistLink();
        Thread.sleep(1000);
        chooseProductWishlist();
        Thread.sleep(3000);
    }


}
