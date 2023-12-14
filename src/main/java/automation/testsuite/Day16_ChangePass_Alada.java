package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day16_ChangePass_Alada extends CommonBase {
	@FindBy(xpath = "//button[normalize-space()='Lưu mật khẩu mới']")
	WebElement buttonSaveChangePass;
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://alada.vn/");
	}
	@Test	
public void ChangePassword() throws InterruptedException {
		//click vào trang đăng nhập
	click(By.xpath("//a[normalize-space()='Đăng Nhập']"));
	//điền thông tin email và pass để đăng nhập
	type(By .id("txtLoginUsername"), "li@gmail.com");
	type(By.id("txtLoginPassword"), "1234567");
	//click nút đăng nhập
	click(By .xpath("//button[@type='submit' and normalize-space()='ĐĂNG NHẬP']"));
	//Đăng nhập thành công
	//lick vào avata chọn chỉnh sửa thông tin
	click(By.xpath("//div[@class='avatar2']"));
	click(By.xpath("//div[@class='info']//descendant::a[normalize-space()='Chỉnh sửa thông tin']"));
	//đổi passwor
	type(By.id("txtpassword"), "1234567");
	type(By.id("txtnewpass"), "123456");
	type(By.id("txtrenewpass"), "123456");
	//click luu thay doi
	//clickByJsExecutor(By.xpath("//button[normalize-space()='Lưu mật khẩu mới']"));
	clickByJsExecutor(buttonSaveChangePass);
	//đợi và lick ok trên alert
	Thread.sleep(1000);
     driver.switchTo().alert().accept();

}
	
}
