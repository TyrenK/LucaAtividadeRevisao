public class ContaPoupanca implentes Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOp;
    }

    @Override 
    public void sacar(double valor) {
        this.saldo -= valor + taxaOp;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}