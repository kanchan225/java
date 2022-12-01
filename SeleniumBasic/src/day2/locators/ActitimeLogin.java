package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		//step1;open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //step2;enter app URL
        driver.get("https://demo.actitime.com/");
        //step3;enter username as admin
        /**locate username field from UI*/
        WebElement userNameInputField =driver.findElement(By.id("username")); //or
       // WebElement userNameInputField =driver.findElement(By.xpath("//*[@*='username']"));
        /** after identifying the WebElement we can perform following operation in it
		 * 	type input---->  sendKeys("")
		 *  click     ---->  click()
		 *  delete existing ----> clear()
		 * */
        userNameInputField.sendKeys("admin");
        //step4;enter password as manager
        /**Identify password field*/
       // WebElement password=driver.findElement(By.name("pwd")); //or
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        /**type password as manager*/
        password.sendKeys("manager");
        //driver.findElement(By.name("pwd")).sendKeys("manager");
        
        //step5;click on login button
        /**Identify login button and click on it*/
       // driver.findElement(By.id("loginButton")).click(); //or
       // driver.findElement(By.xpath("//a[div[contains(text(),'Login')] and @id='loginButton']")).click(); //or
        driver.findElement(By.xpath("//a[@*='loginButton']")).click();
        //step6:validate home page
        String expectedTitle="actiTIME - Enter Time-Track";
        String actualTitle = driver.getTitle();
        System.out.println("Expected Title is: "+expectedTitle);
        System.out.println("Actual Title is: "+actualTitle);
        //validation will be failed
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("Login validation is passed");
        }else {
        	System.out.println("Login validation is failed");
        }
        //identify logout link and click on it
        driver.findElement(By.id("logoutLink")).click();
	}
}
/**
Open chrome browser
Enter application URL
Enter usernams as admin
enter password as manager
click on login button
validation home page
click on logout button
validate login page
*/
