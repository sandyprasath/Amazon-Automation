package com.amazon.helper;

import org.openqa.selenium.WebDriver;

import com.amazon.pom.Addfirst;
import com.amazon.pom.Addsecond;
import com.amazon.pom.Addthird;
import com.amazon.pom.Homepage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private Homepage hp;
	private Addfirst ar;
	private Addsecond as;
	private Addthird at;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Homepage getHp() {
		 hp= new Homepage(driver);
		return hp;
	}
	public Addfirst getAr() {
		ar= new Addfirst(driver);
		return ar;
	}
	public Addsecond getAs() {
		as=new Addsecond(driver);
		return as;
	}
	public Addthird getAt() {
		at=new Addthird(driver);
		return at;
	}
}
