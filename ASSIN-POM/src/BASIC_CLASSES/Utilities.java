package BASIC_CLASSES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EXCEL_UTILITY.excel_io_arr;

public class Utilities extends excel_io_arr{
 static	WebDriver dr;
 public static  WebDriver launch_browser(String browser,String url) {
	 if(browser.contains("CHROME"))
	 {
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		 dr=new ChromeDriver();
	 }
	 else if(browser.contains("FIREFOX"))
	 {
		 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		 dr=new ChromeDriver();
	 }
	 dr.get(url);
	 dr.manage().window().maximize();
	 dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return dr;
}

}
