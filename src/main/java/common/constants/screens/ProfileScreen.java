package common.constants.screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static common.constants.AdressConstants.*;

public class ProfileScreen extends BaseScreen {
    private final By profileMenu = MobileBy.AccessibilityId("Akun");
    private final By daftarAlamatLink = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeButton");
    private final By tambahAlamatButton = MobileBy.AccessibilityId("Tambah Alamat Baru");
    private final By cariLokasiTextfield = MobileBy.className("XCUIElementTypeTextField");
    private final By resultCariAlamatLink = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == '" + LOCATION + "'`]");
    private final By pilihTitikLokasiButton = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Pilih Titik Lokasi\"`]");
    private final By labelAlamatTextfield = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan label alamat\"`]");
    private final By alamatLengkapTextfield = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan alamat lengkap\"`]");
    private final By catatanTextfiled = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan catatan\"`]");
    private final By namaPenerimaTextfield = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan nama penerima\"`]");
    private final By nomorHPTextfield = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Masukkan nomor handphone\"`]");
    private final By simpanAlamatButton = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Simpan dan gunakan Alamat\"`]");

    public ProfileScreen(WebDriver driver) {
        super(driver);
    }

    private void clickProfileMenu() {
        tap(profileMenu);
    }
    private void clickDaftarAlamatLink() {
        tap(daftarAlamatLink);
    }
    private void clickTambahAlamatButton() {
        tap(tambahAlamatButton);
    }
    private void setCariLokasi(String lokasi) {
        inputText(cariLokasiTextfield, lokasi);
    }
    private void clickResultCariAlamatLink() {
        tap(resultCariAlamatLink);
        tap(resultCariAlamatLink);
    }
    private void clickPilihTitikLokasi() {
        tap(pilihTitikLokasiButton);
    }
    private void setLabelAlamat(String labelAlamat) {
        inputText(labelAlamatTextfield, labelAlamat);
    }
    private void setAlamatLengkap(String alamatLengkap) {
        scrollForMobile(alamatLengkapTextfield);
        inputText(alamatLengkapTextfield, alamatLengkap);
    }
    private void setNamaPenerima(String namaPenerima) {
        scrollForMobile(namaPenerimaTextfield);
        inputText(namaPenerimaTextfield, namaPenerima);
    }
    private void setCatatan(String catatan) {
        scrollForMobile(catatanTextfiled);
        inputText(catatanTextfiled, catatan);
    }

    private void setNomorHP(String nomorHP) {
        scrollForMobile(nomorHPTextfield);
        inputText(nomorHPTextfield, nomorHP);
    }
    private void clickSimpanData() {
        scrollForMobile(simpanAlamatButton);
        tap(simpanAlamatButton);
    }

    public void addNewAlamat(String lokasi,
                             String labelAlamat,
                             String alamatLengkap,
                             String catatan,
                             String namaPenerima,
                             String nomorHP) throws InterruptedException {
        Thread.sleep(1000);
        clickProfileMenu();
        Thread.sleep(1000);
        clickDaftarAlamatLink();
        Thread.sleep(1000);
        clickTambahAlamatButton();
        Thread.sleep(2000);
        setCariLokasi(lokasi);
        Thread.sleep(2000);
        clickResultCariAlamatLink();
        Thread.sleep(5000);
        clickPilihTitikLokasi();
        Thread.sleep(2000);
        setLabelAlamat(labelAlamat);
        setAlamatLengkap(alamatLengkap);
        setCatatan(catatan);
        setNamaPenerima(namaPenerima);
        setNomorHP(nomorHP);
        clickSimpanData();
        Thread.sleep(5000);
    }
}
