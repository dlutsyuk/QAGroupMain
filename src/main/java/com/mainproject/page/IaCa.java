package com.mainproject.page;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IaCa {
	
	private WebDriver driver;

	private static String baseUrl = "http://ia.ca/individuals/";

	public StartPage openStartPage() {
		String pathSeparator = File.separator;
		String pathToDriver = "assets" + pathSeparator + "webdriver" + pathSeparator + "geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", pathToDriver);

		driver = new FirefoxDriver();
		driver.get(baseUrl);

		return new StartPage(driver);
	}

	public void close() {
		if (this.driver != null)
			this.driver.quit();
		this.driver = null;
	}


}
