@regression
Feature: Policy Bazaar web site
  

  Scenario: user prefers the student plans in policybazzar webpage
    Given user is on the policy bazaar site
    When user click on travel insurance
    And user selects the destination "<Destination Name>"
    And user selects the trip duration
    And user selects the count and age of travellers
    And user submit the medical condition survey
    And user provide the mobile number "<mobile number>"
    Then user selects student plans
    
      Examples: 
      | Destination Name | mobile number |
      | France           |    6387642192 |
    

  Scenario: user provides students travel information in policybazzar webpage
    Given user is on popup
    Then user provide the typical trip duration

  Scenario: user sorts the insurance plans in policybazzar webpage 
    Given user is on the traveller insurance plans page
    Then user modify the content with sort by

  Scenario: user prints the first three lowest travel insurance plans in policybazzar webpage 
    Given user is on the traveller insurance plans page
    Then print lowest first three lowest plans

  Scenario: user prints the health insurance menu in policybazzar webpage
    Given user is on the policy bazaar web link
    And user click on insurance products
    Then user prints health insurance products
