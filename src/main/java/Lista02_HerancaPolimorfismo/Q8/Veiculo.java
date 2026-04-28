package Lista02_HerancaPolimorfismo.Q8;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected float preco;

    public void setPreco(int preco) {
        if (preco < 0){
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }

    public Veiculo(String marca, String modelo, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.setPreco(preco);
    }

    public float calcularPreco(){
        return this.preco * this.getFator();
    }

    public abstract float getFator();
}
