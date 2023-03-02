@smoke
Feature:user should be able to login into website

  Scenario:user can login with registered data
    Given user open demoBlaze website with url
    And user navigate to login page
    When user send username and password
    And user click on login button
    Then home page is opened and welcome text is displayed