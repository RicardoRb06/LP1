package Lista02_HerancaPolimorfismo.Q3;

public abstract class Produto {

    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public abstract double calcularPrecoDesconto();
}
