package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
//print the mobile name and price inthe console from demoblaze.com
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> phone=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h4>a"));
		List<WebElement> price=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h5"));
		
		for(int i=0;i<phone.size();i++) {
			System.out.println("Mobile name: "+phone.get(i).getText()+" ---> price : "+price.get(i).getText());
		}
	}

}
