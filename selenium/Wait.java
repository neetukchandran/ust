package selinium_project;


	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class Wait {
	 
	 public static WebDriver driver;
	 
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	 
	  System.out.println("Launching the chrome driver  "); 
	  
	    
	  // Set the chrome driver exe file path
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ustjavasdetb425\\Desktop\\chrome\\chromedriver.exe");
	  // Instantiate the chrome driver
	  driver = new ChromeDriver();
	 
	  // wait time
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  // set the browser URL in get() to load the webpage
	     driver.get("https://skptricks.github.io/learncoding/selenium-demo/login%20registration%20page/Register.html"); 
	     
	     // locating an elements by its ID
	     driver.findElement(By.cssSelector("input#regUsername")).sendKeys("sumit");
	     driver.findElement(By.cssSelector("input#regEmail")).sendKeys("sumit@gmail.com");
	     driver.findElement(By.cssSelector("input#regPassword")).sendKeys("1234567890");
	 
	 }
	 
	}



