package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	@FindBy(linkText="Party Wear Sarees")
	private WebElement prod1;
	@FindBy(xpath="//a[@title='OJHAS Georgette & Velvet Cutpaste Party Wear Sarees']")
	private WebElement prod11;
	@FindBy(xpath="//a[@title='New Fancy Black Pure Cotton Men Shirt']")
	private WebElement prod2;
	
	@FindBy(xpath="//a[contains(@onclick,'like_product(event,')]")
	private WebElement likebtn;
	
	@FindBy(xpath="//option[.=\"Recommended\"]")
	private WebElement sortby;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productclick() {
		prod1.click();
	}
	public void prodclick() {
		prod11.click();
	}
	public void shirtclick() {
		prod2.click();
	}
	public void like()
	{
		likebtn.click();
	}
	public void sortbydropdown()
	{
		sortby.click();
	}
}