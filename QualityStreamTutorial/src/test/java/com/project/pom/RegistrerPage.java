package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrerPage extends Base {

	public RegistrerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By registerLinkLocator = By.id("login");
	By registerPageLocator = By.id("title-step1");
	
	/*
	By registrerLinkLocator = By.partialLinkText("");
	By registrerLinkLocator = By.partialLinkText("");
	By registrerLinkLocator = By.partialLinkText("");
	By registrerLinkLocator = By.partialLinkText("");
	By registrerLinkLocator = By.partialLinkText("");
	By registrerLinkLocator = By.partialLinkText("");
	*/

}
