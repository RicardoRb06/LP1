package Lista02_HerancaPolimorfismo.Q8;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int preco) {
        super(marca, modelo, preco);
    }

    @Override
    public float getFator() {
        return 1.05f;
    }
}
