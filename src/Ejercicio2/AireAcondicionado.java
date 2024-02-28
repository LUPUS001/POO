package Ejercicio2;

public class AireAcondicionado {
    private String nombre;
    private int tempMax;
    private int tempMin;
    private int tempActual;

    public AireAcondicionado(String nombre, int tempMax, int tempMin, int tempActual) {
        this.nombre = nombre;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempActual = tempActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempActual() {
        return tempActual;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    @Override
    public String toString(){
        return this.nombre + "\n\t" + "Temperatura máxima" + tempMax + "\n\t";
    }
    public void subir() {
        if (this.tempActual + 1 <= this.tempMax){
            this.tempActual++;
        }
    }
    public void bajar() {
        if (this.tempActual - 1>= this.tempMin){
            this.tempActual--;
        }
    }
}
