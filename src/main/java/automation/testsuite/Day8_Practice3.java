package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_Practice3 extends CommonBase {

@BeforeMethod
public void openChromeBro() {
	driver=initChromeDriver("https://selectorshub.com/xpath-practice-page/");
}
@Test
public void getLocatorsOnThePage() {
	// USER  Email
	System.out.println("USER EMAIL:" +driver.findElement(By.id("userId"))) ;
	// pass
	System.out.println("PASS: " +driver.findElement(By.id("pass"))) ;
//company
	System.out.println("COMPANY:" +driver.findElement(By.name("company"))) ;
//mobile Number
	//System.out.println("MOBI NUMBER:" +driver.findElement(By.id("userId"))) ;
	System.out.println("COMPANY:" +driver.findElement(By.name("mobile number"))) ;

}

@AfterMethod
public void closeChromeDriver() {
	driver.close();
}
}
