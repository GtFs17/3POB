public abstract class Veiculo{
    private String placa;
    private double custoFixo;

    public Veiculo(String placa, double custoFixo){
        if (placa.length() != 7 || placa == null) {
            throw new PlacaInvalidaException(placa);
        }
        this.placa = placa;
        this.custoFixo = custoFixo;
    }   
    public abstract double calcularCustoTotal();
    
    public String getPlaca() {
        return placa;
    }

    public double getCustoFixo() {
        return custoFixo;
    }
}