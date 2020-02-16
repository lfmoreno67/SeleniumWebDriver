package com.prueba.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends Object{

	WebDriver driver;
	
	//Localizadores Pagina Login
	By name = By.name("q");
	
	public Page(WebDriver driver) {
		super(driver);
	}
	
	public void iniciarSesion(){
		escribir("prueba selenium", name);
		submit(name);
		System.out.println(estaEnPantalla(name));
	}
	
	
}
