package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addsecond {

	public static WebDriver driver;
	
	@FindBy(id = "nav-hamburger-menu")
	private WebElement all;
	@FindBy(xpath = "//*[@id=\'hmenu-content\']/ul[1]/li[3]/a")
	private WebElement newRelease;
	@FindBy(xpath = "//*[@id=\'anonCarousel1\']/ol/li[2]/div[2]/div/a[2]/span/div")
	private WebElement secondProduct;
	@FindBy(id = "add-to-cart-button")
	private WebElement secondAdded;
	@FindBy(id = "nav-cart")
	private WebElement checkSecond;
	
	public Addsecond(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getAll() {
		return all;
	}
	public WebElement getNewRelease() {
		return newRelease;
	}
	public WebElement getSecondProduct() {
		return secondProduct;
	}
	public WebElement getSecondAdded() {
		return secondAdded;
	}
	public WebElement getCheckSecond() {
		return checkSecond;
	}
	


	
}
