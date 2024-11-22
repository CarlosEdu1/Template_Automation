package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroLogic {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public CadastroLogic() {
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(600));
    }

    public void entroSite(){
        webDriver.get("http://104.41.34.213");
        webDriver.manage().window().maximize();
    }

    public void clico_na_conta() throws InterruptedException {
        WebElement contaBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/a[1]/button")));
        contaBtn.click();//clicar no botao de conta
        Thread.sleep(5000);
    }

    public void clico_em_inscrever_se() throws InterruptedException {
        WebElement inscreveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/form/div[4]/span/a")));
        inscreveBtn.click();
        Thread.sleep(5000);

        WebElement nomeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=':r5:']")));
        nomeBtn.sendKeys("Carlos Eduardo Martins");
        Thread.sleep(5000);


    }

    public void informo_minhas_informacoes() throws InterruptedException {
        WebElement carrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/button[2]")));
        carrinhoBtn.click();//verifica se o carrinho adicionou o produto
        Thread.sleep(5000);
    }

    public void confirmo_a_criacao_de_conta() throws InterruptedException {
        WebElement carrinhoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[2]/button[2]")));
        carrinhoBtn.click();//verifica se o carrinho adicionou o produto
        Thread.sleep(5000);
        webDriver.close();
    }
}
