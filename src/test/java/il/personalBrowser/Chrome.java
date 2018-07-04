package il.personalBrowser;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class

 Chrome {

    public ChromeDriver driver;

@Before
public void setUp(){
    System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
    driver = new ChromeDriver();
}




    @Test
    public void firstTest() {
        driver.get("http://www.personal-browser.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Personal Browser"));
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"q\"]"));
        searchField.clear();
        searchField.sendKeys("hotels");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"sBtn\"]"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton.click();




    }

    @Test
    public void firstTest2() {
        driver.get("http://www.personal-browser.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Personal Browser"));
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"q\"]"));
        searchField.clear();
        searchField.sendKeys("hotels");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"sBtn\"]"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton.click();




    }
    @Test
    public void firstTest3() {
        driver.get("http://www.personal-browser.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Personal Browser"));
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"q\"]"));
        searchField.clear();
        searchField.sendKeys("hotels");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"sBtn\"]"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton.click();




    }





}