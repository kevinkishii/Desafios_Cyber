package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Desafio4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Slider.html");
		
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"slider\"]/a")), 198 , 0).perform();
		
	}
}
