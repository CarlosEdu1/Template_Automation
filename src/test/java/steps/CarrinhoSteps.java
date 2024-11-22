package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.CompraLogic;

public class CarrinhoSteps {

    private CompraLogic compraLogic;

    public CarrinhoSteps() {
        compraLogic = new CompraLogic();
    }

    @Given("eu acesso o site")
    public void eu_acesso_o_site() {
        compraLogic.entrarNoSite();
    }

    @When("seleciono uma categoria")
    public void seleciono_uma_categoria() throws InterruptedException {
        compraLogic.clicaCategoria();
    }

    @When("escolho um produto")
    public void escolho_um_produto() throws InterruptedException {
        compraLogic.tipoEscolhido();
    }

    @When("adiciono no carrinho")
    public void adiciono_no_carrinho() throws InterruptedException {
        compraLogic.mouseEscolhido();
        compraLogic.addCarrinho();
    }

    @Then("verifico se o produto foi adicionado no carrinho")
    public void verifico_se_o_produto_foi_adicionado_no_carrinho() throws InterruptedException {
        compraLogic.verificaCarrinho();
    }
}
