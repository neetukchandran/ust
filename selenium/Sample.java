package selinium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb425\\Desktop\\chrome\\chromedriver.exe")
;
		WebDriver d= new ChromeDriver();
		d.navigate().to("http://www.google.com/");
		}

}
