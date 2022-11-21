package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

public class FriendsPage extends Base {

   
   
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M15 35.8C6')]")
    WebElement friends;
    
    @FindBy(xpath = "//div[@aria-label='Edit notification settings']//i[@class='gneimcpu b0w474w7']")
    WebElement setting;
     
    @FindBy(xpath ="//a[@class='qi72231t o9w3sbdw tav9wjvu flwp5yud tghlliq5 gkg15gwv s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg jl2a5g8c f14ij5to l3ldwz01 icdlwmnq h8391g91 m0cukt09 kpwa50dg ta68dy8c b6ax4al1 k0wzcmhh']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk aeinzg81 srn514ro rl78xhln om3e55n1 g4tp4svg i85zmo3j jl2a5g8c b0eko5f3 fwlpnqze il7dmu95']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m g4tp4svg i85zmo3j k88nbmki jl2a5g8c om3e55n1']//div[@class='o9w3sbdw s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cqf1kptm cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 oxkhqvkx nch0832m om3e55n1 g4tp4svg jg3vgc78 s1m0hq7j rj2hsocd']//div//div[@class='alzwoclg cqf1kptm siwo0mpr gu5uzgus']")
    WebElement home;
    
    @FindBy(xpath ="//a[@href='/friends/requests/']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk aeinzg81 srn514ro rl78xhln om3e55n1 g4tp4svg i85zmo3j jl2a5g8c b0eko5f3 fwlpnqze il7dmu95']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m g4tp4svg i85zmo3j k88nbmki jl2a5g8c om3e55n1']//div[@class='o9w3sbdw s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cqf1kptm cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 oxkhqvkx nch0832m om3e55n1 g4tp4svg jg3vgc78 s1m0hq7j rj2hsocd']//div//div[@class='alzwoclg cqf1kptm siwo0mpr gu5uzgus']//div[@class='jroqu855 nthtkgg5']//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o']")
    WebElement friendrequest;
    
    @FindBy(xpath ="//span[contains(text(),'Suggestions')]")
    WebElement suggestions;
    
    @FindBy(xpath ="//a[@href='/friends/list/']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk aeinzg81 srn514ro rl78xhln om3e55n1 g4tp4svg i85zmo3j jl2a5g8c b0eko5f3 fwlpnqze il7dmu95']//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m g4tp4svg i85zmo3j k88nbmki jl2a5g8c om3e55n1']//div[@class='o9w3sbdw s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cqf1kptm cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 oxkhqvkx nch0832m om3e55n1 g4tp4svg jg3vgc78 s1m0hq7j rj2hsocd']//div//div[@class='alzwoclg cqf1kptm siwo0mpr gu5uzgus']//div[@class='jroqu855 nthtkgg5']//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o']")
    WebElement allfriends;
    
    @FindBy(xpath ="//span[contains(text(),'Birthdays')]")
    WebElement birthdays;
    
    @FindBy(xpath ="//span[contains(text(),'Custom lists')]")
    WebElement customlist;
    
    @FindBy(xpath ="//div[@aria-label='New Message']")
    WebElement newmessages;

    
//Initializing the Page Objects:
	public FriendsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public boolean verifyFriends() {
		return friends.isDisplayed();
	}
	
	public boolean verifySetting() {
		return setting.isDisplayed();
	}
	public boolean verifyHome() {
		return home.isDisplayed();
	}
	public boolean verifyFriendsRequest() {
		return friendrequest.isDisplayed();
	}
	public boolean verifySuggestions() {
		return suggestions.isDisplayed();	
	}
	public boolean verifyAllFriends() {
		return allfriends.isDisplayed();	
	}
	public boolean verifyBirthdays() {
		return birthdays.isDisplayed();
	}
	public boolean verifyCustomList() {
		return customlist.isDisplayed();	
	}
	public boolean verifyNewMessages() {
		return newmessages.isDisplayed();
	}
	
	
	
}

