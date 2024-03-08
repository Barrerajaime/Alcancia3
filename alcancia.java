import java.util.HashMap;
import java.util.Map;

public class Alcancia {
    private Map<Integer, Integer> monedas;
    private int totalMonedas;
    private int totalAcumulado;

    public Alcancia() {
        this.monedas = new HashMap<>();
        this.totalMonedas = 0;
        this.totalAcumulado = 0;
    }

    public void agregarMoneda(int denominacion) {
        monedas.put(denominacion, monedas.getOrDefault(denominacion, 0) + 1);
        totalMonedas++;
        totalAcumulado += denominacion;
    }

    public int getCantidadMonedasPorDenominacion(int denominacion) {
        return monedas.getOrDefault(denominacion, 0);
    }

    public int getTotalMonedas() {
        return totalMonedas;
    }

    public int getTotalAcumulado() {
        return totalAcumulado;
    }

    public void vaciarAlcancia() {
        monedas.clear();
        totalMonedas = 0;
        totalAcumulado = 0;
    }

    public boolean retirarMoneda(int denominacion) {
        if (monedas.getOrDefault(denominacion, 0) > 0) {
            monedas.put(denominacion, monedas.get(denominacion) - 1);
            totalMonedas--;
            totalAcumulado -= denominacion;
            return true;
        }
        return false;
    }


}
