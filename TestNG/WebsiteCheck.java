package testNGPackage;

import org.testng.annotations.Test;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class WebsiteCheck {
		WebDriver d;
		@BeforeTest
		public void checkWebsite() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb425\\Desktop\\chrome/chromedriver.exe");
	d=new ChromeDriver();
	d.navigate().to("https://www.google.com/");
	}
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("kollam");
	  
	  //d.findElement(By.name("btnI")).submit();
  }
}

