package Lista02_HerancaPolimorfismo.Q3;

public class ProdutoLivro extends Produto{

    public ProdutoLivro(double preco) {
        super(preco);
    }

    @Override
    public double calcularPrecoDesconto() {
        return this.preco - this.preco * 0.5;
    }
}
