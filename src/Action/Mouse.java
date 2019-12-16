package Action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mouse {
	static WebDriver driver;
	private static void screen(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc = new File("C:\\workspace\\Launch\\Screenshot");
		FileUtils.copyFile(src,desc);
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Launch\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		screen("fb.png");
		WebElement userId = driver.findElement(By.id("email"));
		userId.sendKeys("Swetha");
		screen("userId.png");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456789");
		screen("pass.png");
		WebElement loGin = driver.findElement(By.id("loginbutton"));
		loGin.click();
		screen("loGin.png");
	}
	}

