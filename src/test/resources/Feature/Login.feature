Feature: Validation of Login Scenario

  #Author: ujjwal
  Scenario: Login with Valid Credentials
    Given open the browser
    When enter Username  "<login.username>" and Password  "<login.password>"
    Then execute successfull
    
    Examples:
          |login.username|login.password|
          |username|password|
          |username1|password1|
    