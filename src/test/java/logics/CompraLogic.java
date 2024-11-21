package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompraLogic {

    private WebDriver webDriver;

    public CompraLogic() {
    webDriver = new ChromeDriver();

    }

    public void aiaiai() throws InterruptedException {
        webDriver.get("http://104.41.34.213");

        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(600000000));

        WebElement categoriasBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[1]/a[2]/button")));
        categoriasBtn.click();//clica em categoria

        WebElement produtoMouseBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "/html/body/main/section[2]/a[1]")));
        produtoMouseBtn.click();

        WebElement mouseEscolhidoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "/html/body/main/section[2]/a[1]/div/div[1]")));
        mouseEscolhidoBtn.click();

        WebElement carrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/button[2]")));
        carrinhoBtn.click();//clica no carrinho


        webDriver.wait(100);

        webDriver.close();
    }
    public void oi() throws InterruptedException {
        webDriver.get("http://104.41.34.213");

        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(600));

        WebElement categoriasBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[1]/a[2]/button")));
        categoriasBtn.click();
        Thread.sleep(5000);

        WebElement produtoMouseBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/a[1]")));
        produtoMouseBtn.click();
        Thread.sleep(5000); // Espera 5 segundos

        WebElement mouseEscolhidoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/a[1]/div/div[1]")));
        mouseEscolhidoBtn.click();
        Thread.sleep(5000); // Espera 5 segundos

        WebElement addCarrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/button")));
        mouseEscolhidoBtn.click();
        Thread.sleep(5000);

        WebElement carrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/button[2]")));
        carrinhoBtn.click(); // clica no carrinho
    }
}
