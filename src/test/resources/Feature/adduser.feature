Feature: Orange_HRM Add user

  Scenario: Orange_HRM AddUser Test Scenario
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then User enters username as "Admin"
    And User enters password as "admin123"
    Then User Clicks on Login button
    Then user clicks on admin
    Then user clicks on add
    Then user select user role And enter employee name as "Pe" And select Status
    Then user enters username as "ujjwal54"
    Then user enters password as "Abc@989898"
    And user enters confirm_password as "Abc@989898"
    Then user click on Save button