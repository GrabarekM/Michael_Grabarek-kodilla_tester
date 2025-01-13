package com.kodilla.selenium.homework;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    private WebDriver driver;
    private StoreSearchPom storePom;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michael Grabarek\\Desktop\\Programing_stuff\\Projects\\kodilla-course\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new StoreSearchPom(driver);
    }

    @Test
    public void testSearchResults_Count() {
        assertEquals(2, storePom.search("NoteBook"));
        assertEquals(1, storePom.search("School"));
        assertEquals(1, storePom.search("Brand"));
        assertEquals(1, storePom.search("Bussines"));
        assertEquals(1, storePom.search("Gaming"));
        assertEquals(0, storePom.search("Powerful"));
    }

    @Test
    public void testSearchResults_IgnoresCase() {
        assertEquals(2, storePom.search("notebook"));
        assertEquals(2, storePom.search("NOTEBOOK"));
        assertEquals(1, storePom.search("School"));
        assertEquals(1, storePom.search("SCHOOL"));
        assertEquals(1, storePom.search("Brand"));
        assertEquals(1, storePom.search("BRAND"));
        assertEquals(1, storePom.search("Bussines"));
        assertEquals(1, storePom.search("BUSSINES"));
        assertEquals(1, storePom.search("Gaming"));
        assertEquals(1, storePom.search("GAMING"));
        assertEquals(0, storePom.search("Powerful"));
        assertEquals(0, storePom.search("POWERFUL"));
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
