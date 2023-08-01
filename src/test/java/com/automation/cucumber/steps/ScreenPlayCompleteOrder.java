package com.automation.cucumber.steps;

import com.automation.screenplay.abilities.Authenticate;
import com.automation.screenplay.abilities.UserRegister;
import com.automation.screenplay.questions.AddToCartVerification;
import com.automation.screenplay.questions.CheckOutPageNavigation;
import com.automation.screenplay.questions.CheckOutVerification;
import com.automation.screenplay.questions.HomePageNavigation;
import com.automation.screenplay.questions.ProductVerification;
import com.automation.screenplay.questions.SuccessPageNavigation;
import com.automation.screenplay.tasks.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

public class ScreenPlayCompleteOrder {
	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{string} is on login page")
	public void is_on_login_page(String actor) {
		theActorCalled(actor).attemptsTo(Start.prepareToSignIn(),GoToLogin.called());
	}

	@When("he provide the {string} and {string} in the login page and click the login button")
	public void he_provide_the_and_in_the_login_page_and_click_the_login_button(String username, String password) {
		theActorInTheSpotlight().whoCan(Authenticate.with(username, password)).attemptsTo(LogIn.withCredentials());

	}

	@Then("he should be navigated to the Products page")
	public void he_should_be_navigated_to_the_products_page() {
		theActorInTheSpotlight().should(seeThat(TheWebPage.title(), Matchers.containsString("Swag Labs")));
		assertThat(HomePageNavigation.displayed().answeredBy(theActorInTheSpotlight()), Matchers.containsString("Products"));
	}

	@Then("he should see the product with {string} and {string}")
	public void he_should_see_the_product_with_and(String ar1, String ar2) {
		String[] productInfo = ProductVerification.displayed().answeredBy(theActorInTheSpotlight());	
		String actualProductName = productInfo[0];
		String actualProductPrice = productInfo[1];
		assertThat(actualProductName, Matchers.equalTo("Sauce Labs Backpack"));
		assertThat(actualProductPrice, Matchers.equalTo("$29.99"));

	}

	@When("he adds the product into cart with product name {string} and price {string}")
	public void he_adds_the_product_into_cart_with_product_name_and_price(String productName, String productPrice) {
		theActorInTheSpotlight().attemptsTo(AddToCart.withProduct(productName, productPrice));
	}

	@Then("^the product count should be added in the cart$")
	public void the_product_count_should_be_added_in_the_cart() {
		String productCount[] = AddToCartVerification.displayed().answeredBy(theActorInTheSpotlight());
		String actualProductCount = productCount[0];
		assertThat(actualProductCount, Matchers.equalTo("1"));
	}

	@When("^he clicks on the cart page icon$")
	public void he_clicks_on_the_cart_page() {
		theActorInTheSpotlight().attemptsTo(GoToCart.navigation());
	}

	@Then("^the Cart page should be displayed with the added product information$")
	public void the_Cart_page_should_be_displayed_with_the_added_product_information() {
		String productInfoInCart[] = AddToCartVerification.displayed().answeredBy(theActorInTheSpotlight());
		String actualProductNameInCart = productInfoInCart[1];
		String actualProductPriceInCart = productInfoInCart[2];
		assertThat(actualProductNameInCart, Matchers.equalTo("Sauce Labs Backpack"));
		assertThat(actualProductPriceInCart, Matchers.equalTo("$29.99"));
	}

	@When("^he clicks on the checkout button$")
	public void he_clicks_on_the_checkout_button() {
		theActorInTheSpotlight().attemptsTo(GoToUserInfo.navigation());
	}

	@When("^he provides the required information \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" in user information page and clicks the continue button$")
	public void he_provides_the_required_information_and_in_user_information_page_and_clicks_the_continue_button(
			String firstName, String lastName, String zipCode) {
		theActorInTheSpotlight().whoCan(UserRegister.with(firstName, lastName, zipCode))
				.attemptsTo(Register.withUserInfo());
	}

	@Then("^he should be navigated to the checkout page$")
	public void he_should_be_navigated_to_the_checkout_page() {
		assertThat(CheckOutPageNavigation.displayed().answeredBy(theActorInTheSpotlight()), Matchers.containsString("Checkout: Overview"));
	}

	@Then("^he should see the information of added product in checkout page$")
	public void he_should_see_the_information_of_added_product_in_checkout_page() {
		String productInfoInCheckOut[] = CheckOutVerification.displayed().answeredBy(theActorInTheSpotlight());
		String actualProductNameInCheckOut = productInfoInCheckOut[0];
		String actualProductPriceInCheckOut = productInfoInCheckOut[1];
		String actualHeaderPaymentInCheckOut = productInfoInCheckOut[2];
		String actualHeaderShippingInCheckOut = productInfoInCheckOut[3];
		String actualHeaderTotalInCheckOut = productInfoInCheckOut[4];
		assertThat(actualProductNameInCheckOut, Matchers.equalTo("Sauce Labs Backpack"));
		assertThat(actualProductPriceInCheckOut, Matchers.equalTo("$29.99"));
		assertThat(actualHeaderPaymentInCheckOut, Matchers.equalTo("Payment Information"));
		assertThat(actualHeaderShippingInCheckOut, Matchers.equalTo("Shipping Information"));
		assertThat(actualHeaderTotalInCheckOut, Matchers.equalTo("Price Total"));
	}

	@When("^he clicks the finish button on the checkout page$")
	public void the_user_clicks_the_finish_button_on_the_confirmation_page() {
		theActorInTheSpotlight().attemptsTo(GoToSuccess.navigation());
	}

	@Then("^he should see Thank You message in the success page$")
	public void he_should_Thank_You_message_in_the_success_page() {
		assertThat(SuccessPageNavigation.displayed().answeredBy(theActorInTheSpotlight()), Matchers.containsString("Thank you for your order!"));
	}

}
