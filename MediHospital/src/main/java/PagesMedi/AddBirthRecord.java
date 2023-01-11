package PagesMedi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBirthRecord {
	private static WebDriver d;

	public AddBirthRecord(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
		
	}
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement Addbir;

	public WebElement getAddbir() {
		return Addbir;
	}
	@FindBy(id=("child_name"))
	
	private WebElement name;

	public WebElement getName() {
		return name;
	}
	@FindBy(name=("gender"))
	private WebElement Drop;

	public WebElement getDrop() {
		return Drop;
	}
	@FindBy(id=("weight"))
	private WebElement weight;

	public WebElement getWeight() {
		return weight;
	}
	
	@FindBy(id=("child_img"))
	private WebElement photo;

	public WebElement getPhoto() {
		return photo;
	}
	
	@FindBy(id=("birth_date"))
	private WebElement birthdate;

	public WebElement getBirthdate() {
		return birthdate;
	}
	@FindBy(id=("contact"))
	private WebElement Number;

	public WebElement getNumber() {
		return Number;
	}
	@FindBy(id=("address"))
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	@FindBy(id=("case_id"))
	private WebElement id;

	public WebElement getId() {
		return id;
	}
	@FindBy(id=("first_img"))
	private WebElement mphoto;

	public WebElement getMphoto() {
		return mphoto;
	}
	@FindBy(id=("father_name"))
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}
	
	@FindBy(id=("second_img"))
	private WebElement fphoto;

	public WebElement getFphoto() {
		return fphoto;
	}
	@FindBy(id=("birth_report"))
	private WebElement rep;

	public WebElement getRep() {
		return rep;
	}
	@FindBy(id=("document"))
	private WebElement attach;

	public WebElement getAttach() {
		return attach;
	}
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	
	
	}
	
	
	



