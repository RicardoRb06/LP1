package Lista02_HerancaPolimorfismo.Q6;

public abstract class ContaBancaria {
    protected String numeroConta;
    protected String Titular;
    protected float saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        Titular = titular;
        this.saldo = 0;
    }

    public void depositar(float valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Não é permitido depositar um valor menor ou igual a 0");
        }
        valor -= this.getTaxaDeposito();
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (valor > this.saldo){
            throw new IllegalArgumentException("Não é permitido sacar um valor maior que o saldo da conta");
        }
        this.saldo -= valor;
    }

    public abstract float getTaxaDeposito();
}
