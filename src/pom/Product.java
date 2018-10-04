	package pom;


	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Product {
	    @FindBy(xpath="//div[@class='addtoCart']")
	    private WebElement addtocartbtn;
	    @FindBy(id="pincodeUser")
	    private WebElement pintb;
	    @FindBy(xpath="//input[@class='pincode-verify']")
	    private WebElement checkbtn;
	    @FindBy(id="chat_with_seller")
	    private WebElement asksellerbtn;
	    public Product(WebDriver driver)
	    
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void addtocart() {
	    	addtocartbtn.click();
	    }
	    public void enterpin(String a)
	    {
	    	pintb.sendKeys(a);
	    }
	    public void check() {
	    	checkbtn.click();
	    }
	       public void askseller() {
	    	asksellerbtn.click();
	    }

		
	}

