import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	/*	driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String ParentId=it.next();
		String childID=it.next();

		driver.switchTo().window(childID); */
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
	//	WebElement Source= driver.findElement(By.id("draggable"));
	//	WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		String name=driver.findElement(By.id("content")).getText();
		System.out.println(name);
		//a.dragAndDrop(Source, target).build().perform();
	}

}
