package day1.openBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        WebElement usernameField=driver.findElement(By.id("username"));
        usernameField.clear();
        usernameField.sendKeys("admin");
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys("Test@123");
        
       driver.findElement(By.className("buttonBlue")).click();
       
       WebDriverWait wait=new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutlink")));
       //or
       wait.until(ExpectedConditions.titleIs("Cruscotto"));
       
       String expectedTitle="Cruscotto";
       String actualtitle=driver.getTitle();
       String actualUrl=driver.getCurrentUrl();
       System.out.println(actualtitle);
       System.out.println(actualUrl);
       System.out.println(expectedTitle.equals(actualtitle));
       Thread.sleep(2000);
       driver.manage().window().maximize();
       driver.manage().window().setSize(new Dimension (800, 500));
       driver.navigate().forward();
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().to("www.google.com");
        
        //driver.close();
	}
	

}
