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
    }

    @Test
    void obtenerPrimerNegativo() {
    }

    @Test
    void verificarDatosInternos() {
    }
}