import org.testng.annotations.Test;

import static common.constants.DriverConstants.BUNDLEID_KLIK;
import static org.testng.Assert.assertEquals;

public class RegistrationTest extends BaseTest {

    @Test(description = "Registration with SMS")
    public void RegistrationSMS() throws InterruptedException {
        screen().getRegistrationScreen().registration(
                phoneNumber,
                randomName,
                password,
                password,
                email);
        driverService.getDriver().activateApp(BUNDLEID_KLIK);
        screen().getRegistrationScreen().verifikasiOTPSMS();
        //API call OTP SMS
        //Post Request API
//        JSONObject body = new JSONObject();
//        body.put("phoneNumber", phoneNumber);
//        body.put( "deviceId","WA168914581299102394");
//        body.put( "password", password);
//        body.put( "email", email);
//        body.put( "name", randomName);
//        body.put( "newsLetterSubscriber", true);
//        apiPost(url, "/customer/api/mobile/otp/register-sms", body);
        //Get OTP Helper
        apiGetOTP(url, "/customer/api/helper/otp/"+ phoneNumber + "/sms");
        System.out.println("otp = " + otp);
        screen().getRegistrationScreen().setOTPSMS(otp);
        screen().getRegistrationScreen().getHome();
    }
}
