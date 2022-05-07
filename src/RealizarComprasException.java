
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RealizarComprasException extends Exception{

	/**
	 * 
	 */
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String a="";

            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            
            try {
                 a="Não pode acessar essa página , pois você não está logado no nosso sistema";

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("teste");
			}
            System.out.println(a);
          }

	}
 

