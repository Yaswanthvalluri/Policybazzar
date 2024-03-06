package com.Policybazzar.utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 

public class helperClass {
		 
		public static WebDriver driver;
		static Properties p; 
			
			public  static WebDriver initializeBrowser() throws IOException
			{
				
				if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
				{
					DesiredCapabilities capabilities = new DesiredCapabilities();				//set the browser peoperties to automate the webapplications 
					//os
					if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {		//getproperty used to get element properties from file such as text 
					    capabilities.setPlatform(Platform.WIN11);						//represents the known and supported platform that webdriver runs 
					} 
					else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {		//equalsIgnoreCase is a 
					    capabilities.setPlatform(Platform.MAC);
					} 
					else {
					    System.out.println("No matching OS..");
					      }
					
					//browser 
					switch (getProperties().getProperty("browser").toLowerCase()) {
					    case "chrome":
					        capabilities.setBrowserName("chrome");		//use to set the browser name on which test should be executed 
					        break;
					    case "edge":
					        capabilities.setBrowserName("MicrosoftEdge");
					        break;
					    case "firefox":
					        capabilities.setBrowserName("Firefox");
					        break;
					    default:
					        System.out.println("No matching browser");
					     }
			       driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);			//remotewebdriver impletements webdriver interface to execute the test cases
				}
				else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
					{
						switch(getProperties().getProperty("browser").toLowerCase()) 
						{
						case "chrome":
					        driver=new ChromeDriver();
					        break;
					    case "edge":
					    	driver=new EdgeDriver();
					        break;
					    case "firefox":
					    	driver=new FirefoxDriver();
					    	break;
					    	
					    default:
					        System.out.println("No matching browser");
					        driver=null;
						}
					}
				
				 driver.manage().deleteAllCookies(); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 return driver;
			}
			public static WebDriver getDriver() {			//use to retrieve instance of webdriver 
				return driver;
			}
		 
		public static Properties getProperties() throws IOException
		{		 
		    FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");		//set the 
		    p=new Properties();
			p.load(file);
			return p;
		}
}