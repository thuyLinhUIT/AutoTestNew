package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;


public class Day8_Practice extends CommonBase {
@BeforeMethod
public void openChromeBro() {
	driver=initChromeDriver("https://rise.fairsketch.com/signin");
}
@Test
	public void getLocaltorById() {
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is TUI DUNG DAY NE" + email);
		WebElement password= driver.findElement(By.id("password"));
	System.out.println("Pass is TUI DUNG DAY NE: "+password);
	}

	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}
}
