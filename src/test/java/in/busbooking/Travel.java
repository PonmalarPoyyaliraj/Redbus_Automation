package in.busbooking;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Travel {
	public static WebDriver driver;
	@Test
	public void test1() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver =new EdgeDriver(options);
		driver.get("https:www.redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void test2() {
		String fromplace="chennai";
		WebElement w=driver.findElement(By.id("src"));
		w.sendKeys(fromplace);
		WebElement c=driver.findElement(By.xpath("//text[text()='Chennai']"));
		c.click();	
	}
	@Test
	public void test3() {
		String toplace="Trichy";
		WebElement v=driver.findElement(By.id("dest"));
		v.sendKeys(toplace);
		WebElement x=driver.findElement(By.xpath("//text[text()='Trichy']"));
		x.click();
	}
	@Test
	public void test4() {
		WebElement g=driver.findElement(By.xpath("//span[text()='3' and contains(@class,'fgdqFw')]"));
		g.click();
			
	}
	@Test
	public void test5() {
		WebElement k=driver.findElement(By.xpath("//button[@id=\"search_button\"]"));
		k.click();
	}
	@Test
	public void test6() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> gt=driver.findElements(By.xpath("//div[@class='bus-type f-12 m-top-16 l-color evBus']"));
		
		List<WebElement> gg=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
		System.out.println(gg);
		List<WebElement> gh=driver.findElements(By.xpath("//div[@class='dur l-color lh-24']"));
		System.out.println(gh);
		
		
		

				}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
