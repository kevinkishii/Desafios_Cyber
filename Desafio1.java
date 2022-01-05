package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Desafio1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Nome");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Sobrenome");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Endereço");
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Mail@email.com.br");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1133333333");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.id("checkbox2")).click();
		
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();
		
		Select habilidades = new Select(driver.findElement(By.id("Skills")));
		habilidades.selectByVisibleText("HTML");
		
		Select paises = new Select(driver.findElement(By.id("countries")));
		paises.selectByVisibleText("Select Country");
		
		Select pais = new Select(driver.findElement(By.id("country")));
		pais.selectByValue("Japan");
		
		Select ano = new Select(driver.findElement(By.id("yearbox")));
		ano.selectByVisibleText("1994");
		
		Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		mes.selectByVisibleText("August");
		
		Select dia = new Select(driver.findElement(By.id("daybox")));
		dia.selectByVisibleText("25");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Senha123");
		
		driver.findElement(By.id("secondpassword")).sendKeys("Senha123");
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
