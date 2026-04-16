package Lista02_HerancaPolimorfismo.Q3;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(double preco) {
        super(preco);
    }

    @Override
    public double calcularPrecoDesconto() {
        return this.preco - this.preco * 0.2;
    }
}
