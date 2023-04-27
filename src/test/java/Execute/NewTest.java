package Execute;

import org.testng.annotations.Test;

import Programs.Lamda_locator;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest  {
	Lamda_locator obj=new Lamda_locator();
  @Test(dataProvider = "DP")
  public void f(String  n, String e,String p,String ph) {
	  
	  obj.name.sendKeys(n);
	  obj.Email.sendKeys(e);
	  obj.Pass.sendKeys(p);
	  obj.Phone.sendKeys(ph);
	  obj.sign_up.click();
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	
	  obj.locator();
	}

  @AfterMethod
  public void afterMethod() {
	  obj.driver.quit();
	 
  }


  @DataProvider(name="DP")
  public Object[][] dp() throws IOException {
   obj.Test_data();
   Object data[][]=obj.login_data;
   return data;
    }
  
 


}
