Feature: Verify the search functionality
search for the deatils of user contact details in full search form

 Background:  validating full search form page
    Given After home page appears user go to contacts  
    When  click on fullsearch form
    Then user details displayed in full search form
@tag
Scenario: search for company page
    Given After home page appears user go to contact
    When user clicks on contacts
    Then user is displayed companies page with search fields and options
    
 @tag
 Scenario: verify search results in full search form
    Given user is displayed the home page click on full search form
    When enter details and search for the details
    Then user is displayed with contact details  
 @tag 
 Scenario: validate search results in full search form with invalid detail
    Given after the home page click on full search form
    When enter invalid details and search for the details
    Then user details will not displayed with contact details  
 @tag  
 Scenario: validate that contact details are editable
    Given after the home page then click on contacts 
    When click on edit icon from the given list of user details
    Then A form is desplaid to edit the form from selected list 
  @tag  
  Scenario: validate that contact details are revomable from account
    Given after the home page then click on contacts 
    When click on delete icon from the given list and click on ok 
    Then details of user contacts will be deleted 
