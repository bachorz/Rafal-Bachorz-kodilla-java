package com.kodilla.testing2.facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_MONTH  = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_YEAR  = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[3]";
    public static final String XPATH_WAIT_FOR = "//select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard = new Select(selectComboDay);
        selectBoard.selectByIndex(28);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(9);

        WebElement selectComboyYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear = new Select(selectComboyYear);
        selectBoardYear.selectByValue("1977");
    }
}
