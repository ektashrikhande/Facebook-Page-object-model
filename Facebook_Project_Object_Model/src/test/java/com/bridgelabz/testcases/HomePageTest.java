package com.bridgelabz.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.util.TestUtil;
import org.testng.Assert;
@Listeners(com.fpm.qa.Extentreportlistener.TestNG_Listener.class)
public class HomePageTest extends HomePage{
	HomePage homePage;
	TestUtil testUtil;
	HomePage homeLink;
	LoginPage loginpage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUpHomePage() {
		initialization();
		LoginPage loginpage = new LoginPage();
		testUtil = new TestUtil();
		homePage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	

	@Test(priority = 1)
	public void fpmTitleTest() {
		boolean flag = homePage.validateFPMTitle();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void fpmEventsTest() {
		boolean flag = homePage.validateFPMEvents();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void fpmWatchTest() {
		boolean flag = homePage.validateFPMWatch();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void fpmMessengerTest() {
		boolean flag = homePage.validateFPMMessenger();
		Assert.assertTrue(flag);
	}

	@Test(priority = 5)
	public void fpmNotificationsTest() {
		boolean flag = homePage.validateFPMNotifications();
		Assert.assertTrue(flag);
	}

	@Test(priority = 6)
	public void fpmfindfirendsTest() {
		boolean flag = homePage.validateFPMfindfirends();
		Assert.assertTrue(flag);
	}

	@Test(priority = 7)
	public void fpmserachTest() {
		boolean flag = homePage.validateFPMserach();
		Assert.assertTrue(flag);
	}

	@Test(priority = 8)
	public void fpmNameLableTest() {
		boolean flag = homePage.validateFPMNameLable();
		Assert.assertTrue(flag);
	}

	@Test(priority = 9)
	public void fpmAddPictureBtnTest() {
		boolean flag = homePage.validateFPMFAddPictureBtn();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}


