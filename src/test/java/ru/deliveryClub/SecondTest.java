
package ru.deliveryClub;

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

public class SecondTest  {

    public FirefoxDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/Drivers/geckodriver.exe");
        driver = new FirefoxDriver(  );
    }




    @Test
    public void firstTest() {
        driver.manage().window().maximize();
        driver.get("http://www.personal-browser.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Personal Browser"));
        driver.findElement(By.xpath("html/body/div[3]/div/div[4]/div[1]/img"));





    }
    @Test
    public void firstTest3() {
        driver.manage().window().maximize();
        driver.get("http://www.personal-browser.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Personal Browser"));


    }




}