package Lista02_HerancaPolimorfismo.Q4;

public abstract class Voo {

    protected String origem;
    protected String destino;
    protected double distancia;

    protected Voo(double distancia) {
        this.distancia = distancia;
    }

    protected Voo(String origem, String destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public abstract double calcularPreco();

}
