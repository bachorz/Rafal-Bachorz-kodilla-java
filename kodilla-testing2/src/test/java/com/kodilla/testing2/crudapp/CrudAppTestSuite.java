package com.kodilla.testing2.crudapp;

import config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://bachorz.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest(){
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {

        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(5000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

    //    WebDriverWait wait = new WebDriverWait(driver, 6);
      //  wait.until(ExpectedConditions.alertIsPresent());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();

                });

        Thread.sleep(6000);
        driver.switchTo()
                .alert()
                .accept();
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("rbachorz");
        driverTrello.findElement(By.id("password")).sendKeys("Kodilla666");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        driverTrello.findElements(By.xpath("//div[@class=\"board-tile-details is-badged\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(5000);

        result = driverTrello.findElements(By.xpath("//span[@class= \"list-card-title js-card-name\"]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private void deleteCrudAppTask (String taskName) {
        driver.navigate().refresh();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10, 200);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[1]")));

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {

                    WebElement buttonDeleteTask = theForm.findElement(By.xpath(".//button[@data-task-delete-button]"));
                  //WebElement buttonDeleteTask = theForm.findElement(By.xpath(".//button[contains(text(), \"Delete\")]"));
                    buttonDeleteTask.click();
                });
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {

        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteCrudAppTask(taskName);
    }
}

