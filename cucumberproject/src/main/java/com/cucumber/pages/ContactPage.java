package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberproject.steps.TestBase;

public class ContactPage {
	
	@FindBy(css="#site-navigation > div:first-of-type > ul > li:nth-of-type(5) > a")
	WebElement contactForm;
	
	@FindBy(css="input#wpforms-3347-field_1")
	WebElement Fname;
	
	@FindBy(css="input#wpforms-3347-field_1-last")
	WebElement Lname;
	
	@FindBy(css="input#wpforms-3347-field_2")
	WebElement email;
	
	
	@FindBy(css="input#wpforms-3347-field_3_1")
	WebElement Bronze;
	
	@FindBy(css="input#wpforms-3347-field_4_1")
	WebElement Session1;
	
	@FindBy(css="input#wpforms-3347-field_5_1")
	WebElement overnightyes;
		
	@FindBy(css="input#wpforms-3347-field_6_1")
	WebElement emailUpdate;
	
	@FindBy(css="textarea#wpforms-3347-field_7")
	WebElement comments;
	
	@FindBy(css="div.recaptcha-checkbox-border")
	WebElement captcha;
	
	@FindBy(css="button#wpforms-submit-3347")
	WebElement submit;
	
	@FindBy(css="label#wpforms-3347-field_2-error")
	WebElement emailValidation;
	
	@FindBy(css="#wpforms-confirmation-3347 > p")
	WebElement contactconfirmmsg;
	
	@FindBy(css="label#wpforms-3347-field_1-error")
	WebElement requiredFieldErrorMsg;
	
	
	
	public ContactPage() {
		PageFactory.initElements(TestBase.getDriver(),this);
	}
	
	public void clickOnContactForm() {
		contactForm.click();
	}
	
	public void FillContactForm() {
		Fname.sendKeys("1234");
		Lname.sendKeys("45667");
		email.sendKeys("kirtikhande10@gmail.com");
		Bronze.click();
		Session1.click();
		overnightyes.click();
		comments.sendKeys("General Enquiry");
		
		
		
	}
	public void FillTheContactForm() {
		Fname.sendKeys("$%^&&");
		Lname.sendKeys("%^&*");
		email.sendKeys("kirtikhande10@gmail.com");
		Bronze.click();
		Session1.click();
		overnightyes.click();
		comments.sendKeys("General Enquiry");
	}
	
	public void FillContactFormCorrectly() {
		Fname.sendKeys("kirti");
		Lname.sendKeys("Birangal");
		email.sendKeys("kirtikhande10@gmail.com");
		Bronze.click();
		Session1.click();
		overnightyes.click();
		comments.sendKeys("General Enquiry");
		
	}
	
	public void clickOnCaptcha() throws InterruptedException {
		TestBase.getDriver().switchTo().frame(TestBase.getDriver().findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]")));
		Thread.sleep(5000);
		captcha.click();
		TestBase.getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
	}
	public void clickOnSubmit() {
		submit.click();
	}
}
	
	
	

