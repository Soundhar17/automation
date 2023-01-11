package PagesMedi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthAndDeath {
	
	private static WebDriver d;

	public BirthAndDeath(WebDriver d) { 
		this.d=d;
		PageFactory.initElements(d,this);
		
	}
	
	@FindBy(xpath="//span[text()=' Birth & Death Record']")
	private WebElement deathre;

	public WebElement getDeathre() {
		return deathre;
	}
	@FindBy(xpath="(//i[@class='fas fa-angle-right'])[1]")
	private WebElement birth;
	
	public WebElement birth() {
		return birth;
	}

}
