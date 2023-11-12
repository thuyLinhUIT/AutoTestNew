package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import io.netty.util.internal.SystemPropertyUtil;

@Test
public class Day8_Practice2 extends CommonBase{
@BeforeMethod
public void openChromeBro() {
	driver=initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
}
public void getLocaltorByText() {
	WebElement linkMayRuaChenElement=driver.findElement(By.linkText("Máy Rửa Chén Bát"));
	System.out.println("Locator cua link may rua CHEN BAT "+ linkMayRuaChenElement);
	WebElement textBepInverterElement=driver.findElement(By.partialLinkText("Cổ Điển"));
	System.out.println("Locator cua MAY HUT MUI "+textBepInverterElement);
}
public void getLocaltorByLassName() {
	
	//System.out.println("So Luong check box"+ driver.findElement(By.className("cursor-pointer")).size());
	System.out.println("So Luong check box"+ driver.findElement(By.className("cursor-pointer")));
	System.out.println("The INPUT"+ driver.findElement(By.tagName("input")));

}
@AfterMethod
public void closeChromeDriver() {
	driver.close();
}
}
