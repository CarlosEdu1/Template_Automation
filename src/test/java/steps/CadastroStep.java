package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.CadastroLogic;

public class CadastroStep {

    private CadastroLogic cadastroLogic;

    public CadastroStep() {
        cadastroLogic = new CadastroLogic();
    }

    @Given("acesso o site tech")
    public void acesso_o_site_tech() throws InterruptedException {
        cadastroLogic.entroSite();
    }

    @When("clico na conta")
    public void clico_na_conta() throws InterruptedException {
        cadastroLogic.clico_na_conta();
        cadastroLogic.clico_em_inscrever_se();
    }

    @When("clico em inscrever-se")
    public void clico_em_inscrever_se() throws InterruptedException {

    }

    @When("informo minhas informacoes")
    public void informo_minhas_informacoes() throws InterruptedException {

    }

    @Then("confirmo a criacao de conta")
    public void confirmo_a_criacao_de_conta() throws InterruptedException {

    }


}
