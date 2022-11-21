package com.bridgelabz.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SignUpPage;
import com.bridgelabz.util.TestUtil;
@Listeners(com.fpm.qa.Extentreportlistener.TestNG_Listener.class)
public class SignUpPageTest extends SignUpPage {
	
	SignUpPage signuppage;	
    HomePage homepage;
    TestUtil testUtil;
	public SignUpPageTest(){
	        super();
	    
	 }
	    
	    	@BeforeMethod
	    	public void setUpHomePage() {
	    		initialization();
	    		LoginPage loginpage = new LoginPage();
	    		testUtil = new TestUtil();
	    		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	    		driver.get("https://www.facebook.com/reg/");
	    	}
	       
	    	 @Test(priority = 1)
	    	 public void SignUpPageTest() {
	    			String Title = signuppage.verifyTitleOfSignUpPage();
	    			Assert.assertEquals(Title,"Sign Up");
	    		}
	    	 @Test(priority = 2)
	    	 public void FirstNameTest() {
	    			String FirstName = signuppage.verifyFirstNameField();
	    			Assert.assertEquals(FirstName,"FirstName");
	    		}
	    	 
	    	 @Test(priority = 3)
	    	 public void LastNameTest() {
	    			String LastName = signuppage.verifyLastNameField();
	    			Assert.assertEquals(LastName,"LastName");
	    		}
	    	 @Test(priority = 4)
	    	 public void EmailTextTest() {
	    			String  Email = signuppage.verifyEmailTextField();
	    			Assert.assertEquals( Email,"reg_email__");
	    		}
	    	 @Test(priority = 5)
	    	 public void ConfirmEmailTextTest() {
	    			String ConfirmEmail = signuppage.verifyConfirmEmailTextField();
	    			Assert.assertEquals(ConfirmEmail,"reg_email_confirmation__");
	    		}
	    	 @Test(priority = 6)
	    	 public void PasswordTextFieldTest() {
	    			String Password  = signuppage.verifyPasswordTextField();
	    			Assert.assertEquals(Password,"password_step_input");
	    		}
	    	
	    	 @Test(priority = 7)
	    	 public void BirthDayTextFieldTest() {
	    			String Birthday  = signuppage.verifyBirthDayField();
	    			Assert.assertEquals(Birthday,"birthday_day");
	    		}
	    	 @Test(priority = 8)
	    	 public void BirthmonthTextFieldTest() {
	    			String Birthdaymonth  = signuppage.verifyBirthmonthField();
	    			Assert.assertEquals(Birthdaymonth,"birthday_month");
	    		}
	    	 @Test(priority = 9)
	    	 public void BirthYearFieldTest() {
	    			String Birthdayyear  = signuppage.verifyBirthYearField();
	    			Assert.assertEquals(Birthdayyear,"birthday_year");
	    		}
	    	 @Test(priority = 10)
	    	 public void GenderFieldTest() {
	    			String Gender  = signuppage.verifyGenderField();
	    			Assert.assertEquals(Gender,"sex");
	    		}
	    	 @Test(priority = 11)
	    	 public void SignUpBtnFieldTest() {
	    			String SignUpBtn  = signuppage.verifyGenderField();
	    			Assert.assertEquals( SignUpBtn,"websubmit");
	    		}
	    	 
	   @AfterTest
	    public void closeBrowsers(){
	          driver.quit();
	    }
	}



