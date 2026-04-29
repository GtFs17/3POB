package Exercicio2;

public class Gerente extends Funcionario {
    private String departamento;
    
    public Gerente(String nome, String departamento, double salario){
        super(nome, salario * 1.25);
        this.departamento = departamento;
    }

    public String getDepartamento()
    {
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

}
