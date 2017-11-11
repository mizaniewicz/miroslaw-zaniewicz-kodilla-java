package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectD = new Select(selectDay);
        selectD.selectByIndex(11);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectM = new Select(selectMonth);
        selectM.selectByIndex(12);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectY = new Select(selectYear);
        selectY.selectByIndex(41);

    }
}
