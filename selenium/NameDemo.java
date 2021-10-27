package selinium_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb425\\Desktop\\chrome\\chromedriver.exe")
		;
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/ajax.html");
		
		//find the radio button for "NO" using its ID and click on it
		d.findElement(By.id("no")).click();
		//click on check button
		d.findElement(By.id("buttoncheck")).click();

	}

}
