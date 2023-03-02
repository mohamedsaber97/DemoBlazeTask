Feature:user should be able to make a successful order in website

  @smoke
  Scenario:user can show items of listed category
    Given user open demoBlaze website with url
    And user navigate to login page
    When user send login username and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    And user click on phones category and check item display

  @smoke @integration
  Scenario:user can add random item to cart and remove it
    Given user open demoBlaze website with url
    And user navigate to login page
    When user send login username and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    And user click on phones category and check item display
    When user click on random item and add it to cart
    Then alert of item added is displayed and user accept that
    And user navigate to cart page
    And user delete item from cart

  @smoke @integration
  Scenario:user can complete successful checkout
    Given user open demoBlaze website with url
    And user navigate to login page
    When user send login username and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    And user click on phones category and check item display
    When user click on random item and add it to cart
    Then alert of item added is displayed and user accept that
    When user navigate to cart page
    And user click on place order button
    And user fill all order information and click on purchase button
    Then order invoice is displayed and user click on ok button