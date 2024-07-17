package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_TestSteps {
	static WebDriver driver;
	
	@Given("user is on login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable dataTable) {
	    List<List<String>>list = dataTable.asLists() ;
	   String Uname = list.get(0).get(0);
	    System.out.println("Uname");
	    
	   String pass= list.get(0).get(1);
	   System.out.println("pass");
	   
	   driver.findElement(By.name("username")).sendKeys(Uname);
	   driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()= ' Login ']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
