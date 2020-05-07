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

public class OcioTestTest {
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
  public void ocioTest() {
    driver.get("http://localhost:8080/ISST-20-Conc/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.name("dni")).click();
    driver.findElement(By.name("dni")).sendKeys("root");
    driver.findElement(By.name("room")).click();
    driver.findElement(By.name("room")).sendKeys("root");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Fernando");
    driver.findElement(By.name("dni")).click();
    driver.findElement(By.name("dni")).sendKeys("1234");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("p");
    driver.findElement(By.name("tlf")).click();
    driver.findElement(By.name("tlf")).sendKeys("645");
    driver.findElement(By.name("room")).click();
    driver.findElement(By.name("room")).sendKeys("55");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.cssSelector(".botonRegistrar")).click();
    driver.findElement(By.cssSelector(".button")).click();
    driver.findElement(By.cssSelector(".button")).click();
    driver.findElement(By.name("dni")).click();
    driver.findElement(By.name("dni")).sendKeys("1234");
    driver.findElement(By.name("room")).click();
    driver.findElement(By.name("room")).sendKeys("55");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.cssSelector(".ocio img")).click();
    driver.findElement(By.name("actividad")).click();
    {
      WebElement dropdown = driver.findElement(By.name("actividad"));
      dropdown.findElement(By.xpath("//option[. = 'Entradas para espectaculo']")).click();
    }
    driver.findElement(By.name("actividad")).click();
    driver.findElement(By.name("fecha")).click();
    driver.findElement(By.name("fecha")).sendKeys("Hoy por la tarde");
    driver.findElement(By.name("precio")).click();
    driver.findElement(By.name("precio")).sendKeys("70 euros");
    driver.findElement(By.name("addComents")).click();
    driver.findElement(By.name("addComents")).sendKeys("que sea al aire libre");
    driver.findElement(By.cssSelector(".botonRegistro")).click();
    driver.findElement(By.cssSelector(".atras img")).click();
    driver.findElement(By.cssSelector(".ocio img")).click();
    driver.findElement(By.name("actividad")).click();
    {
      WebElement dropdown = driver.findElement(By.name("actividad"));
      dropdown.findElement(By.xpath("//option[. = 'Reserva de restaurante']")).click();
    }
    driver.findElement(By.name("actividad")).click();
    driver.findElement(By.name("fecha")).click();
    driver.findElement(By.name("fecha")).sendKeys("mañana por la tarde");
    driver.findElement(By.name("precio")).click();
    driver.findElement(By.name("precio")).sendKeys("50 euros");
    driver.findElement(By.name("addComents")).click();
    driver.findElement(By.name("addComents")).sendKeys("Que tenga terraza");
    driver.findElement(By.cssSelector(".botonRegistro")).click();
    driver.findElement(By.cssSelector(".atras img")).click();
    driver.findElement(By.cssSelector(".ocio img")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .cancOcio")).click();
    driver.findElement(By.cssSelector(".atras img")).click();
    driver.findElement(By.cssSelector(".ocio img")).click();
    driver.findElement(By.cssSelector(".cancOio")).click();
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("fecha")).sendKeys("el lunes para comer");
    driver.findElement(By.name("addComents")).click();
    driver.findElement(By.cssSelector(".botonRegistro")).click();
    driver.findElement(By.cssSelector("img")).click();
    driver.findElement(By.cssSelector(".button")).click();
  }
}