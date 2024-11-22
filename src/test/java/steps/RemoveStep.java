package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.RemoveLogic;

public class RemoveStep {

    private RemoveLogic removeLogic;

    public RemoveStep(){
        removeLogic = new RemoveLogic();
    }

    @Given("acesso o site")
    public void acesso_o_site()throws InterruptedException {
        removeLogic.entroSite();
    }

    @When("seleciono a categoria de um produto")
    public void seleciono_a_categoria_de_um_produto()throws InterruptedException {
    }

    @When("escolho um produto da categoria")
    public void escolho_um_produto_da_categoria() throws InterruptedException{
        removeLogic.clicaCategoria();
    }

    @When("adiciono no carrinho o produto")
    public void adiciono_no_carrinho_o_produto()throws InterruptedException {
        removeLogic.tipoEscolhido();
        removeLogic.mouseEscolhido();
    }

    @When("removo o produto do carrinho")
    public void removo_o_produto_do_carrinho()throws InterruptedException {
        removeLogic.addCarrinho();

    }

    @Then("verifico se o produto foi removido do carrinho")
    public void verifico_se_o_produto_foi_removido_do_carrinho() throws InterruptedException{
        removeLogic.verificaCarrinho();
        removeLogic.removoProduto();
    }
}
