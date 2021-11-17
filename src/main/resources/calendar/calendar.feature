Feature: Verify the calendar funtionality
  Verify that user login to the site and go to calandar
  Background:  After Login  
    Given user login to portal
    When  click on calendar
    Then Calendar page appears
 Scenario Outline: Add New event in calender field
    Given After home page user go to calender and click on new event
    When enter  detalis in Title<name>
    And  assign the task by clicking on add button<Task>
    And select date from calendar<date>
    And  click on save button
    Then saved details will appear
     Examples:
      |  name           |    Task             | date          | status  |
      | sudheer venkata |    sudheer venkata  |  18-11-2021   | pass    |
      | jaya            |     venkat          |  19-11-2021   | pass    |
      
  
 Scenario: Validate events today functionality in calendar
    Given after home page user go to calender 
    When click on view today
    When events will appear which are present in today 
    Then we can click on event and see  which are available
  
 Scenario: Validate events  weekly functionality in calendar
    Given after home page user go to calender 
    When click on view week
    When events will appear which are present in today 
    Then we can click on event and see  which are available
  
 Scenario: Validate events month functionality in calendar
    Given after home page user go to calender 
    When click on view month
    When events will appear which are present in today 
    Then we can click on event and see  which are available

  Scenario: Validate that user can delete the details in calendar
    Given after home page user click on  calender 
    When events will appear which are present in today calendar
    And select the week or month view
    And click on date event then click on delete
    Then Delete conformation will ask 
    And click on ok button to delete
    
  Scenario: Validate that user can edit the setails in calendar
    Given after home page user click on  calender 
    When events will appear which are present in calendar 
    And click on event 
    And select the week or month view
    And click on date event then click on edit
    Then Form will open to edit 
    And click on save button to edit
    