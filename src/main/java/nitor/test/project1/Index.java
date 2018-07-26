package nitor.test.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index {
public static void main(String[] args) throws Exception  {
	//System.out.println("Hello Archana");
	System.setProperty("webdriver.chrome.driver", "D:\\NIT_Project\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    String baseUrl = "https://www.google.com";
		    String pageTitle = "";
		    String expectedTitle = "Google";
		    driver.get(baseUrl);
		    pageTitle = driver.getTitle();
		    if(pageTitle.equals(expectedTitle)){
		      System.out.println("Hello Archan! Result is as expected.");
		    }else{
		      System.out.println("Hello Archana! Assertion failed!");
		    }
		    Thread.sleep(10000);
		    driver.quit();
		  }
}
