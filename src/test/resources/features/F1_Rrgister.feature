@smoke
Feature:user should be able to register into website

  Scenario:user can register with valid data
    Given user open browser and open demoBlaze website
    And user navigate to register page
    When user send username and password
    And user click on signup button
    Then alert of account creation is displayed and user accept that