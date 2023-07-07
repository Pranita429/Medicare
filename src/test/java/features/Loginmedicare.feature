Feature: Login into medicare

  @Sanity
  Scenario: Login as an User
    Given User launch the application
    Then User click on Login link
    Then User enter Email as "Sana@gmail.com" and Password as "admin"
    And click on login
    When Click on view Products
    And Validate Landed on view Products page
    And Click on Cart icon to add one item to cart and enter the quantity
    And user landed on checkout page
    And click on checkout
    Then Validate User landed on Shipping address page.
    When User click select option
    Then Validate landed on Total summary page
    When Give credit card details
    And Click on Final payment
    Then Validated Order confirmed page
