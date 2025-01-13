package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPomHomework {
    protected WebDriver driver;

    public AbstractPomHomework(WebDriver driver) {
        this.driver = driver;
    }
}