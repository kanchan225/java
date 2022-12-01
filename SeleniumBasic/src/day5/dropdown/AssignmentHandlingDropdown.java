package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentHandlingDropdown {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
        //identify dropdown list year of Date of birth
        WebElement yearDropdown=driver.findElement(By.id("yearbox"));
        //create instance of select class and pass above element into its constructor
        Select selectYear=new Select(yearDropdown);
        //check whether dropdown is multiselect dropdown or not
        System.out.println("Is dropdown allowing to select multiple options : "+selectYear.isMultiple());
	    // get default or already selected option
        System.out.println("Already selected option name : "+selectYear.getFirstSelectedOption().getText());
      //get option count
        List<WebElement> options=selectYear.getOptions();
        System.out.println("Option count is: "+options.size());
        //get dropdown options name
        for(int i=0; i<options.size(); i++) {
        	System.out.println("option "+i+" : "+options.get(i).getText());
        }
        	 //select options from dropdown
           selectYear.selectByIndex(4);
            System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());
            selectYear.selectByValue("1920");
            System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());
            selectYear.selectByVisibleText("2015");
            System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());
            
	
	}

}
