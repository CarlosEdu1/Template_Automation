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
    private WebDriverWait wait;

    public CompraLogic() {
    webDriver = new ChromeDriver();
    wait = new WebDriverWait(webDriver, Duration.ofSeconds(600));
    }

    public void entrarNoSite(){

        webDriver.get("http://104.41.34.213");
        webDriver.manage().window().maximize();
    }

    public void clicaCategoria() throws InterruptedException {

        WebElement categoriasBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[1]/a[2]/button")));
        categoriasBtn.click();//clica em categoria
        Thread.sleep(5000);
    }

    public void tipoEscolhido() throws InterruptedException{
        WebElement produtoMouseBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/a[1]")));
        produtoMouseBtn.click();//escolhe o tipo do produto
        Thread.sleep(5000);

    }

    public void mouseEscolhido()throws InterruptedException {

        WebElement mouseEscolhidoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/a[1]/div/div[1]")));
        mouseEscolhidoBtn.click();//escolhe um produto
        Thread.sleep(5000);
    }


    public void addCarrinho()throws InterruptedException{
        WebElement addCarrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section[2]/button")));
        addCarrinhoBtn.click();//add no carrinho
        Thread.sleep(5000);

    }

    public void verificaCarrinho()throws InterruptedException{

        WebElement carrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/button[2]")));
        carrinhoBtn.click();//verifica se o carrinho adicionou o produto
        Thread.sleep(5000);
        webDriver.close();
    }
}
