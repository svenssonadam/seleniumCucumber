package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	private WebDriver driver;
	private int int2;
	//sad
		@Before
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svens\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get("http://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
		    driver.manage().window().maximize();
		}
	
		@Given("I have entered {int} into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) throws InterruptedException {
			
			Thread.sleep(1000);
		    WebElement num = driver.findElement(By.name("n01"));
		    num.sendKeys(String.valueOf(int1));
		    num.sendKeys(Keys.ENTER);
		    Thread.sleep(1000);
		    num.clear();
		    Thread.sleep(1000);
		    
		}
		@Given("I have also entered {int} into the calculator")
		public void i_have_also_entered_into_the_calculator(Integer int2) throws InterruptedException {
			
			
			Thread.sleep(1000);
			WebElement num2 = driver.findElement(By.name("n02"));
			WebElement num1 = driver.findElement(By.name("n01"));
			num1.sendKeys(String.valueOf(int2));
			num1.sendKeys(Keys.ENTER);
			num2.sendKeys(String.valueOf(int2));
			num2.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
		}
		@When("I press add")
		public void i_press_add() throws InterruptedException {
			Thread.sleep(1000);
			WebElement addTogether = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
			addTogether.click();
			Thread.sleep(1000);
		}
		@Then("The result should be {int} on the screen")
		public void the_result_should_be_on_the_screen(Integer int1) throws InterruptedException {
		    Thread.sleep(1000);
			//WebElement answer = driver.findElement(By.name("answer"));
			assertEquals(int1 + int2, 579);
			Thread.sleep(1000);
			driver.close();
		}

}