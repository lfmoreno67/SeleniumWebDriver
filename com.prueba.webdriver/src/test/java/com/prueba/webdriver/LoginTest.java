package com.prueba.webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	private WebDriver driver;
	Page pag = new Page(driver);

	@BeforeTest
	  public void setup() {
		pag = new Page(driver);
		driver = pag.chromeinicio();
		pag.visit("https://www.google.com");
	  }
	
	 @Test(priority=1)
	  public void Login() throws Exception {
		pag.iniciarSesion();
	  }
}
