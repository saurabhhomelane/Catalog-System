package pages;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.LibraryFile;
import util.TestBaseNew;

public class SignInPage extends TestBaseNew {
	
	//Page Factory / ObjectRepo
	
	@FindBy(xpath="//button[@type= 'button']")
	WebElement SignInwithGoogleBtn;
	
	@FindBy(xpath= "//div[@class= 'BHzsHc']")
	WebElement UseAnotherAccount;
	
	@FindBy(id= "identifierId")
	WebElement Enterusername;
	
	@FindBy(xpath= "//div[@id = 'identifierNext']")
	WebElement nextusernamebutton;
	
	@FindBy(name= "password")
	WebElement Enterpassword;
	
	@FindBy(xpath= "//div[@id = 'passwordNext']")
	WebElement nextpasswordbutton;
	
	//initialization of all the page objects/ Page Factory
	
	public SignInPage () {
		PageFactory.initElements(driver, this);
	}
	
	//Actions/ Methods
	public String validatetitle() {
		return driver.getTitle();
	}
	public CatalogueListPage SignIn() { 
		SignInwithGoogleBtn.click();
		return new CatalogueListPage();
	}
	
	public void googlelogin() throws InterruptedException, IOException {
		LibraryFile prop = new LibraryFile();
	Enterusername.sendKeys(prop.getPropertiyfileObj("username"));
	   Thread.sleep(1000);
	   nextusernamebutton.click();
	   Thread.sleep(500);
	   Enterpassword.sendKeys(prop.getPropertiyfileObj("password"));
	   Thread.sleep(500);
	   nextpasswordbutton.click();
		
			
	}
	
	
	}

