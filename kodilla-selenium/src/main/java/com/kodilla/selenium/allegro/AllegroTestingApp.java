package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium-drivers/Chrome/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.com/");

        WebElement categoryDropdown = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Select selectCategory = new Select(categoryDropdown);
        selectCategory.selectByVisibleText("Video Games & Consoles");

        WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
        searchField.sendKeys("Play Station 5");


        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        searchButton.click();

    }
}
