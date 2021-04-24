package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage {
    public static final String SITE_LINK = "https://autobranding.producement.com/calendar";

    @FindBy(className = "title")
    public WebElement calendarTitle;
}