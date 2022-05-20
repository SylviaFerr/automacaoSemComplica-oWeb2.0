package br.com.ChronosAcademy.automacaoWeb;

import br.com.ChronosAcademy.core.Driver;
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

<<<<<<< HEAD
<<<<<<< HEAD
    WebDriver driver;
    Driver driverWeb;


    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
=======
    ChromeDriver driver;

=======
    ChromeDriver driver;

>>>>>>> master
    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
>>>>>>> master
        driver.get("https://www.chronosacademy.com.br");
    }


    @Test
    public void primeiroTeste(){
<<<<<<< HEAD
<<<<<<< HEAD
        //section[2]/div[3]/div/div/div/div/div[1]/div/h4

        String xpathTitulo = "//section[2]//h4";

=======
=======
>>>>>>> master

        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
>>>>>>> master
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);

<<<<<<< HEAD
<<<<<<< HEAD
=======
    }

    @Test
    public void primeiroTeste1(){

        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Conheça Nossos Cursos", titulo);

>>>>>>> master
    }

    @After
    public void finalizateste(){
        driver.quit();

<<<<<<< HEAD
    @After
    public void finalizateste(){
        driver.quit();

=======
>>>>>>> master
=======
    }

    @Test
    public void primeiroTeste1(){

        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Conheça Nossos Cursos", titulo);

    }

    @After
    public void finalizateste(){
        driver.quit();

>>>>>>> master
    }

}
