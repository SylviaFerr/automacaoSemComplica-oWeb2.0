package br.com.ChronosAcademy.steps;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void iniciaNavegador() {
        new Driver("chrome");
    }

    @After
    public void fecharNavegador() {
        Driver.getDriver().quit();
    }


    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }

    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFecharmodal();
    }

    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisilityOfBtnFechar();
        } catch (Exception e){
           throw new Exception("A janela modal nao foi fechada");
    }

}

    @Quando("for realizado um clique no icone de fechar")
    public void forRealizadoUmCliqueNoIconeDeFechar() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique no Link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina Create new Account sevce ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida(){

    }


    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) {
        String usarname = map .get( "login");
        String password = map.get("password");
        boolean remember = Boolean. parseBoolean( map.get("remember"));

        loginPage.setInpuserName(usarname);
        loginPage.setInpPassword(password);

        if(remember) loginPage.clickInpRemember();
    }

    @Quando("for realizado um clique no botao sign in")
    public void forRealizadoUmCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerpossivelLogarNoSistema(){

    }

    @Entao("o sistema deve exibir mensagem de erro")
    public void oSistemaDeveExibirMensagemDeErro() {
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        Boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
