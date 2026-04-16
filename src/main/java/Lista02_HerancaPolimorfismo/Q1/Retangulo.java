package Lista02_HerancaPolimorfismo.Q1;

public class Retangulo extends FormaGeometrica{

    private double lado;
    private double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return lado * 2 + altura * 2;
    }

    public double calcularArea() {
        return altura * lado;
    }
}
