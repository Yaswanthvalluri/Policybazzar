package com.Policybazzar.StepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Policybazzar.PageObjectModel.CarInsurance;
import com.Policybazzar.PageObjectModel.HealthInsurance;
import com.Policybazzar.PageObjectModel.TravelInsurance;
import com.Policybazzar.utils.helperClass;
import com.Policybazzar.utils.excelUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class health {
	
	static WebDriver driver=helperClass.getDriver();
	static HealthInsurance hi;
	
	@Given("user is on the policy bazaar web link")
	public void user_is_on_the_policy_bazaar_web_link() throws InterruptedException {
		Thread.sleep(2000);
	    
	}

	@When("user click on insurance products")
	public void user_click_on_insurance_products() {
		hi=new HealthInsurance(helperClass.getDriver());

		hi.clickproducts();
	}

	@Then("user prints health insurance products")
	public void user_prints_health_insurance_products() throws IOException {
		hi.printhealthproducts();
		hi.returnback();
		//hi.abort();
	   
	}
	
	//smoke
	
	@Then("user verifies the whether insurance products displayed")
	public void user_verifies_the_whether_insurance_products_displayed() {
		hi=new HealthInsurance(helperClass.getDriver());
		hi.clickheader();
	   
	}

	@Then("user verifies the whether health insurance products displayed")
	public void user_verifies_the_whether_health_insurance_products_displayed() {
		hi=new HealthInsurance(helperClass.getDriver());
		hi.clickheadersub();
	   
	}

}
