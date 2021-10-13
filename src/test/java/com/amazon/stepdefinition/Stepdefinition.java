package com.amazon.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClasss;
import com.amazon.helper.File_Reader_Manager;
import com.amazon.helper.PageObjectManager;
import com.amazon.runner.Runner;
import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClasss {

	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch amazon application$")
	public void user_launch_amazon_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);
		implicitWait(3);
	}

	@When("^User click signin in homepage$")
	public void user_click_signin_in_homepage() throws Throwable {
		click(pom.getHp().getSignin());
		implicitWait(3);
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		sendKeys(pom.getHp().getEmail(), "mipav54222@cantouri.com");
		implicitWait(3);
	}

	@When("^User click continue$")
	public void user_click_continue() throws Throwable {
		click(pom.getHp().getContinue());
		implicitWait(3);
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		sendKeys(pom.getHp().getPassword(), "cucumber123");
		implicitWait(3);
	}

	@Then("^User click signin$")
	public void user_click_signin() throws Throwable {
		click(pom.getHp().getClicksignin());
		implicitWait(3);
	}

	@Given("^Verify that user in hot deals page for first product$")
	public void verify_that_user_in_hot_deals_page_for_first_product() throws Throwable {
		click(pom.getAr().getAll());
		implicitWait(3);
	}

	@When("^Goto new release")
	public void goto_new_release1() throws Throwable {
		click(pom.getAr().getNewRelease());
		implicitWait(3);
	}

	@And("^Click the first product$")
	public void click_the_first_product() throws Throwable {
		click(pom.getAr().getFirstProduct());
		implicitWait(3);
	}

	@And("^Click Add first product to Cart$")
	public void click_Add_first_product_to_Cart() throws Throwable {
		click(pom.getAr().getFirstAdded());
		implicitWait(3);
	}

	@Then("^Verify the first product is added in cart page$")
	public void verify_the_first_product_is_added_in_cart_page() throws Throwable {
		click(pom.getAr().getCheckFirst());
		implicitWait(3);
	}
	
	@Given("^Verify that user in hot deals page for second product$")
	public void verify_that_user_in_hot_deals_page_for_second_product() throws Throwable {
		click(pom.getAs().getAll());
		implicitWait(3);
	}

	@When("^Goto new release for second$")
	public void goto_new_release11() throws Throwable {
		click(pom.getAs().getNewRelease());
		implicitWait(3);
	}
	@And("^Click the second product$")
	public void click_the_second_product() throws Throwable {
	click(pom.getAs().getSecondProduct());
	implicitWait(3);
	}

	@And("^Click Add second product to Cart$")
	public void click_Add_second_product_to_Cart() throws Throwable {
		click(pom.getAs().getSecondAdded());
		implicitWait(3);
	}

	@Then("^Verify the second product is added in cart page$")
	public void verify_the_second_product_is_added_in_cart_page() throws Throwable {
	click(pom.getAs().getCheckSecond());
	implicitWait(3);
	}
	
	@Given("^Verify that user in hot deals page for third product$")
	public void verify_that_user_in_hot_deals_page_for_third_product() throws Throwable {
		click(pom.getAt().getAll());
		implicitWait(3);
	}

	@When("^Goto new release for third$")
	public void goto_new_release111() throws Throwable {
		click(pom.getAt().getNewRelease());
		implicitWait(3);
	}
	@And("^Click the third product$")
	public void click_the_third_product() throws Throwable {
		click(pom.getAt().getThirdProduct());
		implicitWait(3);
	}

	@And("^Click Add third product to Cart$")
	public void click_Add_third_product_to_Cart() throws Throwable {
		click(pom.getAt().getThirdAdded());
		implicitWait(3);
	}

	@Then("^Verify the third product is added in cart page$")
	public void verify_the_third_product_is_added_in_cart_page() throws Throwable {
		click(pom.getAt().getCheckthird());
		
	}

}