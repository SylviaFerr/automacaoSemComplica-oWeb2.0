package br.com.ChronosAcademy.automacaoWeb;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.pages.CursoPage;
import br.com.ChronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TesteWeb {


    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;


    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage( driver);

    }



    @Test
    public void primeiroTeste(){

        //section[2]/div[3]/div/div/div/div/div[1]/div/h4


        assertEquals("Porque Tempo É Conhecimento", principalPage .getTitulo() );

    }



    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.cliqueBotao();

        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());

    }

    @After
    public void finalizateste(){
        driver.quit();

    }




}
