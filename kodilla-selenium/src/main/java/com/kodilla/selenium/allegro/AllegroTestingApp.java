package com.kodilla.selenium.allegro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

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

        WebElement searchField = driver.findElement(By.cssSelector("input#gh-ac"));
        searchField.sendKeys("Play Station 5");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#rtm_html_278")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("#srp-river-results"));

        for (WebElement productCard : productCards) {
            System.out.println(productCard.getText());
        }

    }
}
