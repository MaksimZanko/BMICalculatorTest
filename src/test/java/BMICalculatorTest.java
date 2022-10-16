import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest {

    @Test
    public void normalCtegory() {
        //Click Calculate
        //Validate category
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("cage")).sendKeys("30");
        driver.findElement(By.name("cheightmeter")).sendKeys("180");
        driver.findElement(By.name("ckg")).sendKeys("82");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        driver.quit();


    }
}
