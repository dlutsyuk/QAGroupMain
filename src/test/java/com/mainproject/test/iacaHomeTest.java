package com.mainproject.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mainproject.page.IaCa;

public class iacaHomeTest {

	private WebDriver driver;
	private IaCa IaCa = new IaCa();

	//@BeforeClass(alwaysRun = true)
	//public void setUp() {
	//	IaCa.openStartPage();
	//}

	@Test
	public void testOpenHomePage() {
		IaCa.openStartPage();
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "iA | Industrial Alliance | Insurance");

		//driver.findElement(By.cssSelector(".test")).click();

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		IaCa.close();
	}

}
