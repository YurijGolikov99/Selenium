package by.eDostavka;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest1() {
        //driver.manage().window().setSize(new Dimension(1000, 1000)); //- чтобы поставить размеры окна когда будет открываться
        driver.get("https://e-dostavka.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Е-доставка интернет-магазин. Доставка товаров по всей Беларуси"));
        //WebElement link_enter = driver.findElement(By.xpath("//a[@class='link_enter']"));
        WebElement link_enter = driver.findElement(By.cssSelector("[href=\"https://e-dostavka.by/cabinet/enter/?url=%2F\"]"));
        link_enter.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("btn-registration")));
        driver.findElement(By.cssSelector("[href=\"/registration/\"]")).click();
        //driver.findElement(By.cssSelector("[class=\"btn btn-orange btn btn-secondary btn-block\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("form")));

        driver.findElement(By.name("Name1")).sendKeys("Юрий");
        driver.findElement(By.name("Name2")).sendKeys("Голиков");
        driver.findElement(By.name("Phone1")).sendKeys("375291847518");
        driver.findElement(By.name("EMail")).sendKeys("yurij.golikov99@mail.ru");
        driver.findElement(By.xpath("//div[@class='page-form profile-form']//input[@id='react-select-3-input']")).sendKeys("Минская область");
        driver.findElement(By.xpath("//div[@class='page-form profile-form']//input[@id='react-select-4-input']")).sendKeys("Борисов");
        //driver.findElement(By.cssSelector(""));
        driver.findElement(By.xpath("//div[@class='page-form profile-form']//input[@id='react-select-6-input']")).sendKeys("ул. Гагарина");
        driver.findElement(By.name("Address3Name")).sendKeys("67");
        driver.findElement(By.name("Address2Name")).sendKeys("");
        driver.findElement(By.name("Porch")).sendKeys("4");
        driver.findElement(By.name("Floorx")).sendKeys("4");
        driver.findElement(By.name("Address1Name")).sendKeys("142");
        driver.findElement(By.name("Password")).sendKeys("yUrChIkGoLiKoV");
        driver.findElement(By.name("PasswordRepeat")).sendKeys("yUrChIkGoLiKoV");
        driver.findElement(By.id("SubscribeEmail")).click();
        driver.findElement(By.id("SubscribeSms")).click();
        driver.findElement(By.id("SubscribeDostavka")).click();
        driver.findElement(By.cssSelector("[class=\"btn-light btn btn-secondary btn-block\"]")).click();
    }

    //@Test
    public void firstTest2() {
        driver.manage().window().setSize(new Dimension(1000, 300)); //- чтобы поставить размеры окна когда будет открываться
        driver.get("https://e-dostavka.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Е-доставка интернет-магазин. Доставка товаров по всей Беларуси"));
    }
}