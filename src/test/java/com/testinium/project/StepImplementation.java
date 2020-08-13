package com.testinium.project;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.By.cssSelector;

public class StepImplementation extends BaseTest {

    @Step("<Key> Saniye Bekle")
    public void bekle(int Key) throws InterruptedException {
        Thread.sleep(Key * 1000);
    }

    @Step("Css <element> tıkla")
    public void clickElementByCss(String element) {
        driver.findElement(cssSelector(element)).click();

    }

    @Step("Css <element> bul <key> gönder")
    public void sendKeyByCss(String element, String key) {
        driver.findElement(cssSelector(element)).sendKeys(key);
    }

    @Step("Validate login")
    public void validateLogin() {
        String actualUrl = "https://www.hepsiburada.com/";
        String expectedUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    @Step("Random click")
    public void randomClick() {
        List<WebElement> links = driver.findElements(cssSelector("div[class'voltran-fragment']"));

        WebElement random = links.get(new Random().nextInt(links.size()));

        }
}