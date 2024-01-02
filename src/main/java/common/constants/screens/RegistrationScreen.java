package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationScreen extends BaseScreen {
    //private final By allowNotif = MobileBy.id("Allow");
    private final By gabungButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Gabung Sekarang\"`]");
    private final By phoneNoTextBox = MobileBy.className("XCUIElementTypeTextField");
    private final By lanjutkanButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Lanjutkan\"`]");
    private final By confirmDaftarButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Ya, Daftar\"`]");
    private final By namaLengkapTextBox = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan nama lengkap\"`]");
    private final By showPasswordButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"ic invisible gray\"`][1]");
    private final By passwordTextBox = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan kata sandi\"`]");
    private final By showConfirmPasswordButton = MobileBy.AccessibilityId("ic invisible gray");
    private final By confirmPasswordTextBox = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan konfirmasi kata sandi\"`]");
    private final By emailTextBox = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan email kamu\"`]");
    private final By tncTextBox = MobileBy.AccessibilityId("ic checkbox uncheck");
    private final By daftarButton = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Simpan dan Daftar\"]");
    private final By verifikasiBySMSButton  = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton");
    private final By otpTextBox = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
    private final By verifikasiOTPButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Verifikasi\"`]");
    private final By mulaiBerbelanjaButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Mulai Berbelanja\"`]");
    private final By confirmUpdateVersion = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Nanti Saja\"`]");
//    private void setAllowNotif() {
//        if(isDisplayed(allowNotif)) {
//            tap(allowNotif);
//        }
//    }
    private void setPhoneNo(String phoneNo) {
        inputText(phoneNoTextBox, phoneNo);
    }
    private void clickGabungButton() {
        tap(gabungButton);
    }
    private void clickLanjutkanButton() {
        tap(lanjutkanButton);
    }
    private void clickConfirmDaftarButton() {
      if(isDisplayed(confirmDaftarButton)) {
          tap(confirmDaftarButton);
      }
    }
    private void setNamaLengkapTextBox(String namaLengkap) {
        inputText(namaLengkapTextBox, namaLengkap);
    }
    private void clickShowPasswordButton() {
        tap(showPasswordButton);
    }
    private void setPasswordTextBox(String password) {
        inputText(passwordTextBox, password);

    }
    private void clickShowConfirmPasswordButton() {
        tap(showConfirmPasswordButton);
    }
    private void setConfirmPasswordTextBox(String confirmPassword) {
        inputText(confirmPasswordTextBox, confirmPassword);
    }
    private void setEmail(String email){
        inputText(emailTextBox, email);
    }
    private void clickTncButton(){
        tap(tncTextBox);
    }
    private void clickDaftarButton(){
        tap(daftarButton);
    }
    private void clickVerifikasiBySMSButton(){
        tap(verifikasiBySMSButton);
    }
    private void setOtpTextBox(String otp) {
        inputText(otpTextBox, otp);
    }
    private void clickButtonVerifikasiOTP() {
        tap(verifikasiOTPButton);
    }
    private void clickButtonMulaiBerbelanja() {
        tap(mulaiBerbelanjaButton);
    }
    private void clickConfirmUpdateVersion() {
        if(isDisplayed(confirmUpdateVersion)) {
            tap(confirmUpdateVersion);
        }
    }

    public RegistrationScreen(WebDriver driver) {
        super(driver);
    }

    public void registration(String phoneNo,
                             String namaLengkap,
                             String password,
                             String confirmPassword,
                             String email) throws InterruptedException {
        //setAllowNotif();
        Thread.sleep(1000);
        clickGabungButton();
        Thread.sleep(1000);
        setPhoneNo(phoneNo);
        clickLanjutkanButton();
        Thread.sleep(2000);
        clickConfirmDaftarButton();
        Thread.sleep(1000);
        setNamaLengkapTextBox(namaLengkap);
        clickShowPasswordButton();
        setPasswordTextBox(password);
        clickShowConfirmPasswordButton();
        setConfirmPasswordTextBox(confirmPassword);
        setEmail(email);
        clickTncButton();
        clickDaftarButton();
        Thread.sleep(5000);
    }

    public void verifikasiOTPSMS() throws InterruptedException {
        Thread.sleep(35000);
        clickVerifikasiBySMSButton();
        Thread.sleep(3000);
    }

    public void setOTPSMS(String otp) throws InterruptedException {
        setOtpTextBox(otp);
        Thread.sleep(2000);
        clickButtonVerifikasiOTP();
        Thread.sleep(3000);
    }

    public void getHome() throws InterruptedException {
        clickButtonMulaiBerbelanja();
        Thread.sleep(3000);
        clickConfirmUpdateVersion();
        Thread.sleep(5000);
    }
}
