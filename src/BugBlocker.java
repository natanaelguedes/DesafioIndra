import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.OpenWindow;

public class BugBlocker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String a="O botão GET SAVINGS NOW NÃO LEVA O USUÁRIO A  LUGAR NENHUM";


                try {


                driver.get("http://automationpractice.com/index.php");
                driver.findElement(By.xpath("//img[contains(@src,'http://automationpractice.com/modules/blockbanner/img/sale70.png')]")).click();
//                }
                System.out.println(a);
              //  System.out.println(a);
           //     driver.findElement(By.xpath("//img[contains(@src,'http://automationpractice.com/modules/blockbanner/img/sale70.png')]")).click();
            } 
                catch (Exception e) {
				// TODO: handle exception
		          System.out.println(a );  

		          	
			}
         System.out.println(a);
 //^//         }
	//}
}

}