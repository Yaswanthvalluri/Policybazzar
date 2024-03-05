package com.Policybazzar.StepDefination;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Policybazzar.utils.helperClass;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
 
 
public class Hooks {
 
	 public static WebDriver driver;
	 static Properties p;
	 
	@BeforeAll
    public static void setup() throws IOException, InterruptedException
    {
    	driver=helperClass.initializeBrowser();
    	p=helperClass.getProperties();
    	driver.get(p.getProperty("URL"));
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
	}

    @AfterAll
    public static void tearDown() {
       driver.quit();
    }
    
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }
    }
