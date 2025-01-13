package com.kodilla.selenium.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class StoreSearchPom extends AbstractPomHomework {

    @FindBy(css = "input[type='text']")
    WebElement searchField;

    @FindBy(xpath = "//*[contains(@class, 'element-img')]")
    List<WebElement> searchResults;

    public StoreSearchPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int search(String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword);
        return searchResults.size();
    }
}