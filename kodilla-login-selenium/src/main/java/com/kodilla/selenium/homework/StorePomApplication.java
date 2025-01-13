package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StorePomApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        StoreSearchPom storePom = new StoreSearchPom(driver);
        int resultCount = storePom.search("Gaming");
        System.out.println("Number of results for 'Gaming': " + resultCount);

        driver.close();
    }
}
