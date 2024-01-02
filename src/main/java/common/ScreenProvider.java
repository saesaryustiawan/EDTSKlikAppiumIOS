package common;

import common.constants.screens.*;
import org.openqa.selenium.WebDriver;

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public RegistrationScreen getRegistrationScreen() {
        return new RegistrationScreen(driver);
    }
    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }
    public HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
    }
    public ProfileScreen getProfileScreen() {
        return new ProfileScreen(driver);
    }
    public WishlistScreen getWishlistScreen() {
        return new WishlistScreen(driver);
    }
    public CartScreen getCartScreen() {
        return new CartScreen(driver);
    }
    public PDPScreen getPDPScreen() {
        return new PDPScreen(driver);
    }
    public PaymentScreen getPaymentScreen() {
        return new PaymentScreen(driver);
    }
}
