package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
 WebDriver dr;
 By by_uid=By.xpath("//input[@name='UserName']");
 By by_pwd=By.xpath("//input[@name='Password']");
 By by_clk=By.xpath("//input[@class='desktopsubmit']");
 By by_ver=By.xpath("//input[@type='submit']");
 By by_d=By.xpath("//input[@id='KmsiCheckboxField']");
 By by_yes=By.xpath("//input[@type='submit']");
 public Login_page(WebDriver dr) {
	 this.dr=dr;
 }
 public void ent_uid(String uid) {
	 dr.findElement(by_uid).sendKeys(uid);
 }
 public void ent_pwd(String pwd) {
	 dr.findElement(by_pwd).sendKeys(pwd);
 }
 public void ent_login() {
	 dr.findElement(by_clk).click();
 }
   public void verify() {
	  try {
		Thread.sleep(10000);
		System.out.println("sleep");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("not found");
	 }
	   dr.findElement(by_ver).click();
   }
   public void skip() {
	   System.out.println("skip");
	   dr.findElement(by_d).click();
	   dr.findElement(by_yes).click();
   }
 public void do_login(String uid,String pwd) {
	 this.ent_uid(uid);
	 this.ent_pwd(pwd);
	 this.ent_login();
	 this.verify();
	 this.skip();
 }
}

