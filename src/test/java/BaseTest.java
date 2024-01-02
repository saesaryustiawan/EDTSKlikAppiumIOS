import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import common.ScreenProvider;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.driver.MobileDriverFactory;
import util.driver.MobileDriverHolder;
import util.driver.MobileDriverService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.getDriver;
import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.setDriver;
import static common.constants.DriverConstants.API_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

//@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {
    public final MobileDriverFactory driverFactory = new MobileDriverFactory();
    public final MobileDriverService driverService = driverFactory.getDriverService();
    public final DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
    public final Date date = new Date();
    String otp;

    public final String phoneNumber = "08" + dateFormat.format(date);
    public final String[] fName = {"Muchlis", "Majid", "Ryan", "Saesar", "Resha", "Lynet",
            "Gabby", "Puyono", "Dewi", "Ovi", "Aziza", "Nurin", "Dimas"};
    public final String[] lName = {"Doe", "Smith", "Johnson", "Williams", "Jones", "Brown", "Hood"};
    public final Random random = new Random();
    String randomName = fName[random.nextInt(fName.length)] + " " + lName[random.nextInt(lName.length)];
    String email = randomName.replaceAll("\\s+","").toLowerCase() + "@yopmail.com";
    String password = "Klik1234";
    String url = API_URL;

    @BeforeMethod
    public void setUp() {
        driverService.spinUpDriver();
        MobileDriverHolder.setDriver(driverService.getDriver());
        setDriver(MobileDriverHolder.getDriver());
        MobileDriverHolder.getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
    }

    public ScreenProvider screen() {
        return new ScreenProvider(getDriver());
    }

    public void apiGetOTP(String url,
                          String path) {
        System.out.println(path);
        RestAssured.baseURI = url;
        ValidatableResponse response = RestAssured
                .given()
                .get(path)
                .then()
                .statusCode(200).log().all();
        otp = response.extract().response().body().path("data.otpNumber");
    }

    public void apiPost(String url,
                        String path,
                        JSONObject jsonObject) {
        System.out.println(jsonObject.toString());
        RestAssured.baseURI = url;
        ValidatableResponse response = RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(jsonObject.toString())
                .when()
                .post(path)
                .then()
                .statusCode(200).log().all();

        String responseBody = response.toString();
        System.out.println(responseBody);
    }

    @AfterMethod
    public void tearDown() {
        driverService.closeDriver();
    }
}
