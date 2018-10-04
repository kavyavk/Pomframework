package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*public class Likepage {
   @FindBy(xpath="//i[@class='fa fa-heart-o']")
   private WebElement like;
   
   public Likepage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   public void likeproduct() {
	   like.click();
   }
}*/public class Likepage {
	   @FindBy(xpath="//h1[.='Yellow Partywear Gown']")
	   private WebElement verify;
	   
	   public Likepage(WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public String prodCheck() {
		   return verify.getText();
	   }
	}

