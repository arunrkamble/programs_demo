package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lamda_locator extends Base_class {

	public WebElement name;
	public WebElement Email;
	public WebElement Pass;
	public WebElement c_code;
	public WebElement Phone;
	public WebElement sign_up;
	public Object login_data[][]=new Object[5][4];
	
	public void locator() throws IOException
	{   
		Launch();
		name=driver.findElement(By.id("name"));
		
		Email=driver.findElement(By.id("email"));
		
		Pass=driver.findElement(By.xpath("//*[@id=\"userpassword\"]"));
		
		Phone=driver.findElement(By.id("phone"));
		
		c_code=driver.findElement(By.xpath("//*[@id=\"country_code\"]"));
		
		sign_up=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button"));
	}
	

	public void Test_data() throws IOException
	{
		File f=new File("C:\\Users\\Admin\\Desktop\\Selenium session\\Test_cases.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xlsx=new XSSFWorkbook(fi);
		XSSFSheet sheet=xlsx.getSheet("T_data");
		 int n=sheet.getLastRowNum();
		 for(int i=0;i<n;i++)
		 { 
			 for(int j=0;j<4;j++)
			 {
				 login_data[i][j]=new DataFormatter().formatCellValue(sheet.getRow(i+1).getCell(j));
					
			 }
		 }
	}

	
}
