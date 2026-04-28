package Lista02_HerancaPolimorfismo.Q8;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, int preco) {
        super(marca, modelo, preco);
    }

    @Override
    public float getFator() {
        return 1.25f;
    }
}
