package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.CompraLogic;

public class CompraStep {

    private CompraLogic compraLogic;

    public CompraStep(){
        compraLogic = new CompraLogic();
    }
    @Given("eu acesso o site")
    public void eu_acesso_o_site() throws InterruptedException {
      compraLogic.oi();
    }
    @When("coloco um produto no carrinho")
    public void coloco_um_produto_no_carrinho() {

    }
    @When("finalizo a compra")
    public void finalizo_a_compra() {
    }

    @Then("eu consigo finalizar a compra")
    public void eu_consigo_finalizar_a_compra() {

    }

}
