package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

public class ProfilePage extends Base {


@FindBy(xpath = "//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo'][normalize-space()='Posts']")
WebElement posts;

@FindBy(xpath = "//span[normalize-space()='About']")
WebElement about;

@FindBy(xpath = "//span[normalize-space()='More']")
WebElement more;
 
@FindBy(xpath = "//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgww as m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y'][normalize-space()='Friends']")
WebElement friends;

@FindBy(xpath = "//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y'][normalize-space()='Photos']")
WebElement photos;

@FindBy(xpath = "//body/div[@id='mount_0_0_Tz']/div/div/div[@class='bdao358l om3e55n1 g4tp4svg']/div[@class='bdao358l om3e55n1 g4tp4svg']/div[@class='g4tp4svg om3e55n1 cqf1kptm alzwoclg']/div[@class='alzwoclg cqf1kptm om3e55n1']/div[@class='alzwoclg cqf1kptm om3e55n1 kyj84mfa cofpoq2j']/div[@class='alzwoclg cqf1kptm p1t2w4gn fawcizw8 om3e55n1 g4tp4svg']/div[@class='alzwoclg cqf1kptm fawcizw8']/div[@class='alzwoclg cqf1kptm cgu29s5g fawcizw8 aeinzg81']/div[@role='main']/div[@class='bdao358l g4tp4svg sl4bvocy km253p1d']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg jcxyg2ei o9w3sbdw sr926ui1 jl2a5g8c lq5mtui6 gwpvdwa8 jez8cy9q']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg cqf1kptm aeinzg81 jg3vgc78 cgu29s5g i15ihif8 r227ecj6 gt60zsk1 ouf5zffg eyke0d2h tvp8h2cm']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg jez8cy9q sl27f92c i85zmo3j sr926ui1 jl2a5g8c']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg cqf1kptm gvxzyvdx aeinzg81 jg3vgc78 cgu29s5g i15ihif8']/div[@class='bdao358l g4tp4svg lq84ybu9 hf30pyar om3e55n1']/div[@class='bdao358l om3e55n1 g4tp4svg s19c0p35 iwr3bmeu h8ua7xya']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg jez8cy9q sl27f92c o9w3sbdw sr926ui1 jl2a5g8c gqg21c1y cdum9rwi r0bj8g6i jwi1zfqx rhiv3dam dxq0meaq']/div[@class='bdao358l om3e55n1 g4tp4svg alzwoclg cqf1kptm gvxzyvdx aeinzg81 jg3vgc78 cgu29s5g i15ihif8']/div[@data-pagelet='ProfileTabs']/div[@class='f7rl1if4 adechonz rufpak1n qtovjlwq qbmienfq rfyhaz4c rdmi1yqr ohrdq8us nswx41af fawcizw8 l1aqi3e3 om3e55n1 sdu1flz4 dahkl6ri']/div[@role='tablist']/div[@class='lisst02g om3e55n1']/div[@class='z6erz7xo bdao358l on4d8346 s8sjc6am myo4itp8 ekq1a7f9']/a[1]/div[1]")
WebElement videos;

@FindBy(xpath ="//span[normalize-space()='Check-ins']")
WebElement check_Ins;

@FindBy(xpath ="//div[@aria-label='Add Bio']//div[@class='om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt']")
WebElement addBio;

@FindBy(xpath ="//div[@aria-label='Edit details']//div[@class='om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt']")
WebElement editDetails;

@FindBy(xpath ="//span[contains(text(),'Add Hobbies')]")
WebElement addHobbies;

//Initializing the Page Objects:
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public boolean verifyPosts() {
		return posts.isDisplayed();
	}

	public boolean verifyAbout() {
		return about.isDisplayed();
		
	}
	public boolean verifyMore() {
		return more.isDisplayed();
		
	}
	public boolean verifyFriends() {
		return friends.isDisplayed();
	}
	public boolean verifyPhotos() {
		return photos.isDisplayed();
	}
	public boolean verifyVideos() {
		return videos.isDisplayed();
    }
	public boolean verifyCheck_Ins() {
		return check_Ins.isDisplayed();
	}
	public boolean verifyAddBio() {
		return addBio.isDisplayed();
	}
	public boolean verifyeditDetails() {
		return editDetails.isDisplayed();
	}
	public boolean verifyaddHobbies() {
		return addHobbies.isDisplayed();
	}
	
}  












