package Lista02_HerancaPolimorfismo.Q3;

public class ProdutoEletronico extends Produto{

    public ProdutoEletronico(double preco) {
        super(preco);
    }

    @Override
    public double calcularPrecoDesconto() {
        return this.preco - this.preco * 0.1;
    }
}
