package Lista02_HerancaPolimorfismo.Q2;

public abstract class Funcionario {

    protected double salarioMensal;

    protected Funcionario(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();
}
