package com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.pageobjectmodel.AdressAndPaymentPage;
import com.pageobjectmodel.ConformationPage;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.SearchHotelPage;
import com.pageobjectmodel.SelectHotelPage;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = webDriverLaunch("chrome");
    public static HomePage hp = new HomePage(driver);
	public static SearchHotelPage search= new SearchHotelPage(driver);
	public static SelectHotelPage select = new SelectHotelPage(driver);
	public static AdressAndPaymentPage ap = new AdressAndPaymentPage(driver);
	public static ConformationPage cp = new ConformationPage(driver);
	
	public static void main(String[] args) throws IOException {
		
		getUrl("https://adactinhotelapp.com/");
		
		sendingParameters(hp.getUserName_Box(), "kaithkumar");
		
		sendingParameters(hp.getPassWord_Box(),"123456");
		
		clickingElement(hp.getLogin_Button());
		
		dropDownCheck(search.getLocation_option());
		dropDown("byvisibletext", search.getLocation_option(), "London");
	
		dropDown("byvisibletext", search.getHotels(), "Hotel Creek");

		dropDown("byindex", search.getRoomType(), "2");
		
		dropDown("byindex", search.getNos(), "1");
	
		dropDown("byindex", search.getAdu(), "1");
		
		dropDown("byindex", search.getCh(), "1");
	
		clickingElement(search.getSubmit());
		
		timeOuts(5, TimeUnit.SECONDS);
		clickingElement(select.getRadioButton());
		
		clickingElement(select.getContinue_button());
		
		sendingParameters(ap.getFn(), "kk");
		
		sendingParameters(ap.getLn(), "kk");
		
		sendingParameters(ap.getAd(), "kk");
		
		sendingParameters(ap.getCc(), "1234567891234567");
		
		dropDown("byindex", ap.getCreditCard(), "2");
		
		dropDown("byindex", ap.getMonth(), "2");
		
		dropDown("byindex", ap.getYear(), "12");
		
		sendingParameters(ap.getCvv(),"1234");
		
		clickingElement(ap.getBook());
		
		clickingElement(cp.getLink());
		
		takeScreenShot("adactin");
		
	}

}
