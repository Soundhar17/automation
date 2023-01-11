package baseMedi;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseclassMedi {

	public static WebDriver d;

	public static void browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chrom c\\chromedriver.exe");
			d = new ChromeDriver();
			d.get("https://demo.smart-hospital.in/site/login");
			d.manage().window().maximize();

		}
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\firefox\\geckodriver.exe");
			d = new FirefoxDriver();
			d.get("https://demo.smart-hospital.in/site/login");

		}
		if (name.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "C:\\edge\\msedgedriver.exe");
			d = new EdgeDriver();
			d.get("https://demo.smart-hospital.in/site/login");

		}
	}

	public static void wait(int s) throws InterruptedException {

		Thread.sleep(s);

	}
	
	public static void click(WebElement Element) throws InterruptedException {

		Element.click();

	}
	
	public static void send(WebElement Element,String value) throws InterruptedException {

		Element.sendKeys(value);
	}

	public static void user(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void pass(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void login(WebElement element) {
		element.click();

	}

	public static void death(WebElement element) {
		element.click();
	}

	public static void birth(WebElement element) {
		element.click();

	}

	public static void windowhandle() {

		String oldwindow = d.getWindowHandle();

	}

	public static void windowhandles() {

		Set<String> childwindow = d.getWindowHandles();
		
	      for (String child : childwindow){
		    	 
				if(child.equals(childwindow)){
					d.switchTo().window((String) child);
					d.close();

	
	      }
	      }
	}
	public static void addbirth(WebElement element) {
		element.click();

	}

	public static void child(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void drop(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);

		} else {
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);

			} else {
				if (option.equalsIgnoreCase("index")) {
					s.selectByIndex(Integer.parseInt("value"));
				}

			}

		}
	}

	public static void weight(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void photo(WebElement element, String value) {

		element.sendKeys(value);

	}
	
	/*public static void send(WebElement element, Double numeric) {
		element.sendKeys(numeric);*/

	

	
	public static void birthdate(WebElement element, String value, Keys enter) {

		element.sendKeys(value, enter);

	}

	public static void phone(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void address(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void Caseid(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void mother(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void fathername(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void fphoto(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void report(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void attach(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void save(WebElement element) {
		element.click();

	}
	
		public static void closebutton(WebElement element) {
			element.click();

		}

}
