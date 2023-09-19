package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class ProjectFlight {
	public static void main(String[] args) throws InterruptedException
	{
	//public ChromeDriver driver;
	
	
	//@BeforeMethod

		//public void preCondition(){
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.cheapoair.com");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Thread.sleep(7000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-close-icon']")));
			
			driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
			
			driver.findElement(By.xpath("//span[@class='cross-icon']")).click();
			
			driver.findElement(By.xpath("//label[@for='onewayTrip']")).click();
			
			driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[1]")).click();
			
			driver.findElement(By.id("from0")).sendKeys("chennai",Keys.ENTER);
			
			driver.findElement(By.id("to0")).sendKeys("bangalore",Keys.ENTER);
			
			driver.findElement(By.id("cal0")).click();
			
			driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();
			
			
			int temp = (Math.random() <= 0.5) ? 1 : 2;
			
			if (temp == 2) {
			
				driver.findElement(By.id("travellerButton")).click();
				
				driver.findElement(By.id("addadults")).click();
			}
			driver.findElement(By.id("searchNow")).click();
			
			driver.findElement(By.xpath("//button[text()='See Flights Only']")).click();
			
			driver.findElement(By.xpath("//a//span[text()='Cheapest']")).click();
			Thread.sleep(3000);

			List<WebElement> prices = driver.findElements(By.xpath("//span[@class='currency ']"));
			
			System.out.println("Sorted Prices");
			
			for (WebElement e : prices)
			
				System.out.println(e.getAttribute("title"));
			
			
			
			
			
}
}