package rahul;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshout_pra {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:/akash/ACE3/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Driver.manage().window().maximize();
		File fr=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		File f=new File("C:/Users/USER/Desktop/New Bitmap Image.bmp");
		FileHandler.copy(fr, f);
	}

}
