import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.OpenWindow;

public class BugHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String a="";

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            
            try {

                driver.get("http://automationpractice.com/index.php");
                driver.findElement(By.xpath("//ul[@id='homeslider']/li[2]/div/p[2]/button")).click();
                driver.get("https://www.prestashop.com/pt?utm_source=v16_homeslider");
		          System.out.println("O botão Shop now não foi pro shopping");  

			} catch (Exception e) {
				// TODO: handle exception

		          	
			}
            System.out.println(a);
          }


}
