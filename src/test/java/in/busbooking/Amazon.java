package in.busbooking;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main (String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement drop=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
	drop.click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	File f1=new File("C:\\Users\\balap\\eclipse-workspace\\browser\\code\\target\\screenshots.png");
	FileUtils.copyFile(f, f1);
	Select s=new Select(drop);
	s.selectByVisibleText("Electronics");
	WebElement qz = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Actions a = new Actions(driver);
	a.sendKeys(qz, "Mobile").perform();
	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);

	    WebElement dn = driver.findElement(By.xpath("//a[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dn);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[30]")).click();
		String sp = driver.getWindowHandle();
		Set<String> ao = driver.getWindowHandles();
		for(String x : ao) {
			if(!x.equals(sp)) {
				driver.switchTo().window(x);	
			}
		}
		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();

	
	
    
   
    
    

}

}
