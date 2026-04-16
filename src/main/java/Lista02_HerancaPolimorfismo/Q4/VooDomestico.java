package Lista02_HerancaPolimorfismo.Q4;

public class VooDomestico extends Voo{

    private final double fatorPreco;

    @Override
    public double calcularPreco() {
        return this.fatorPreco * this * distancia;
    }
}
