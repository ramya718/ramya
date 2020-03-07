package TEST;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BASIC_CLASSES.Utilities;
import EXCEL_UTILITY.excel_io_arr;
import PAGES.Home_page;
import PAGES.Login_page;
import PAGES.Sign_in_page;

public class Testng_chrome extends excel_io_arr {
	WebDriver dr;
	Login_page lp;
	Sign_in_page sp;
	Home_page hp;
	String url="https://be.cognizant.com/";
Utilities ut;
  @BeforeClass
  public void launch_chrome() {
	  get_Test_data();
	  ut=new Utilities();
	  dr=ut.launch_browser("CHROME",url);
  }
 
@Test(dataProvider="data")
  public void test(String id,String uid1,String pwd) {
	System.out.println("in test");
    lp=new Login_page(dr);
	 sp=new Sign_in_page(dr);
	 hp=new Home_page(dr);
	 String uid=uid1.substring(1,7);
	 System.out.println("userid: "+uid);
	  sp.do_sign_in(id);
	  lp.do_login(uid,pwd);
	 String act_res=  hp.get_uid();
	 String ex_res="Saravana, S (Cognizant)";
	 System.out.println("in act_res :"+act_res);
	 SoftAssert sa=new SoftAssert();
	 sa.assertEquals(act_res, ex_res);
	 sa.assertAll();
	 
	 }
@DataProvider(name="data")
public String[][] provide_data()
{
	return testdata;
}
}