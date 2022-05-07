import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BugMedium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Falha! Não exibiu a mensagem : Cadastro realizado com sucesso! ";

		//este teste é moderado, pois, quando realiza o cadastro de um usuário
		//não aparece a mensagem de usuário cadastrado com sucesso.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         try {

             driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
             driver.findElement(By.id("email_create")).clear();
             driver.findElement(By.id("email_create")).sendKeys("natanaelgs@hotmail.com");
             driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
             driver.findElement(By.xpath("//form[@id='account-creation_form']/div/div/div/label")).click();
             driver.findElement(By.id("customer_firstname")).click();
             driver.findElement(By.id("customer_firstname")).clear();
             driver.findElement(By.id("customer_firstname")).sendKeys("NATANAEL");
             driver.findElement(By.id("customer_lastname")).clear();
             driver.findElement(By.id("customer_lastname")).sendKeys("NETO");
             driver.findElement(By.id("passwd")).click();
             driver.findElement(By.xpath("//div[@id='noSlide']/h1")).click();
             driver.findElement(By.id("passwd")).click();
             driver.findElement(By.id("passwd")).clear();
             driver.findElement(By.id("passwd")).sendKeys("Silvinha1");
             driver.findElement(By.xpath("//div[@id='page']/div[2]")).click();
             driver.findElement(By.id("days")).click();
             new Select(driver.findElement(By.id("days"))).selectByVisibleText("regexp:13\\s+");
             driver.findElement(By.id("months")).click();
             new Select(driver.findElement(By.id("months"))).selectByVisibleText("regexp:May\\s");
             driver.findElement(By.id("years")).click();
             new Select(driver.findElement(By.id("years"))).selectByVisibleText("regexp:2006\\s+");
             driver.findElement(By.id("company")).click();
             driver.findElement(By.id("company")).clear();
             driver.findElement(By.id("company")).sendKeys("kamaleon");
             driver.findElement(By.id("address1")).click();
             driver.findElement(By.id("address1")).click();
             driver.findElement(By.id("address1")).clear();
             driver.findElement(By.id("address1")).sendKeys("Rua Elias Cavalcante de Albuquerque,295");
             driver.findElement(By.id("firstname")).clear();
             driver.findElement(By.id("firstname")).sendKeys("Natanael Guedes da");
             driver.findElement(By.id("lastname")).clear();
             driver.findElement(By.id("lastname")).sendKeys("Neto");
             driver.findElement(By.id("address2")).clear();
             driver.findElement(By.id("address2")).sendKeys("295");
             driver.findElement(By.id("city")).clear();
             driver.findElement(By.id("city")).sendKeys("Joao Pessoa");
             driver.findElement(By.id("postcode")).clear();
             driver.findElement(By.id("postcode")).sendKeys("58070-400");
             driver.findElement(By.id("id_state")).click();
             new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Florida");
             driver.findElement(By.id("other")).click();
             driver.findElement(By.id("other")).clear();
             driver.findElement(By.id("other")).sendKeys("perto do lava jato");
             driver.findElement(By.id("phone_mobile")).click();
             driver.findElement(By.id("alias")).click();
             driver.findElement(By.id("alias")).clear();
             driver.findElement(By.id("alias")).sendKeys("Rua dos milagres");
             driver.findElement(By.id("phone_mobile")).click();
             driver.findElement(By.id("phone_mobile")).clear();
             driver.findElement(By.id("phone_mobile")).sendKeys("83987080608");
             driver.findElement(By.id("phone")).clear();
             driver.findElement(By.id("phone")).sendKeys("83987080608");
             driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
             driver.get("http://automationpractice.com/index.php?controller=authentication");
             driver.findElement(By.id("postcode")).click();
             driver.findElement(By.id("postcode")).click();
             driver.findElement(By.id("postcode")).clear();
             driver.findElement(By.id("postcode")).sendKeys("5807000");
             driver.findElement(By.xpath("//div[@id='page']/div[2]")).click();
             driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
             driver.findElement(By.id("postcode")).click();
             driver.findElement(By.id("postcode")).clear();
             driver.findElement(By.id("postcode")).sendKeys("580700");
             driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
             driver.findElement(By.id("passwd")).click();
             driver.findElement(By.id("passwd")).clear();
             driver.findElement(By.id("passwd")).sendKeys("Silvinha3");
             driver.findElement(By.xpath("//div[@id='page']/div[2]")).click();
             driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
             driver.findElement(By.id("postcode")).click();
             driver.findElement(By.id("postcode")).clear();
             driver.findElement(By.id("postcode")).sendKeys("58070");
             driver.findElement(By.xpath("//form[@id='account-creation_form']/div/div[5]")).click();
             driver.findElement(By.id("passwd")).click();
             driver.findElement(By.id("passwd")).clear();
             driver.findElement(By.id("passwd")).sendKeys("Silvinha1");
             driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
             driver.get("http://automationpractice.com/index.php?controller=my-account");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(a);
		}
	}

}
