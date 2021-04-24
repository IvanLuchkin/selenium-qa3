package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MonthlySetupPage {
    public static final String SITE_LINK = "https://autobranding.producement.com/month-setup";

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//button[@aria-label=\"account of current user\"]")
    public WebElement accountMenuButton;

}
