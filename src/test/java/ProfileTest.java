import org.testng.annotations.Test;
import static common.constants.LoginConstants.*;
import static common.constants.AdressConstants.*;

public class ProfileTest extends BaseTest {

    @Test(description = "Register then add Alamat")
    public void AddAlamat() throws InterruptedException {
        screen().getLoginScreen().login(
                PHONE_NO,
                PASSWORD);
        screen().getHomeScreen().closeButtonCloseHomePopUpAlamat();
        screen().getProfileScreen().addNewAlamat(
                LOCATION,
                LABEL_ALAMAT,
                ALAMAT_LENGKAP,
                CATATAN,
                NAMA_PENERIMA,
                NOMOR_HP);
    }
}
