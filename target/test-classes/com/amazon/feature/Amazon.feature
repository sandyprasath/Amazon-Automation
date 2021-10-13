Feature: Adding three products into cart from Hot New Releases Category 
Scenario: Verify that user able to login Amazon Home Page with credentials
  Given User launch amazon application
  When User click signin in homepage
  And User enter the valid username
  And User click continue
  And User enter the valid password
  And User click signin
  Then Verify the username and password
  Scenario: Verify that user add the first product in cart page
  Given Verify that user in hot deals page for first product
  When Goto new release1
  And Click the first product
  And Click Add first product to Cart 
  Then Verify the first product is added in cart page
  Scenario: Verify that user add the second product in cart page
  Given Verify that user in hot deals page for second product
  When Goto new release2
  And Click the second product
  And Click Add second product to Cart 
  Then Verify the second product is added in cart page
  Scenario: Verify that user add the third product in cart page
  Given Verify that user in hot deals page for third product
  When Goto new release3
  When Click the third product
  And Click Add third product to Cart 
  And Verify the third product is added in cart page
  Then Verify that all three products added in cart