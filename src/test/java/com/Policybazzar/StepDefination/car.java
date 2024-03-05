package com.Policybazzar.StepDefination;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Policybazzar.PageObjectModel.CarInsurance;
import com.Policybazzar.PageObjectModel.TravelInsurance;
import com.Policybazzar.utils.helperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class car {
	
	static WebDriver driver=helperClass.getDriver();
	static CarInsurance ca;
	
	@Given("user is on the policy bazaar web site")
	public void user_is_on_the_policy_bazaar_web_site() throws InterruptedException {
		Thread.sleep(3000);
	   
	}

	@When("user click on car insurance")
	public void user_click_on_car_insurance() throws InterruptedException {
		ca=new CarInsurance(helperClass.getDriver());
        ca.choosecarinsurance();
        Thread.sleep(5000);
	   
	}

	@Then("user click on the buying new car")
	public void user_click_on_the_buying_new_car() {
		ca.buynewcar();

	}

	@Then("user click on the prefered city")
	public void user_click_on_the_prefered_city() {
		ca.selectcity();
	  
	}

	@Then("user click on the prefered area")
	public void user_click_on_the_prefered_area() {
		ca.selectarea();
	   
	}

	@Then("user click on the prefered brand")
	public void user_click_on_the_prefered_brand() {
		ca.selectbrand();
	   
	}

	@Then("user click on the prefered model")
	public void user_click_on_the_prefered_model() {
		ca.selectmodel();
	  
	}

	@Then("user click on the prefered varient")
	public void user_click_on_the_prefered_varient() {
		ca.selectvariant();
	   
	}

	@Then("user click on the prefered varient version")
	public void user_click_on_the_prefered_varient_version() {
		ca.selectvariantversion();
	  
	}

	@Then("user enter invalid details")
	public void user_enter_invalid_details() throws IOException, InterruptedException, HeadlessException, AWTException {
		ca.captureinvalid();
		//ca.screenshot();
		
	}
	
	@Then("user back to home page")
	public void user_back_to_home_page() {
		ca.car_homepage();
	    
	}
	
	//smoke
	
		@Then("user verifies the car insurance icon")
		public void user_verifies_the_car_insurance_icon() {
			ca=new CarInsurance(helperClass.getDriver());
			ca.carbuttoncheck();
		   
		}

		@Given("user is on the car insurance page")
		public void user_is_on_the_car_insurance_page() {
			System.out.println("title is:"+ca.titlechecks());
		    Assert.assertEquals("PolicyBazaar Car Insurance: Insure Your Car Today",ca.titlechecks());
		    
		}

		@Given("user is on the city and rto page")
		public void user_is_on_the_city_and_rto_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select City & RTO",ca.titlevalidations1());
		   
		}

		@Given("user is on the select car brand site")
		public void user_is_on_the_select_car_brand_site() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Brand",ca.titlevalidations1());
		  
		}

		@Given("user is on the select car model page")
		public void user_is_on_the_select_car_model_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Model",ca.titlevalidations1());
		    
		}

		@Given("user is on the select car fuel type page")
		public void user_is_on_the_select_car_fuel_type_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Fuel Type",ca.titlevalidations1());
		    
		}

		@Given("user is on the select car varient page")
		public void user_is_on_the_select_car_varient_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Variant",ca.titlevalidations1());
		   
		}

		@Given("user is on the filling details page")
		public void user_is_on_the_filling_details_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Please Fill Your Details",ca.titlevalidations1());
		   
		}
}
