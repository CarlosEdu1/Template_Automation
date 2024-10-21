package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompraLogic {

    private WebDriver webDriver;

    public CompraLogic() {
    webDriver = new ChromeDriver();

    }

    public void aiaiai() throws InterruptedException {
        webDriver.get("https://www.google.com");

        // Encontra o campo de pesquisa e insere o termo
        WebElement searchBox = webDriver.findElement(By.name("q"));

        searchBox.sendKeys("murilo corno manso");
        webDriver.wait(92);

        webDriver.close();
    }
}
