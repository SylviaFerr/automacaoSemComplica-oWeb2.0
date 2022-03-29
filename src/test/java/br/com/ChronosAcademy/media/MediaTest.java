package br.com.ChronosAcademy.media;

import org.junit.Test;


import static org.junit.Assert.*;

public class MediaTest {
        @Test
        public void validaAprovado (){
            Media media = new Media() ;
            String resultado;
            resultado = media.calculaMedia (5.0 , 5.0);
            String expected;
            assertEquals(  "Aprovado", resultado);
        }

    @Test
    public void validaReprovado (){
        Media media = new Media() ;
        String resultado;
        resultado = media.calculaMedia(4.9, 5.0);
        String expected;
        assertEquals(  "Reprovado", resultado);
    }
}