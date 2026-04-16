package Lista02_HerancaPolimorfismo.Q4;

public class VooDomestico extends Voo{

    private final double fatorPreco = 1.25;

    public VooDomestico(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    public VooDomestico(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularPreco() {
        return this.fatorPreco * this.distancia;
    }
}
