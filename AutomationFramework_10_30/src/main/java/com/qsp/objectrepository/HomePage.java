package com.qsp.objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//initialization
			public HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//declaration
					@FindBy(linkText = "Log out")
					private WebElement logoutlink;
					
					@FindBy(partialLinkText = "Books")
					private WebElement Booklink;

					
	    	//provide getter
				public WebElement getLogoutlink() {
				return logoutlink;
					}
				
				public WebElement getBooklink() {
					return Booklink;
						}
					

}
