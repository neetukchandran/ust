package selinium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {
	 

	               public static void main(String[] args) throws Exception {
       // set the geckodriver.exe property
       System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\ustjavasdetb425\\\\Desktop\\\\firefox/geckodriver.exe");
       // open firefox
       WebDriver driver = new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // open webpage
       driver.get("https://chercher.tech/practice/frames");
       //find the frame1 and store it in webelement
       WebElement frame1 = driver.findElement(By.id("frame1"));
       // switch to frame1
       driver.switchTo().frame(frame1);
       // find the frame 3
       WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
       // switch to frame 3
       driver.switchTo().frame(frame3);
      // find the checkbox
       WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
       // if checkbox is not selected then click the checkbox
       if(! checkbox.isSelected()){
                      checkbox.click();
	                               }
	               }
	}
	 



