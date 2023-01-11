package PagesMedi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deathrocord {

	
	private static WebDriver d;

	public deathrocord(WebDriver d) { 
		this.d=d;
		PageFactory.initElements(d,this);
		
	}
	
	@FindBy(xpath="(//i[@class='fas fa-angle-right'])[2]")
	private WebElement death;

	public WebElement getDeath() {
		return death;
	}
	
	@FindBy(xpath="//a[text()=' Add Death Record']")
	private WebElement adddeath;

	public WebElement getAdddeath() {
		return adddeath;
	}
	@FindBy(id=("case_id"))
	private WebElement id;

	public WebElement getId() {
		return id;
	
}
	@FindBy(id=("death_date"))
	private WebElement rep;

	public WebElement getRep() {
		return rep;
}
	@FindBy(id=("guardian_name"))
	private WebElement guard;

	public WebElement getGuard() {
		return guard;
	}
	@FindBy(id=("document"))
	private WebElement attach;

	public WebElement getAttach() {
		return attach;
	
}
	@FindBy(id=("death_report"))
	private WebElement report;

	public WebElement getReport() {
		return report;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	
}
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement closebutton;

	public WebElement getClosebutton() {
		return closebutton;
	}
	
	
}
