package com.bridgelabz.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.pages.FriendsPage;
import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.util.TestUtil;
import org.testng.Assert;


@Listeners(com.fpm.qa.Extentreportlistener.TestNG_Listener.class)
public class FriendsPageTest extends FriendsPage {
	FriendsPage friendpage;	
    HomePage homepage;
    TestUtil testUtil;
	public FriendsPageTest(){
	        super();
	    }
	
	 public void setUpFriendsPage() {
			initialization();
			LoginPage loginPage = new LoginPage();
			testUtil = new TestUtil();
			homepage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		}
	 
	 @Test(priority = 1)
	 public void FriendsPageTest() {
			boolean flag = friendpage.verifyFriends();
			Assert.assertTrue(flag);
		}
	 @Test(priority = 2)
	 public void SettingPageTest() {
			boolean flag = friendpage.verifySetting();
			Assert.assertTrue(flag);
		}
	 @Test(priority = 3)
	 public void HomePageTest() {
			boolean flag = friendpage.verifyHome();
			Assert.assertTrue(flag);
		}
	 @Test(priority = 4)
	 public void friendrequestPageTest() {
			boolean flag = friendpage.verifyFriendsRequest();
			Assert.assertTrue(flag);
		}
	  @Test(priority = 5)
	 public void suggestionsPageTest() {
			boolean flag = friendpage.verifySuggestions();
			Assert.assertTrue(flag);
		}
	  @Test(priority = 6)
		 public void allfriendsPageTest() {
				boolean flag = friendpage.verifyAllFriends();
				Assert.assertTrue(flag);
			}
	  @Test(priority = 7)
		 public void BirthdaysPageTest() {
				boolean flag = friendpage. verifyBirthdays();
				Assert.assertTrue(flag);
			}
	 
	  @Test(priority = 8)
		 public void CustomListPageTest() {
				boolean flag = friendpage. verifyCustomList();
				Assert.assertTrue(flag);
			}
	  @Test(priority = 8)
		 public void NewMessagesPageTest() {
				boolean flag = friendpage. verifyNewMessages();
				Assert.assertTrue(flag);
			}
	  @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
