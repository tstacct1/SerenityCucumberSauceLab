@regression @complete-order
Feature: User can browse product and complete success order in SauceLab Ecommerce Site
   
  @complete-order
   Scenario: User adds multiple products in cart and completed order
   Given "Standard_User" is on login page
   When he provide the "standard_user" and "secret_sauce" in the login page and click the login button
   Then he should be navigated to the Products page
   And he should see the product with "Sauce Labs Backpack" and "29.99" 
   When he adds the product into cart with product name "Sauce Labs Backpack" and price "29.99"
   Then the product count should be added in the cart
   When he clicks on the cart page icon
   Then the Cart page should be displayed with the added product information
   When he clicks on the checkout button
   And he provides the required information "Ben", "Stokes" and "1234" in user information page and clicks the continue button
   Then he should be navigated to the checkout page
   And he should see the information of added product in checkout page
   When he clicks the finish button on the checkout page
   Then he should see Thank You message in the success page
