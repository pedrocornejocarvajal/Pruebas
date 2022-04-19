package Test;

import org.junit.jupiter.api.Test;
import principal.Secuencial;

import static org.junit.jupiter.api.Assertions.*;

class SecuencialTest {

    @Test
    void sumar() {
        int x = 23;
        int y = 83;
        int resultadoEsperado = 106;
        Secuencial secuencial = new Secuencial();
        int resultado = secuencial.sumar(x, y);

        assertEquals(resultado, resultadoEsperado, "Suma no valida.");
    }

    @Test
    void setContador() {

    }

    @Test
    void getContador() {
    }

    @Test
    void calcularMedia() {
        assertEquals(new Secuencial().calcularMedia(5,10), 7.5, "la media no es correcta");
    }
}