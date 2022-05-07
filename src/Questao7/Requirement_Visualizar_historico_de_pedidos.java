package Questao7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Requirement_Visualizar_historico_de_pedidos {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        

		WebDriver driver = new ChromeDriver();	   
        try {

    		driver.get("http://automationpractice.com/index.php");
    	    driver.findElement(By.linkText("Sign in")).click();
    	    driver.findElement(By.id("email")).click();
    	    driver.findElement(By.id("email")).clear();
    	    driver.findElement(By.id("email")).sendKeys("ngsneto@gmail.com");
    	    driver.findElement(By.id("passwd")).clear();
    	    driver.findElement(By.id("passwd")).sendKeys("Silvinha1");
    	    driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
    	    driver.findElement(By.linkText("My orders")).click();
    	    driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[5]/td[7]/a/span")).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("impossível visualizar o seu históricos de pedidos");
		}
	  }
	}


