package principal;

public class Selectiva {
    public int mínimo = 0;

    public int obtenerMáximo(int x, int y) {
        int máximo = x;
        if (máximo < y)
            máximo = y;
        return máximo;
    }

    public void actualizarMínimo(int x) {
        if (mínimo > x)
            mínimo = x;
    }

    public void restaurarMínimoPositivo() {
        if (mínimo < 0)
            mínimo = 0;
    }

    public void multiplicaciónPorSigno(){
        if(mínimo < 0){
            mínimo *= -2;
        }
        else {
            mínimo *= 3;
        }
    }

    public int realizarCálculo(int opcion, int a, int b) {
        int cálculo;
        switch (opcion) {
            case 0:
                cálculo = a + b;
                break;
            case 1:
                cálculo = a * b;
                break;
            default:
                cálculo = -1;
        }
        return cálculo;
    }
}
