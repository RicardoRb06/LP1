package Lista02_HerancaPolimorfismo.Q1;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }

    public double calcularArea() {
        return 3.14 * Math.pow(this.raio, 2);
    }
}
