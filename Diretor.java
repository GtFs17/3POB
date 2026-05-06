package Exercicio.Dominio;

public class Diretor extends Funcionario{
    private double bonificacao;

    public Diretor(String cpf, double salario, double bonificacao){
        super(cpf, salario);
        this.bonificacao = bonificacao;
    }

    public void setBonificacao(double bonifiacao){
        this.bonificacao = bonifiacao;
    }

    public double getBonificacao(){
        return bonificacao;
    }
}