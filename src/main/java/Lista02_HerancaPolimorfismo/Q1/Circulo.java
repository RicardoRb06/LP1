package Lista02_HerancaPolimorfismo.Q1;

public class Circulo extends FormaGeometrica{

    private double raio;

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
