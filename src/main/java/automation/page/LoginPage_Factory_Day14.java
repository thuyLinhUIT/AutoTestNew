package automation.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class LoginPage_Factory_Day14 {
	private WebDriver driver;
	// đăng ký
	@FindBy(xpath = "//a[@class='btn-anis-effect']")
	WebElement buttonSignUpPage;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonSubmit;

	@FindBy(id = "txtFirstname")
	WebElement txtNameSignUp;

	@FindBy(id = "txtEmail")
	WebElement txtEmailSignUp;

	@FindBy(id = "txtCEmail")
	WebElement txtReEmailSignUp;

	@FindBy(id = "txtPassword")
	WebElement txtPassSignUp;

	@FindBy(id = "txtCPassword")
	WebElement txtRePassSignUp;

	@FindBy(id = "txtPhone")
	WebElement txtPhoneSignUp;

	// đăng nhập
	@FindBy(xpath = "//a[normalize-space()='Đăng Nhập']")
	WebElement buttonLoginPage;
	@FindBy(id = "txtLoginUsername")
	WebElement txtEmail;

	@FindBy(id = "txtLoginPassword")
	WebElement txtPass;
	
	@FindBy(xpath = "//button[@type='submit' and normalize-space()='ĐĂNG NHẬP']")
	WebElement buttonLogin;
	
	//Sửa mật khẩu
	@FindBy(xpath = "//div[@class='avatar2']")
	WebElement iconAvatar;
	
	@FindBy(xpath = "//div[@class='info']//descendant::a[normalize-space()='Chỉnh sửa thông tin']")
	WebElement linkChangeInfo;
	
	@FindBy(id = "txtpassword")
	WebElement txtPassPresent;
	
	@FindBy(id = "txtnewpass")
	WebElement txtPassNew;
	
	@FindBy(id = "txtrenewpass")
	WebElement txtPassReNew;
	
	@FindBy(xpath = "//button[normalize-space()='Lưu mật khẩu mới']")
	WebElement buttonSaveChangePass;
	
	@FindBy(xpath = "//div[@class=\"itool\"]/a[normalize-space()='Thoát']")
	WebElement lickLogOut;
	
	public LoginPage_Factory_Day14(WebDriver _driver) {
		// super();
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	// click vaof nut dang ky
	public void SignUpClick() {
		buttonSignUpPage.click();
	}
	

	// đăng ký tài khoản mới: nhập thông tin vào các ô rồi nhấn đăng ký
	public void SignUpFuntion(String name, String email, String pass, String phoneNum) {
		SignUpClick();

		txtNameSignUp.clear();
		txtNameSignUp.sendKeys(name);

		txtEmailSignUp.clear();
		txtEmailSignUp.sendKeys(email);

		txtReEmailSignUp.clear();
		txtReEmailSignUp.sendKeys(email);

		txtPassSignUp.clear();
		txtPassSignUp.sendKeys(pass);

		txtRePassSignUp.clear();
		txtRePassSignUp.sendKeys(pass);

		txtPhoneSignUp.clear();
		txtPhoneSignUp.sendKeys(phoneNum);

		buttonSubmit.click();
	}
	
	// click vaof nut dang nhap
	public void SignInClick() {
		buttonLoginPage.click();
	}
	
	// ĐĂNG NHẬP
	public void LoginFunction(String email, String pass) {
		SignInClick();
		
		txtEmail.clear();
		txtEmail.sendKeys(email);

		txtPass.clear();
		txtPass.sendKeys(pass);

		buttonLogin.click();
	}
//LogOut
	public void changePass(String oldPass,String newPass) throws InterruptedException {
		iconAvatar.click();
		linkChangeInfo.click();
		
		txtPassPresent.clear();
		txtPassPresent.sendKeys(oldPass);
		
		txtPassNew.clear();
		txtPassNew.sendKeys(newPass);
		
		txtPassReNew.clear();
		txtPassReNew.sendKeys(newPass);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", buttonSaveChangePass);
		//buttonSaveChangePass.click();
		   // Get the alert
		Thread.sleep(1000);
//	String msgConfirmString=driver.switchTo().alert().getText();
//	System.out.println(msgConfirmString);
//		assertEquals(msgConfirmString, "Cập nhật mật khẩu mới thành công!");
      driver.switchTo().alert().accept();

		iconAvatar.click();
		lickLogOut.click();
	}
}
