import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.MonthlySetupPage;

public class MonthlySetupPageTest extends TestSetup {
    @Test
    public void hasProfileMenu() {
        login();
        webDriver.get(MonthlySetupPage.SITE_LINK);
        MonthlySetupPage monthlySetupPage = PageFactory.initElements(webDriver, MonthlySetupPage.class);
        monthlySetupPage.accountMenuButton.click();
        assertTrue(monthlySetupPage.accountMenu.isDisplayed());
    }
}
