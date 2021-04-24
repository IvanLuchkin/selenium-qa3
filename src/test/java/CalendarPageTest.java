import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CalendarPage;

public class CalendarPageTest extends TestSetup {
    @Test
    public void hasTitle() {
        login();
        CalendarPage calendarPage = PageFactory.initElements(webDriver, CalendarPage.class);
        assertTrue(calendarPage.calendarTitle.isDisplayed());
    }
}
