package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;


public class BaseCheck extends BaseClass {

	public static void main(String[] args) 
	{
        webDriverLaunch("chrome");
        
        getUrl("http://www.leafground.com/");
        
        WebElement findElement = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[20]"));
        
        usingJavaScript("scroll", findElement, null);
        
        usingJavaScript("scrollup", null, null);
	}
	

}
