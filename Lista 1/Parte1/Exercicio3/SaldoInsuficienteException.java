package Exercicio3;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double saldo, double valorTentado) {
        super("Saldo insuficiente: R$" + saldo + ", valor tentado: R$" + valorTentado);
    }
}
