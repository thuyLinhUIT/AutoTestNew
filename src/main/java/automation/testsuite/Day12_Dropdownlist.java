package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Dropdownlist extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	}
	@Test
	public void selectOneOptionFromDropdownlist() throws InterruptedException{
		WebElement selectTag=driver.findElement(By.id("select-demo"));
		Select dropdownlist=new Select(selectTag);
		System.out.println("dropdownlist.isMultiple: "+dropdownlist.isMultiple());
		System.out.println("dropdownlist.isMultiple: "+dropdownlist.getOptions());
		//chon Sunday bang value
		selectTag.click();
		dropdownlist.selectByValue("Sunday");
		
		Thread.sleep(1000);
		//chon Monday bang VisibleText
		selectTag.click();
		dropdownlist.selectByVisibleText("Monday");
		Thread.sleep(1000);
		//chon Tuesday bang index
		selectTag.click();
		dropdownlist.selectByIndex(3);
			}
	
	@Test
	public void selectOneOptionFromList() throws InterruptedException{
		WebElement selectTag=driver.findElement(By.id("multi-select"));
		Select choose= new Select(selectTag);
		choose.selectByIndex(2);
		Thread.sleep(1000);
		choose.selectByValue("Ohio");
		Thread.sleep(1000);
		choose.selectByVisibleText("Texas");
	}
	
	
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}

}
