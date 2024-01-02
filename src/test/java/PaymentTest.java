import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static common.constants.LoginConstants.PASSWORD;
import static common.constants.LoginConstants.PHONE_NO;

public class PaymentTest extends BaseTest {

    @Test(description = "Payment with CIMB Niaga Rekening Ponsel")
    public void PaymentRekpon() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        //screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Gopay")
    public void PaymentGopay() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Jenius Pay")
    public void PaymentJeniusPay() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with ShopeePay")
    public void PaymentShopeePay() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with OVO")
    public void PaymentOVO() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Transfer Bank BCA VA")
    public void PaymentTrfBankBCAVA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Transfer Bank Lainnya VA")
    public void PaymentTrfBankLainnyaVA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Transfer Bank Mandiri VA")
    public void PaymentTrfBankMandiriVA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Transfer Bank BRI VA")
    public void PaymentTrfBankBRIVA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Transfer Bank Permata VA")
    public void PaymentTrfBankPermataVA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC Indodana")
    public void PaymentCCIndodana() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC Kredivo")
    public void PaymentCCKredivo() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC/Debit Online Mandiri")
    public void PaymentCCDebitOnlineMandiri() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC/Debit Online BNI")
    public void PaymentCCDebitOnlineBNI() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC/Debit Online BRI")
    public void PaymentCCDebitOnlineBRI() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC Lainnya")
    public void PaymentCCLainnya() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC/Debit Online BCA")
    public void PaymentCCDebitOnlineBCA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with CC CIMB Niaga")
    public void PaymentCCCIMBNiaga() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Cicilan Mandiri")
    public void PaymentCicilanMandiri() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Cicilan BCA")
    public void PaymentCicilanBCA() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with Payment Point Indomaret")
    public void PaymentPayPointIndomaret() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with LinkAja")
    public void PaymentLinkAja() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with XL Tunai")
    public void PaymentXLTunai() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }

    @Ignore
    @Test(description = "Payment with COD")
    public void PaymentCOD() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getCartScreen().clearCart();
        screen().getWishlistScreen().getProductWishlist();
        screen().getPDPScreen().addToCart();
        screen().getCartScreen().processToPaymentQty(1);
        //screen().getPaymentScreen().payWithRekpon("123456");
    }
}
