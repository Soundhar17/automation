package PagesMedi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMedi {
	private static WebDriver d;

	public LoginMedi(WebDriver d) {
		this.d=d;//*values assign to the argument *//
		PageFactory.initElements(d,this);
		
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

}
