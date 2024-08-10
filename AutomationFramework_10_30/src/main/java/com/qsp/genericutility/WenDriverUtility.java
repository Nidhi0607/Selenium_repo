package com.qsp.genericutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WenDriverUtility {
	Actions act;
	
	public WenDriverUtility(WebDriver driver) {
		act = new Actions(driver);
		
	}
	public void doubleClick(WebElement element) {
		act.doubleClick(element).perform();
	}
	
	public void clickAndHold(WebElement element) {
		act.clickAndHold(element).perform();
	}
	
	public void mousHover(WebElement element) {
		act.moveToElement(element).perform();
	}

	public void scrollToElement(WebElement element) {
		act.scrollToElement(element).perform();
	}
	
	public void switchToWindow(WebDriver driver, String expectedUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			String actualUrl = driver.switchTo().window(id).getCurrentUrl();
			if (actualUrl.contains(expectedUrl)) {
				break;
			}
		}
	}
}
