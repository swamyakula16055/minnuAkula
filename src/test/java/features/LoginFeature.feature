Feature: Login functionality

  #@practice
  Scenario: Verify the successful login functionality
    Given user navigates to orangeHrm url
    When user enters username as "Admin" and password as "admin123"
    Then user clicks on the login button
    Then user navigates to admin page
    Then click on the Admin in leftside menu
    Then click on the Add button
    And add all the required data
    Then click on save button
