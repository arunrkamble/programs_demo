package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public WebDriver driver;
	Properties prop=new Properties();
	public void Launch() throws IOException
	{
		File fi=new File("C:\\Users\\Admin\\Desktop\\Selenium session\\Programs\\Configuration\\Lamda.properties");
		FileInputStream fis=new FileInputStream(fi);
		prop.load(fis);
		if(prop.getProperty("Browser").equalsIgnoreCase("Chrome"))
		{   
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(option);
		}
		else if(prop.getProperty("Browser").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gceko.driver","C:\\Users\\Admin\\Desktop\\Selenium SetUp\\geckodriver.exe");
	       driver=new FirefoxDriver();
		}
		else 
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Desktop\\Selenium SetUp\\msedgedriver.exe");
	        driver=new EdgeDriver();
		}
		 driver.get(prop.getProperty("Url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	}
	


