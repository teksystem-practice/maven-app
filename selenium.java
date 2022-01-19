package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class example {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hi , welcome");
		example eobj = new example();
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		eobj.testcase1();
		eobj.testcase2();
	}
	public void testcase1() throws InterruptedException{
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
	    WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(100);
		if(driver.getPageSource().contains("I'm Feeling Lucky")) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
	}
	public void testcase2() throws InterruptedException{
//		WebDriver driver=new FirefoxDriver();
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
	    WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(100);
		if(driver.getPageSource().contains("I'm Feeling Lucky")) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
	}

}
