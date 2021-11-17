Feature: Verify the contact funtionality
  Verify that user login to the site and go to contact

  Background: To validate user able to login
    Given Open chrome and navigate to login page
    When  User enter detsails and click on login
    Then  home page should open
   
  
@tag1
Scenario Outline: Add valid  details in new contact field
    Given After home page appears user go to contacts
    When   click on new contacts in contacts field
    When  enter mandatory valid<first name> <last name> detalis and click on save
    Then  saved details will appear<status>
    Examples:
      | first name    |  last name               | phone num |  mail                 | status  |
      | sudheer       |    sudheer jay           | 8734894   |  sudheer36@gmail.com  | pass    |
      | jaya          |     venkat               | 91823049  |  sudheer@gmail.com    | pass    |
      

@tag2
Scenario Outline: Add valid contact details in new contact field
    Given After home page appears user go to contacts
    When click on new contacts
    When enter user entries <mail> and <phone num> <values> and click on save
    Then user saved details will appear <status>
    Examples:
      | phone num |  mail                           | status  |
      | 91823049  |  sudheer@gmail.com              | pass    |
      | 8734894   |  sudheer36@gmail.com            | pass    |
@tag3
Scenario: Adding contacts details with blank
    Given After home page appears user go to contacts
    When click on new contacts in contacts field
    When  enter mandataory details with blank
    And   click on save button in contact
    Then  user will be displayed with alert box
@tag4
Scenario: Adding company details with blank
    Given After home page appears user go to contacts
    When  use go to company enter mandataory details with blank
    And   click on save button in contact
    Then  user will be displayed with alert box 
    And   click ok on alert box

@tag5
Scenario: Invalid contact details in fields
    Given After home page appears user go to contacts
    When click on new contacts fill details
    When  enter invalid details in fields and click save
    Then  details should not accept


@tag6
Scenario: Add company with contact details in combined form field
    Given  After home page appears user go to contacts
    When click on combined form
    When enter mandatory valid detalis of comapany first and last name and click on save
    Then saved details will appear in combined form
    
@tag7
Scenario: Add company with  details in combined form field
    Given After home page appears user go to contacts
    When click on combined form
    When enter valid detalis of user detail in combined form
    And add address details
    And click on save button
    Then saved details will appear in combined form
    
@tag8
Scenario: add company along with contact with invalid credentials
    Given After home page appears user go to contacts
    When click on combined form
    When user enters invalid information clicks save in combined form
    Then user is displayed an error message to enter valid