package automation.testsuite;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Exercise extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/input-form-demo.html");
	}
	@Test
	public void selectOneOptionFromDropdownlist() throws InterruptedException{
		WebElement selectTag=driver.findElement(By.name("state"));
		Select dropdownlist=new Select(selectTag);
		
//		//chon New York bang value khong duoc do khong co cai dat value trong html
//		//can chon bang visibleText hoac Index
				//selectTag.click();
				//dropdownlist.selectByValue("daho");
//				dropdownlist.selectByVisibleText("New York");
//				Thread.sleep(1000);
//				dropdownlist.selectByIndex(3);
				
		//chọn lần lượt tất cả các option
				List optionList=driver.findElements(By.xpath("//select[@name=\"state\"]/option"));
				for (int i=0;i<optionList.size();i++) {
					
					selectTag.click();					
					dropdownlist.selectByIndex(i);
					selectTag.click();	
					Thread.sleep(500);
				}
	}
	@Test
	public void ClickOnCheckBox() {
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement e : checkBox) {
			if (e.isSelected()==false) {
				System.out.println("check OK");
			}
		}
		
		for (WebElement e : checkBox) {
			e.click();
			System.out.println("check click OK");
		}
	}
	
	
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}

}
