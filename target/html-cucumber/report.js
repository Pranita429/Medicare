$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Loginmedicare.feature");
formatter.feature({
  "name": "Login into medicare",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as an User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.RegisterStepdf.user_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegisterStepdf.user_click_on_Login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"Sana@gmail.com\" and Password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegisterStepdf.user_enter_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.RegisterStepdf.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on view Products",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.click_on_view_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Landed on view Products page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.validate_Landed_on_view_Products_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Cart icon to add one item to cart and enter the quantity",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.click_on_Cart_icon_to_add_one_item_to_cart_and_enter_the_quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user landed on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.user_landed_on_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on checkout",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.click_on_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate User landed on Shipping address page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.validate_User_landed_on_Shipping_address_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click select option",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.user_click_select_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate landed on Total summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.validate_landed_on_Total_summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give credit card details",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.give_credit_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Final payment",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.click_on_Final_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validated Order confirmed page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepdf.validated_Order_confirmed_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});