package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Hello, Sign in']")
	private WebElement signin;
	@FindBy(name= "email")
	private WebElement email;
	@FindBy(id = "continue")
	private WebElement Continue;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(id= "signInSubmit")
	private WebElement clicksignin;

	
	public Homepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClicksignin() {
		return clicksignin;
	}
	
	
	
}
