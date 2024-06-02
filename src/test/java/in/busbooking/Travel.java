package in.busbooking;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
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
		WebElement g=driver.findElement(By.xpath("//span[text()='2' and contains(@class,'fgdqFw')]"));
		g.click();
			
	}
	@Test
	public void test5() {
		WebElement k=driver.findElement(By.xpath("//button[@id=\"search_button\"]"));
		k.click();
	}
	@Test
	public void test6() {
		WebElement q=driver.findElement(By.xpath("//div[text()='MBT TRAVELS']"));
		String vb=q.getText();
		System.out.print(vb);
		WebElement hj=driver.findElement(By.xpath("//div[text()='23:35']"));
		String nm=hj.getText();
		System.out.print(nm);
		WebElement a=driver.findElement(By.xpath("//div[text()='05:35']"));
		String x=a.getText();
		System.out.print(x);
		WebElement zq=driver.findElement(By.xpath("//span[text()='650']"));
		String we=zq.getText();
		System.out.print(we);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
