package Exercicio.Dominio;

public class Funcionario{
    private String cpf;
    private double salario;

    public Funcionario(String cpf, double salario){
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getCPF(){
        return cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}