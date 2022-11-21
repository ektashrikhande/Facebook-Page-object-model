package com.bridgelabz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.pages.GroupPage;
import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.util.TestUtil;
@Listeners(com.fpm.qa.Extentreportlistener.TestNG_Listener.class)
public class GroupPageTest extends GroupPage {
	GroupPage grouppage;	
    HomePage homepage;
    TestUtil testUtil;
	public GroupPageTest(){
	        super();
	    }
	
	 public void setUpFriendsPage() {
			initialization();
			LoginPage loginPage = new LoginPage();
			testUtil = new TestUtil();
			homepage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		}
	 
	 @Test(priority = 1)
	 public void GroupPageTest() {
			boolean flag = grouppage.verifyGroup();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 2)
	 public void YourFeedPageTest() {
			boolean flag = grouppage.verifyYourFeed();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 3)
	 public void DiscoverPageTest() {
			boolean flag = grouppage.verifyDiscover();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 4)
	 public void CreateNewGroupsPageTest() {
			boolean flag = grouppage.verifyCreateNewGroups();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 5)
	 public void GroupsyouhavejoinedPageTest() {
			boolean flag = grouppage.verifyGroupsyouhavejoined();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 6)
	 public void JoinGroupPageTest() {
			boolean flag = grouppage.verifyJoinGroup();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 7)
	 public void FallowGroupPageTest() {
			boolean flag = grouppage.verifyFallowGroup();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 8)
	 public void RecentActivityPageTest() {
			boolean flag = grouppage.verifyRecentActivity();
			Assert.assertTrue(flag);
      }
	 @Test(priority = 8)
	 public void SeeMorePageTest() {
			boolean flag = grouppage.verifySeeMore();
			Assert.assertTrue(flag);
      }
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}	 
	 
	 
	 
	 
	 
