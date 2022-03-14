package Steps;

import Pages.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import Runners.Executar;
import org.openqa.selenium.Alert;

public class Steps extends Executar{

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    TimelinePage timelinePage = new TimelinePage(driver);
    NovaPublicaçãoPage novaPublicaçãoPage = new NovaPublicaçãoPage(driver);
    NovaPublicaçãoPosVideoPage novaPublicaçãoPosVideoPage = new NovaPublicaçãoPosVideoPage(driver);

    @Dado("que estou no site da dialog")
    public void queEstouNoSiteDaDialog(){

        loginPage.acessarAplicacao();
    }
    @Quando("eu digito meu nome do usuário")
    public void euDigitoMeuNomeDoUsuário() throws InterruptedException {
        loginPage.nomeUsuario();
    }
    @E("digitar a senha")
    public void digitarASenha() throws InterruptedException {
        loginPage.digitarSenha();
    }
    @Quando("clico no botão entrar")
    public void clicoNoBotãoEntrar() throws InterruptedException {
        loginPage.clicarEntrar();
    }
    @Então("Sou redirecionado para a home do site dialog")
    public void souRedirecionadoParaAHomeDoSiteDialog(){}

    @Quando("clicar em Timeline")
    public void clicarEmTimeline() throws InterruptedException {
        homePage.acessarTimeline();
    }
    @Quando("clicar em O que você vai nos dizer hoje?")
    public void clicarEmOQueVocêVaiNosDizerHoje() throws InterruptedException {
        timelinePage.clicarnoPensamento();
    }
    @Então("Sou redirecionado para a tela de Publicar na Timeline")
    public void souRedirecionadoParaATelaDePublicarNaTimeline() {
    }
    @Quando("cliar no ícone de camera")
    public void cliarNoÍconeDeCamera() throws InterruptedException {
        novaPublicaçãoPage.clicarCamera();
        System.out.println("************ANTENÇÃO Você tem um tempo de 10 segundos para escolher o vídeo a ser postado, pois a automação está setada com esse período, podendo ser alterado************");
        System.out.println("************Selecionar um vídeo do seu computador/pen drive/HD externo e clicar em Abrir************");
    }
    @Quando("selecionar um vídeo da minha galeria no meu computador")
    public void selecionarUmVídeoDaMinhaGaleriaNoMeuComputador() {
    }
    @Quando("clicar em Abrir")
    public void clicarEmAbrir() {
    }
    @Quando("clicar em Publicar")
    public void clicarEmPublicar() throws InterruptedException {
        novaPublicaçãoPosVideoPage.clicarPublicar();
    }
    @Então("o video dee aparecer na minha timeline")
    public void oVideoDeeAparecerNaMinhaTimeline() {
        System.out.println("************O vídeo deve ser o primeiro em sua Timeline");
    }

}