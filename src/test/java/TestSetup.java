import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class TestSetup {
    public WebDriver webDriver;

    @BeforeEach
    public void setup() {
        FirefoxOptions driverOptions = new FirefoxOptions();
        driverOptions.addArguments("--headless");
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver(driverOptions);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login() {
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        webDriver.get(LoginPage.SITE_LINK);
        loginPage.setValueToEmail(System.getenv("login"));
        loginPage.setValueToPassword(System.getenv("password"));
        loginPage.confirmForm();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}