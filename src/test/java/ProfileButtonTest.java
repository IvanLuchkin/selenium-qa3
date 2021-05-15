import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.MonthlySetupPage;

public class ProfileButtonTest extends TestSetup {
    @Test
    public void profileMenuHasSubscriptionLink() {
        login();
        webDriver.get(MonthlySetupPage.SITE_LINK);
        MonthlySetupPage monthlySetupPage = PageFactory.initElements(webDriver, MonthlySetupPage.class);
        monthlySetupPage.accountMenuButton.click();
        assertNotNull(webDriver.findElement(By.cssSelector("[href=\"https://socialmediacalendar.app/my-account/subscriptions/\"]")));
    }
}
