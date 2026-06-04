public class Caminhao extends Veiculo implements Tributavel{
    double toneladasCarga;

    public Caminhao(String placa, double custoFixo, double toneladasCarga){
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga;
    }

     public void setToneladasCarga(double toneladasCarga) {
        this.toneladasCarga = toneladasCarga;
    }

    public double getToneladasCarga() {
        return toneladasCarga;
    }

     @Override
    public double calcularCustoTotal() {
        return getCustoFixo() + (toneladasCarga * 0.50);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixo() * 0.015;
    }
}
