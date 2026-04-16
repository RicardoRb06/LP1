package Lista02_HerancaPolimorfismo.Q4;

public class VooInternacional {

    private final double fatorPreco = 0.5;

    public VooInternacional(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    public VooInternacional(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularPreco() {
        return this.fatorPreco * this * distancia;
    }
}
