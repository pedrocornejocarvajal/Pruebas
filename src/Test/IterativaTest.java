package Test;

import org.junit.jupiter.api.Test;
import principal.Iterativa;

import static org.junit.jupiter.api.Assertions.*;

class IterativaTest {

    @Test
    void buscarMáximo() {
        double[] vector = { 1.7, 3.34, 5.7, 7.23, 11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMáximoCB0() {
        double[] vector = {11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMáximoCB1() {
        double[] vector = {2, 11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMinimoInterno() {
    }

    @Test
    void duplicarValoresDatos() {
    }

    @Test
    void obtenerValorEntre() {

        boolean exceptionProducida= false;
        try {
             new Iterativa(new double[]{20,9.5,8.1,10}).obtenerValorEntre(50,130);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void obtenerPrimerNegativo() {
    }

    @Test
    void verificarDatosInternos1CN() {

        boolean exceptionProducida= false;
        try {
            new Iterativa(new double[]{20,9.5,8.1,10}).verificarDatosInternos();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void verificarDatosInternos2CN() {

        boolean exceptionProducida= false;
        try {
            new Iterativa(new double[]{-5456820,9.5,8.1,10}).verificarDatosInternos();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");

    }
}