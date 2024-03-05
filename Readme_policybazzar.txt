*****************************************************PROJECT DESCRIPTION*****************************************************************
 
Problem Statement : Find travel insurance plan for students

1. Display three lowest international  travel insurance plan with amount and insurance provider company
2. Group of  2 student people (Age 22,21)
3. For any European country
(Suggested Site: policybazaar site)
 
  
Detailed Description: Hackath Ideas

1. Find travel insurance plan for students, for 2 people (Age 22 & 21) & any European country, fill further dummy details & display three lowest international  travel insurance plan with amount and insurance provider company
2. Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message
3.  Retrieve all Health Insurance menu items and store in a List; Display the same
(Suggested Site: policybazaar.com)
 
Key Automation Scope:
 
Capturing the screenshot
Printing all the acronyms in console and excel sheet
 
 
**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the Test Runner file and run as TestNG Test.
-You can also execute it through testng.xml as TestNG suite
-Now the file will Execute and we get the expected output as shown below.
 
*******************************************************FILES DESCRIPTION**************************************************************
 
1.src/test/java- There are six packages present in this folder.

->Factory:In this package we have BaseClass.java is our main project file where we setup the driver.

->POM:In this package we have declared all the locators and done all the actions for our main project file.

->StepDefination:In this package we have developed all the stepdefinations for scenarios for our main project file.

->TestRunner:In this package we have done Runner file for our main project file.

-> Utilities:In this package we have Excel.java is our main project file where we can invoke the excel sheet properties to implement the appache poi

->Screenshots:In the package we have Invalid details screenshot

2.src/test/resources- There are one files in this folder.

->  testdata   :In this package there are excel files Book3.xlsx and 

->   config.properties : In this File we have to give from user to use which browser chrome

--> extent.properties : In this file plugins for extend reports and path for screenshort are present 
 
3.JRE System Library: In this File we have all dependencies of JAR.files.         
 
4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.
 
5.ExtendReports: In this folder sparkreports from cucumber are stored 

6.Featurefile: Feature file contains the scenarios for executing test steps in cucumber 

7. Report : This file contains the html report for cucumber 

8.test-output:In this we stored all the screenshots which are captured after every step.
 
9.target: It is an empty folder

10.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 
11.testng.xml : Testng xml file contains test suite and the Runner class  
***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE
 
***************************************************************************************************************************************
[RemoteTestNG] detected TestNG version 7.4.0
Feb 29, 2024 10:07:26 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 120, returning the closest version; found: 119; Please update to a Selenium version that supports CDP version 120

Scenario Outline: Travel insurance for students    # FeatureFile/policybazaar.feature:18
  Given user is on the policy bazaar site          # com.StepDefination.travel.user_is_on_the_policy_bazaar_site()

    Embedding Travel insurance for students [image/png 186787 bytes]

  When user click on travel insurance              # com.StepDefination.travel.user_click_on_travel_insurance()

    Embedding Travel insurance for students [image/png 186797 bytes]

  And user selects the destination "France"        # com.StepDefination.travel.user_selects_the_destination(java.lang.String)

    Embedding Travel insurance for students [image/png 137603 bytes]

  And user selects the trip duration               # com.StepDefination.travel.user_selects_the_trip_duration()

    Embedding Travel insurance for students [image/png 127474 bytes]

  And user selects the count and age of travellers # com.StepDefination.travel.user_selects_the_count_and_age_of_travellers()

    Embedding Travel insurance for students [image/png 257865 bytes]

  And user submit the medical condition survey     # com.StepDefination.travel.user_submit_the_medical_condition_survey()

    Embedding Travel insurance for students [image/png 259559 bytes]

  And user provide the mobile number "6387642192"  # com.StepDefination.travel.user_provide_the_mobile_number(java.lang.String)

    Embedding Travel insurance for students [image/png 175228 bytes]

  Then user selects student plans                  # com.StepDefination.travel.user_selects_student_plans()

    Embedding Travel insurance for students [image/png 143618 bytes]

  And user provide the typical trip duration       # com.StepDefination.travel.user_provide_the_typical_trip_duration()

    Embedding Travel insurance for students [image/png 144276 bytes]

  And user modify the content with sort by         # com.StepDefination.travel.user_modify_the_content_with_sort_by()

    Embedding Travel insurance for students [image/png 191737 bytes]

student insurance plans
---------------------------
1.Reliance -  ₹1,514
2.Bajaj Allianz -  ₹1,628
3.Niva Bupa (formerly known as Max Bupa) -  ₹2,089
  And print lowest three plans                     # com.StepDefination.travel.print_lowest_three_plans()

    Embedding Travel insurance for students [image/png 258371 bytes]


Scenario: Car insurance                          # FeatureFile/policybazaar.feature:20
  Given user is on the policy bazaar web site    # com.StepDefination.car.user_is_on_the_policy_bazaar_web_site()

    Embedding Car insurance [image/png 272889 bytes]

  When user click on car insurance               # com.StepDefination.car.user_click_on_car_insurance()

    Embedding Car insurance [image/png 193955 bytes]

  Then user click on the buying new car          # com.StepDefination.car.user_click_on_the_buying_new_car()

    Embedding Car insurance [image/png 151287 bytes]

  And user click on the prefered city            # com.StepDefination.car.user_click_on_the_prefered_city()

    Embedding Car insurance [image/png 194026 bytes]

  And user click on the prefered area            # com.StepDefination.car.user_click_on_the_prefered_area()

    Embedding Car insurance [image/png 196434 bytes]

  And user click on the prefered brand           # com.StepDefination.car.user_click_on_the_prefered_brand()

    Embedding Car insurance [image/png 180424 bytes]

  And user click on the prefered model           # com.StepDefination.car.user_click_on_the_prefered_model()

    Embedding Car insurance [image/png 193703 bytes]

  And user click on the prefered varient         # com.StepDefination.car.user_click_on_the_prefered_varient()

    Embedding Car insurance [image/png 163749 bytes]

  And user click on the prefered varient version # com.StepDefination.car.user_click_on_the_prefered_varient_version()

    Embedding Car insurance [image/png 188535 bytes]

  And user enter invalid details                 # com.StepDefination.car.user_enter_invalid_details()

    Embedding Car insurance [image/png 189493 bytes]

  And user back to home page                     # com.StepDefination.car.user_back_to_home_page()

    Embedding Car insurance [image/png 258371 bytes]


Scenario: Health insurance                    # FeatureFile/policybazaar.feature:33
  Given user is on the policy bazaar web link # com.StepDefination.health.user_is_on_the_policy_bazaar_web_link()

    Embedding Health insurance [image/png 258371 bytes]

  When user click on insurance products       # com.StepDefination.health.user_click_on_insurance_products()

    Embedding Health insurance [image/png 155352 bytes]

                    
health insurance products
---------------------------------------
1.Family Health Insurance
2.Senior Citizen Health Insurance
3.Health Insurance for Parents
4.Best Health Insurance Plans
5.Maternity Insurance
6.Health Insurance Portability
7.Mediclaim Policy
8.Critical Illness Insurance
9.Health Insurance Calculator
10.Health Insurance Companies
11.Health Insurance for NRIs
12.Health Insurance Claim
  Then user prints health insurance products  # com.StepDefination.health.user_prints_health_insurance_products()

    Embedding Health insurance [image/png 258371 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/0e7b1a0d-90d2-481b-8308-9fb38128e8af │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
PASSED: runScenario("Health insurance", "Policy Bazaar")
        Runs Cucumber Scenarios
PASSED: runScenario("Travel insurance for students", "Policy Bazaar")
        Runs Cucumber Scenarios
PASSED: runScenario("Car insurance", "Policy Bazaar")
        Runs Cucumber Scenarios

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================



