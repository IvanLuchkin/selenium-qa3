import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CalendarPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends TestSetup {
    @Test
    public void successfulLoginRedirectsToCalendar() {
        login();
        assertEquals(webDriver.getCurrentUrl(), CalendarPage.SITE_LINK);
    }

    @Test
    public void failedLoginStaysOnPage() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        webDriver.get(LoginPage.SITE_LINK);
        loginPage.setValueToEmail("");
        loginPage.setValueToPassword("");
        loginPage.confirmForm();
        Thread.sleep(500);
        assertEquals(webDriver.getCurrentUrl(), LoginPage.SITE_LINK);
    }

}