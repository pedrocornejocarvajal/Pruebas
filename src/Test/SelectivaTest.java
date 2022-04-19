package Test;

import org.junit.jupiter.api.Test;
import principal.Selectiva;

import static org.junit.jupiter.api.Assertions.*;

class SelectivaTest {
    @Test
    void obtenerMáximoPositivos() {
        int x = 30;
        int y = 50;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMáximo(x, y);

        assertEquals(resultado, y, "El resultado es incorrecto");
    }

    @Test
    void obtenerMáximoNegativos() {
        int x = -30;
        int y = -50;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMáximo(x, y);

        assertEquals(resultado, x, "El resultado es incorrecto");
    }

    @Test
    void obtenerMáximoExtremos() {
        int x = 305648978;
        int y = 506987542;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMáximo(x, y);

        assertEquals(resultado, y, "El resultado es incorrecto");
    }

    @Test
    void actualizarMínimo() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMínimo(0);
        assertEquals(0 , selectiva.mínimo,"el valor no se actualiza bien");

        selectiva.actualizarMínimo(20);
        assertEquals(0 , selectiva.mínimo,"el valor no se actualiza bien");

        selectiva.actualizarMínimo(-20);
        assertEquals(-20 , selectiva.mínimo,"el valor no se actualiza bien");
    }

    @Test
    void restaurarMínimoPositivo() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMínimo(-20);
        selectiva.restaurarMínimoPositivo();
        assertEquals(0, selectiva.mínimo, "No se ha restaurado correctamente");
    }

    @Test
    void multiplicaciónPorSigno() {
        Selectiva selectiva = new Selectiva();
        selectiva.mínimo = 20;
        selectiva.multiplicaciónPorSigno();
        assertEquals(60, selectiva.mínimo, "No se ha restaurado correctamente");

        selectiva.actualizarMínimo(-20);
        selectiva.multiplicaciónPorSigno();
        assertEquals(40, selectiva.mínimo, "No se ha restaurado correctamente");
    }

    @Test
    void realizarCálculoOpcion0Positivos() {
        int opcion = 0;
        int a = 2;
        int b = 8;
        int resultadoEsperado = 10;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcion0Negativos() {
        int opcion = 0;
        int a = -2;
        int b = -8;
        int resultadoEsperado = -10;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcion0Extremos() {
        int opcion = 0;
        int a = 26598736;
        int b = 82165987;
        int resultadoEsperado = a+b;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcion1Positivos() {
        int opcion = 1;
        int a = 2;
        int b = 8;
        int resultadoEsperado = 16;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcion1Negativos() {
        int opcion = 1;
        int a = -2;
        int b = -8;
        int resultadoEsperado = 16;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcion1Extremos() {
        int opcion = 1;
        int a = 254895549;
        int b = 86598754;
        int resultadoEsperado = a*b;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcionDefaultPositivos() {
        int opcion = 34;
        int a = 2;
        int b = 8;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcionDefaultNegativos() {
        int opcion = -34;
        int a = -2;
        int b = -8;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCálculoOpcionDefaultExtremos() {
        int opcion = 34594546;
        int a = 254987;
        int b = 821864;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCálculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }
}