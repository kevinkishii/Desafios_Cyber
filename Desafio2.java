package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Desafio2 {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
	
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Aqui estou!");
	
	}
}