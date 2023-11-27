package automation.constant;

import org.openqa.selenium.By;

public class CT_Acc_Excersise_Day13 {
	public static String RISE_URL="https://practicetestautomation.com/practice-test-login/";
	public static By TEXT_USERNAME=By.id("username");
	public static By TEXT_PASSWORD=By.id("password");
	public static By BUTTON_SUBMIT=By.id("submit");
	
	public static By SUCCESS_TEXT=By.xpath("//p[normalize-space()='Congratulations student. You successfully logged in!']");
	public static By BUTTON_LOGOUT=By.xpath("//a[normalize-space()='Log out']");
	
	public static By ALERT_INCORRECT_USER = By.xpath("//div[normalize-space()='Your username is invalid!']");
	public static By ALERT_INCORRECT_PASSWORD = By.xpath("//div[normalize-space()='Your password is invalid!']");
}
