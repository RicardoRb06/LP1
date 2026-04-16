package Lista02_HerancaPolimorfismo.Q4;

public abstract class Voo {

    abstract String origem;
    abstract String destino;
    abstract double distancia;

    public Voo(double distancia) {
        this.distancia = distancia;
    }

    public Voo(String origem, String destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public abstract double calcularPreco();

}
