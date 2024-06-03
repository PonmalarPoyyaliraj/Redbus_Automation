package in.busbooking;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusbooking {
	
		public static WebDriver driver;
		@BeforeClass
		public static void method1(){
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("disable-notifications");
			options.addArguments("disable-popups");
			options.addArguments("start-maximized");
			driver = new EdgeDriver(options);
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		@Test
		public void method2() {
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//text[text()='Chennai']")).click();
		}
		@Test
		public void method3() {
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Trichy");
		driver.findElement(By.xpath("//text[text()='Trichy']")).click();
			}
		@Test
		public void method4() {
		driver.findElement(By.xpath("//span[text()='3' and contains(@class,'fgdqFw')]")).click();
			}
		@Ignore
		@Test
		public void method5() {
			driver.quit();
		}
		@Test
		public void method6() {
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		}
			@Test
			public void method7() {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				List<WebElement> l= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
				List<WebElement> o = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
				List<WebElement> v = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
				List<WebElement> e = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
				for (int i = 0; i < l.size(); i++) {
					if (i == l.size()-1) {
						JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollTo(0,document.body.scrollHeight)",l.get(i));
				    l=driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
					o=driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
					v=driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
					e=driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
					}else {
					String m = l.get(i).getText();
					String a = o.get(i).getText();
					String lq = v.get(i).getText();
					String r = e.get(i).getText();
					System.out.println("Bus Name: "+m+"Departure Time: "+a+"Arrival Time: "+lq+"Fare rate: "+r);
					}
			}
			}
				
				}	












