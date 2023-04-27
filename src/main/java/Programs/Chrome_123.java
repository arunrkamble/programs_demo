package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drfiver","C:\\Users\\Admin\\Desktop\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://18.220.83.181/");

	}

}
