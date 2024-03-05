package com.Policybazzar.PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Policybazzar.utils.excelUtils;
import com.Policybazzar.utils.helperClass;


public class TravelInsurance extends BasePage {
	
	public TravelInsurance(WebDriver driver) { 
		super(driver);
		
	}
	
	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/Book3.xlsx";

	
	@FindBy(xpath="//input[@id='country']")			//xpath for selectin country name  
	WebElement Countrypath;

	@FindBy (xpath="//li[contains(text(),'France')][1]")			// xpath for entering country name 
	WebElement Franceop;

	@FindBy (xpath="(//button[@class='travel_main_cta'])[1]")			// xpath for country proceed button
	WebElement Countryproced;
		
	@FindBy (xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")			// xpath to pick current date 
	WebElement Datepath;
		
	@FindBy (xpath="//button[@class='travel_main_cta']")			//xpath for date proceed button
	WebElement Dateproced;
	
	
	@FindBy (xpath="//label[@for='traveller_2']")			//xpath for selecting travellers 
	WebElement twotravellers;

	@FindBy (xpath="(//div[@class='customDropdown__select  '])[1]")			//xpath for first traveller
	WebElement travelleronepath;
			
	@FindBy (xpath="//*[contains(text(),'22 years')]")			//xpath for first traveller age 
	WebElement travelleroneage;
		
	@FindBy (xpath="(//div[@class='customDropdown__select  '])[2]")			//xpath for second traveller
	WebElement travellertwopath;
	
	@FindBy (xpath="//*[contains(text(),'21 years')]")			//xpath for second traveller age
	WebElement travellertwoage;
	
	@FindBy (xpath="//*[contains(@class,'travel')]")			//xpath to click proceed to medical history button
	WebElement Agepathnext;
	
	@FindBy (xpath="//*[contains(@id,'ped_no')]")			//xpath to select medical survery option
	WebElement surveyno;
	
	@FindBy (xpath="//*[contains(@id,'mobileNumber')]")			//xpath to enter phonenumber 
	WebElement phonenumberinput;
	
	@FindBy (xpath="//*[contains(@class,'travel_main_cta')]")			//xpath to click proceed button 
	WebElement proced;
	
	@FindBy (xpath="//input[@id='studentTrip']")			//xpath to select student trip plan 
	WebElement studenttripplan;
	
	@FindBy (xpath="//input[@id='Traveller_1']")			//xpath to select first passenger
	WebElement passengeroneselect;
	
	@FindBy (xpath="//input[@id='Traveller_2']")			//xpath to select second passenger
	WebElement passengertwoselect;
	
	@FindBy (xpath="//select[@id='feet']")			//xpath to select duration of trip
	WebElement durationpath;
	
	@FindBy (xpath="//option[contains(text(),'30 Days')]")			//xpath tp select trip duration
	WebElement durationop;
	
	@FindBy (xpath="//button[contains(text(),'Apply')]")			//xpath to click proceed button 
	WebElement durationproced;
	
	@FindBy (xpath="//p[@class='filter_name_heading']")			//xpath to click sort by 
	WebElement sortby;
	
	@FindBy (xpath="//input[@id='17_sort']")			//xpath to select low to high option
	WebElement lowtohigh;
	
	@FindBy (xpath="//span[@class='exitIntentPopup__box__closePop']")			//xpath to close the popup
	WebElement closepopup;
	
	@FindBy (xpath="//a[contains(text(),'Policybazaar')]")			//xpath to naviagte back to homepage 
	WebElement backone;
	
	@FindBy (xpath="//span[@class='exitIntentPopup__box__closePop']")			//xpath to exit popup
	WebElement exitpop;
	
	By travelins = By.xpath("//i[@class='icon-bg homeIconsBg icon-bg-new ti']");			//xpath to select travel insurance

	
	@FindBy (xpath="//div[@class='MuiPickersDateRangePickerInput-root']/div[1]")			//xpath to select start date 
	WebElement StartDate;
	
	@FindBy (xpath="//div[1]/div/h6[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline']")			//xpath to select month and year
	WebElement MonthYear;
 
	@FindBy (xpath="//div[2]/div[1]/button[2][@data-mui-test='next-arrow-button']")			//xpath to click the next on calender
	WebElement Arrow;
 
	@FindBy (xpath="//span[@class='MuiPickersDay-dayLabel']")			//xpath to select date 
	List<WebElement> SelectDate;
	
	@FindBy (xpath="//li[contains(@class,'current')]//span")			//xpath for the title of travel insurance
	WebElement traveltitles;
	
	@FindBy (xpath="//i[@class='icon-bg homeIconsBg icon-bg-new ti']")			//xpath for travel insurance icon
	WebElement travelinss;
	
	@FindBy (xpath="//h2[contains(text(),'Student Travel Information')]")			//xpath for student travel information
	WebElement traveldetslider;
 
	public void titlevalidations() {
		String text=traveltitles.getText();
		System.out.println(text);
	}
	
	public String titlevalidations1() {
		String textt=traveltitles.getText();
		return textt;
	}
	
	public String travelslider() {
		String textt=traveldetslider.getText();
		return textt;
	}
	
	public String titlecheck() {
		String text = driver.getTitle();
		return text;
	}
	public void mainpage() {
		backone.click();
		
	}

	public void choosetravelinsurance() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement acro=driver.findElement(travelins);
		js.executeScript("arguments[0].scrollIntoView();",acro);
		acro.click();
	}
	
	public void destination(String string1) {
		Countrypath.click();
		Countrypath.sendKeys(string1);
		Franceop.click();
		Countryproced.click();	
		

	}
	
	public void datepathclick() {
		Datepath.click();	
	}
	
	public void tripduration(String mn,String dat) throws InterruptedException {
		
		while(true)
		{
			String mon=MonthYear.getText();
			if(mn.equals(mon)) {
				break;
			}
			
			Arrow.click();
			
		}
		for(WebElement dt:SelectDate)
		{
			if(dt.getText().equals(dat)) {
				dt.click();
				break;
			}	
		}
	}
	
	public void dateproceedclick() {
		Dateproced.click();	
	}
	
	public void travellersage() {
		
		twotravellers.click();
		travelleronepath.click();
		travelleroneage.click();
		travellertwopath.click();
		travellertwoage.click();
		Agepathnext.click();
	}
	
	public void medicalsurvey() {
		surveyno.click();
	}
	
	public void travelbuttoncheck() {
		WebElement button3 = travelinss;
        boolean valuees = button3.isEnabled();
        System.out.println("is the Travel Insurance button Enabled ? " +valuees); 
	}
	
	public void phonenumberenter(String string2) throws InterruptedException {
		phonenumberinput.sendKeys(string2);
		Thread.sleep(1000);
		proced.click();
	}
	
	public void studentplan() {
		closepop();
		studenttripplan.click();
		closepop();
	}
	
	public void tinsduration() throws InterruptedException {
		passengeroneselect.click();
		Thread.sleep(1000);
		closepop();
		passengertwoselect.click();
		closepop();
		durationpath.click();
		closepop();
		Select sc=new Select(driver.findElement(By.id("feet")));
     	sc.selectByVisibleText("30 Days");
		closepop();
		durationproced.click();	
	}
	
	public void sort() {
		closepop();
		sortby.click();
		closepop();
		lowtohigh.click();
		closepop();
	}
	
	public void printtravelplans() throws IOException {
		System.out.println("student insurance plans");
		System.out.println("---------------------------");
		for(int i=1;i<=3;i++) {//print lowest 3 packages
			String text = driver.findElement(By.xpath("(//p[@class='quotesCard--insurerName'])["+i+"]")).getText();
		String text2 = driver.findElement(By.xpath("(//span[@class='premiumPlanPrice'])["+i+"]")).getText();
		try {
			exitpop.click();
							}
			catch (Exception e) {}
		System.out.println(i+"."+text+" -  "+text2);
		excelUtils.setCellData(file, "Travel_Insurance", i, 0, text);
		excelUtils.setCellData(file, "Travel_Insurance", i, 1, text2);
		}
        backone.click();
	}
	
	public void closepop() {
		try {
			exitpop.click();
			}
		catch (Exception e) {}
		
	}
	
	

}
