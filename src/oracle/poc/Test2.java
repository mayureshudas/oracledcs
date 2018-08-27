package oracle.poc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://cloud.oracle.com/en_US/sign-in");
		 WebElement accountType=driver.findElement(By.xpath("//section[@id='ServicePage']//div[@class='signInPortletInfoContainer medium-9 large-10 columns']//select[@name='signInAccountType']"));
		 Select select =new Select(accountType);
		 select.selectByVisibleText("Traditional Cloud Account");
		 WebElement dataCenter=driver.findElement(By.xpath("//section[@id='ServicePage']//div[@class='signInPortletInfoContainer medium-9 large-10 columns']//select[@name='signInDataCenter']"));
		 Select select1 =new Select(dataCenter);
		 select1.selectByVisibleText("US Commercial 2 (us2)");
		 driver.findElement(By.xpath("//section[@id='ServicePage']//div[@class='portlet-contents-largeportlet']//div[@class='large-4 columns']//a[@class='signin-button small button radius text-center base-button-arrow b3']/span")).click();
		 //driver.get("https://login.us2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DMKoAhlkszLxsoNnbaYcA4KLKTylhg57cBlutFpq2f7Nv%2FOfplifXv4EKN19%2F%2BzoBCytSdwGdUtzfs9EyjE6GeVINP914ELOFDABRsmN8iwSGL0iQCgM7jmNz%2BW%2BZVQj9tPQfDJwd4dPwU3tbtNzC4QxbgrZUzoSfRcLSkkgYSrVlrZXVWnB8ehrh91XrKgm39LZTZNH9PT28jYu138Xak0twe5676c0d9ji9mXKBs94p%2FF19mKo9OkIonqe26DZ0w7aEXRc7blRrITPIfz7gRepzf4UwVI4BZsKo%2BvUdl%2Bvd%2F2Ay9AG%2Be9oPgAQNYdTcjWxmOm21n5pVA2RBHjcGo8wvQJEyzz4nF5Guxr7vlOHP%2BCtMBD4Xt2Im9yHr6KiA%20agentid%3DCloudPortalAgent%20ver%3D1%20crmethod%3D2");
		 driver.findElement(By.xpath("//form[@class='signin_form']//input[@class='textInput']")).sendKeys("eebv-test");
		 driver.findElement(By.xpath("//form[@class='signin_form']//button[@class='button']")).click();
		 driver.findElement(By.xpath("//form[@class='signin_form']/input[@name='username']")).sendKeys("rohan.srivastava@capgemini.com");
		 driver.findElement(By.xpath("//form[@class='signin_form']/input[@name='password']")).sendKeys("Selenium_test1");
		 driver.findElement(By.xpath("//form[@class='signin_form']/button[@class='button']")).click();
		 driver.get("https://java-eebv-test.java.us2.oraclecloudapps.com/LeaseApplication11g-ViewController-context-root/faces/LeaseDetails");
		 driver.findElement(By.xpath("//form[@class='x107']//table[@class='af_query_title-table1']//td[@class='xuo']/a")).click();
		 WebElement lessorId=driver.findElement(By.xpath("//form[@class='x107']//div[@class='x18l']//table[@class='x1a']//select[@id='qryId1:value10::content']"));
		 Select select2 =new Select(lessorId);
		 select2.selectByVisibleText("GE Plastics 1000");
		 WebElement paymentSchedule =driver.findElement(By.xpath("//form[@class='x107']//div[@class='x18l']//table[@class='x1a']//select[@id='qryId1:value50::content']"));
		 Select select3=new Select(paymentSchedule);
		 select3.selectByVisibleText("PS100");
		 driver.findElement(By.xpath("//form[@class='x107']//div[@class='xfq']//button[@id='qryId1::search']")).click();
	}

}
