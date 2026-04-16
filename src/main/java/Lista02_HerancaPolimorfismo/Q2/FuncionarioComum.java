package Lista02_HerancaPolimorfismo.Q2;

public class FuncionarioComum extends Funcionario{

    public FuncionarioComum(double salarioMensal) {
        super(salarioMensal);
    }

    public double calcularPagamento() {
        return salarioMensal;
    }
}
