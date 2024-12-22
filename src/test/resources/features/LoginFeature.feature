Feature: LoginFeature

  @Regression
  Scenario: User launches google
    When User launches google
    Then User searches

    @SmokeTest
  Scenario: User Logged in as Standard User
    When User launches SauceDemo
    Then User enters the credentials
    Then User logs in to SauceDemo

  @SmokeTest
  Scenario: User logged in as locked out user
    When User launches SauceDemo
    Then User enters the credentials for locked out user
    Then User is unable to login as locked out user

  @SmokeTest
  Scenario: User adds products in the cart
    When User launches SauceDemo
    Then User enters the credentials
    Then User logs in to SauceDemo
    Then User adds all the products in cart
    Then User verifies in the cart

  @SmokeTest
  Scenario: User adds products in the cart and removes the product
    When User launches SauceDemo
    Then User enters the credentials
    Then User logs in to SauceDemo
    Then User adds all the products in cart
    Then User verifies in the cart
    Then user removes the items from cart

    @SmokeTest
    Scenario: User adds the products and buys the products
      When User launches SauceDemo
      Then User enters the credentials
      Then User logs in to SauceDemo
      Then User adds all the products in cart
      Then User verifies in the cart
      Then User enters the details in checkout
      Then User verifies the pricing and itemlist
      Then User order is confirmed

      @SmokeTest
      Scenario: User sorts the products in the homepage
        When User launches SauceDemo
        Then User enters the credentials
        Then User logs in to SauceDemo
        Then User sorts with AtoZ
        Then User sorts with ZtoA
        Then User sorts with low to high
        Then User sorts with high to low

