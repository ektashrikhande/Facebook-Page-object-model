package com.bridgelabz.testcases;

import org.openqa.selenium.By;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.ProfilePage;
import com.bridgelabz.util.TestUtil;

import org.testng.Assert;
@Listeners(com.fpm.qa.Extentreportlistener.TestNG_Listener.class)
public class ProfilePageTest  extends ProfilePage {
	ProfilePage profilepage;	
    HomePage homepage;
    TestUtil testUtil;
	public ProfilePageTest(){
	        super();
	    
	 }
	    
	    	@BeforeMethod
	    	public void setUpHomePage() {
	    		initialization();
	    		LoginPage loginpage = new LoginPage();
	    		testUtil = new TestUtil();
	    		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	    		driver.findElement(By.xpath("//div[@class='alzwoclg cqf1kptm tpvapw4o th51lws0 mfn553m3 om3e55n1 gb2oqlaf n853dmmh no4pw96u aiqapapm af4bhcrp bx95oyie']//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
	    	}
	       
	    	 @Test(priority = 1)
	    	 public void PostsPageTest() {
	    			boolean flag = profilepage.verifyPosts();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 2)
	    	 public void AboutPageTest() {
	    			boolean flag = profilepage.verifyAbout();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 3)
	    	 public void MorePageTest() {
	    			boolean flag = profilepage.verifyMore();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 4)
	    	 public void FriendsPageTest() {
	    			boolean flag = profilepage.verifyFriends();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 5)
	    	 public void VideosPageTest() {
	    			boolean flag = profilepage.verifyVideos();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 6)
	    	 public void Check_InsPageTest() {
	    			boolean flag = profilepage.verifyCheck_Ins();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 7)
	    	 public void AddBioPageTest() {
	    			boolean flag = profilepage.verifyAddBio();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 8)
	    	 public void EditDetailsPageTest() {
	    			boolean flag = profilepage.verifyeditDetails();
	    			Assert.assertTrue(flag);
	    		}
	    	 @Test(priority = 9)
	    	 public void AddHobbiesPageTest() {
	    			boolean flag = profilepage.verifyaddHobbies();
	    			Assert.assertTrue(flag);
	    		}
	    	 
	    	 @AfterTest
	    public void closeBrowsers(){
	          driver.quit();
	    }
	}


