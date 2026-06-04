package Exercicio3;

public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Gabriel", 500.0);

        try{
            System.out.println("Fazendo saque...");
            conta.getSaldo();
            conta.sacar(600.0);
        }catch (SaldoInsuficienteException e){
            System.err.println("Erro! " + e.getMessage());
        }finally{
            System.out.println("Fim do saque. Saldo atual: R$" + conta.getSaldo());
        }
    }
}
