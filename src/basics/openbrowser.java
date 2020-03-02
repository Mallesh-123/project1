package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
    WebElement stb = driver.findElement(By.xpath("//input[@name='q']"));
    stb.sendKeys("aditya dollin");
    driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
     
	}

}