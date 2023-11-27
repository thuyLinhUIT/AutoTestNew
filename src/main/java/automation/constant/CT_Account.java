package automation.constant;

import org.openqa.selenium.By;


public class CT_Account {
public static String RISE_URL="https://rise.fairsketch.com/signin";
public static By TEXT_EMAIL=By.id("email");
public static By TEXT_PASSWORD=By.id("password");
public static By BUTTON_SINGIN=By.xpath("//button");
public static By DASHBOARD_TEXT=By.xpath("//span[@class=\"menu-text dashboard-menu\"]");
public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
}
