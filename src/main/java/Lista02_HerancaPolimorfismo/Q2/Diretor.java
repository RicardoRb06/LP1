package Lista02_HerancaPolimorfismo.Q2;

public class Diretor extends Funcionario{

    private double taxaParticipacao;
    private double lucroMensalEmpresa;

    public Diretor(double salarioMensal, double taxaParticipacao, double lucroMensalEmpresa) {
        super(salarioMensal);
        this.setTaxaParticipacao(taxaParticipacao);
        this.lucroMensalEmpresa = lucroMensalEmpresa;
    }

    public double calcularPagamento() {
        return salarioMensal + (lucroMensalEmpresa * taxaParticipacao);
    }

    private void setTaxaParticipacao(double taxaParticipacao) {
        if (taxaParticipacao <= 0) throw new IllegalArgumentException("O bonus deve ser maior que 0");
        if (taxaParticipacao > 1) throw new IllegalArgumentException("O bonus deve ser menor ou igual a 1");
        this.taxaParticipacao = taxaParticipacao;
    }
}
