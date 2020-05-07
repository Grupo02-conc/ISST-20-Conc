// Generated by Selenium IDE
package test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestTransportTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Fernando\\Deskop\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testTransportTest() {
    driver.get("http://localhost:8080/ISST-20-Conc/");
    driver.manage().window().setSize(new Dimension(697, 728));
    driver.findElement(By.name("dni")).click();
    driver.findElement(By.name("dni")).click();
    driver.findElement(By.name("dni")).sendKeys("d1");
    driver.findElement(By.cssSelector("div:nth-child(2)")).click();
    driver.findElement(By.name("room")).click();
    driver.findElement(By.name("room")).sendKeys("h1");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.cssSelector(".transporte img")).click();
    driver.findElement(By.name("type")).click();
    {
      WebElement dropdown = driver.findElement(By.name("type"));
      dropdown.findElement(By.xpath("//option[. = 'Helicoptero']")).click();
    }
    driver.findElement(By.name("type")).click();
    driver.findElement(By.name("date")).click();
    driver.findElement(By.name("date")).sendKeys("2020-05-06");
    driver.findElement(By.name("destination")).click();
    driver.findElement(By.name("destination")).sendKeys("Madrid");
    driver.findElement(By.name("addComments")).click();
    driver.findElement(By.name("addComments")).sendKeys("Pasar por el Bernabeu");
    driver.findElement(By.cssSelector(".botonSolicitud")).click();
    driver.findElement(By.cssSelector(".atras img")).click();
    driver.findElement(By.cssSelector(".transporte img")).click();
  }
}
