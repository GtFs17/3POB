public class Carro extends Veiculo implements Tributavel{
    int quilometragem;

    public Carro(String placa, double custoFixo, int quilometragem){
        super(placa, custoFixo);
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixo() + (quilometragem * 0.15);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixo() * 0.04;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getQuilometragem() {
        return quilometragem;
    }
}

