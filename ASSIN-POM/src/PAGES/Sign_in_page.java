package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_in_page {
	 WebDriver dr;
	 By by_id=By.xpath("//input[@type='email']");
	 By by_clk=By.xpath("//input[@type='submit']");
	 public Sign_in_page(WebDriver dr) {
		 this.dr=dr;
	 }
	 public void do_sign(String id)
	 {
		 dr.findElement(by_id).sendKeys(id);
	 }
	 public void clicl_next() {
		 dr.findElement(by_clk).click();
	 }
	 public void do_sign_in(String id) {
		this.do_sign(id);
		this.clicl_next();
		
	 }
}
