import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.OpenWindow;

public class BugLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String a="";

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            
            try {

          driver.findElement(By.linkText("Home")).click();
          System.out.println("Não foi encontrado o botão Home");      
			} catch (Exception e) {
				// TODO: handle exception
		          System.out.println("Não foi encontrado o botão Home");  

		          	
			}
            System.out.println(a);
          }


}
