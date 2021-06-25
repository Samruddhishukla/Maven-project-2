package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timehrm {
	public WebDriver driver;
	public Timehrm (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Time')]")
	WebElement t;
	@FindBy(id="menu_time_Timesheets")
	WebElement tm;
	@FindBy(id="menu_time_Timesheets")
	WebElement tl;
	@FindBy(id="btnEdit")
	WebElement ed;
	public void timebtn()
	{
		
		t.click();
		tm.click();
		tl.click();
		ed.click();
	}

}
