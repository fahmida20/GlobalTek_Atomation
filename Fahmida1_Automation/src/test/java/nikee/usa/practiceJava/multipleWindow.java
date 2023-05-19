package nikee.usa.practiceJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class multipleWindow {
	// How to handle multiple window?
	
	@Test                           // TestNg annotation instead of main method i can run 
	public static void getMultipleWindow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {                      //ignore main window
			String childWin = it.next();     //count window                             
		   if(!mainWindow.equalsIgnoreCase(childWin)) {
			   driver.switchTo().window(childWin);
			   WebElement text = driver.findElement(By.id("sampleHeading"));
			   System.out.println("Heading of childwindow :"+ text.getText());
			   driver.close();
		   }
		}
		driver.switchTo().window(mainWindow);
		driver.close();
		
		
	}
}
