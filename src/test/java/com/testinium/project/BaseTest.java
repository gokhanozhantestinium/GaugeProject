package com.testinium.project;

import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
public static WebDriver driver;

@BeforeScenario
    public void setUp(){
    String Baseurl = "https://www.hepsiburada.com/";
    DesiredCapabilities capabilities;
    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");


}











}
