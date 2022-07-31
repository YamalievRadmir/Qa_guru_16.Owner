
import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testOzon() {

        String title = driver.getTitle();
        WebElement searchbar = driver.findElement(By.className("ga8a"));
        searchbar.sendKeys("Пылесос");
        searchbar.submit();
        Assertions.assertEquals("OZON — интернет-магазин. Миллионы товаров по выгодным ценам", title);


    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
