package Lista02_HerancaPolimorfismo.Q2;

public class Diretor extends Funcionario{

    private double bonus;

    public Gerente(double salarioMensal, double bonus) {
        super(salarioMensal);
        this.setBonus(bonus);
    }

    public double calcularPagamento(double lucroMensalEmpresa) {
        return salarioMensal + (lucroMensalEmpresa * bonus);
    }

    private void setBonus(double bonus) {
        if (bonus =< 0) throw new IllegalArgumentException("O bonus deve ser maior que 0");
        if (bonus > 100) throw new IllegalArgumentException("O bonus deve ser menor ou igual a 1");
        this.bonus = bonus;
    }
}
