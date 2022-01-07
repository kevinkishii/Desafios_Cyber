package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		WebElement local1 = driver.findElement(By.id("datepicker1"));
		
		WebElement local2 = driver.findElement(By.id("datepicker2"));
		String data = "08/25/1994";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"');", local1);
		
		js.executeScript("arguments[0].setAttribute('value','"+data+"');", local2);
	}	
	
}
