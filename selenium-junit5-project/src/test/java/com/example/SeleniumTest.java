package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SeleniumTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        // Selenium 4.6以降では、ChromeDriverManagerなどの外部ライブラリは通常不要です
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void testGoogleSearch() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        // JUnit 5のアサーションを使用
        assertTrue(title.contains("Google"), "ページのタイトルに'Google'が含まれていません");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
