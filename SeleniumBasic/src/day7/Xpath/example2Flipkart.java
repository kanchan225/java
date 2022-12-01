package day7.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2Flipkart {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// explicit wait(static wait)
	Thread.sleep(2000);
	// maximize browser window
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    //xpath for samsung TV price
    WebElement phoneprice =driver.findElement(By.xpath("//div[div[div[@class='_4rR01T']]]/div[2]/div/div/div[1]"));
    System.out.println(phoneprice);                     //div[div[div[text()='SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV with 2022 Model']]]/div[2]/div/div[1]/div
	}
}