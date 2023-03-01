Feature:user should be able to make a successful order in website

  @smoke
  Scenario:user can show items of listed category
    Given user open browser and open demoBlaze website
    And user navigate to login page
    When user send username and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    And user click on each listed category
    And items of selected category is displayed

  @sanity
  Scenario:user can add random item to cart and remove it
    Given user open browser and open demoBlaze website
    And user navigate to login page
    When user send username and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    When user click on random item and add it to cart
    Then alert of item added is displayed and user accept that
    And user navigate to cart page
    And user delete item from cart

  @integration
  Scenario:user can complete successful checkout
    Given user open browser and open demoBlaze website
    And user navigate to login page
    When user send username as and password
    And user click on login button
    Then home page is opened and welcome text is displayed
    When user click on random item and add it to cart
    Then alert of item added is displayed and user accept that
    When user navigate to cart page
    And user click on place order button
    And user fill all order information and click on purchase button
    Then order invoice is displayed and user click on ok button