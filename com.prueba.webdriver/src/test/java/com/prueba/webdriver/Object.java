package com.prueba.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Object {

	private static WebDriver driver;
	String path="./src/test/resources/Drivers/chromedriver.exe";
	
	
	
	public Object(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver chromeinicio () {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void escribir(String mensaje,By  locator) {
		driver.findElement(locator).sendKeys(mensaje);
	}
	
	public void clic(By locator) {
		driver.findElement(locator).click();
	}
	
	public void submit(By locator) {
		driver.findElement(locator).submit();
	}
	
	public String estaEnPantalla(By locator) {
			return driver.getTitle();

	}
}
