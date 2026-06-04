

public class Main {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();
        try {
            Carro carro1 = new Carro("ABC12", 5000.0, 20000);
            System.out.println("Custo total do carro: " + carro1.calcularCustoTotal());
        }
        catch (PlacaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    
    try {
            Veiculo carro2 = new Carro("DDDDD1D23", 10000.0, 1400);
            Veiculo caminhao1 = new Caminhao("3344FG", 4400.0, 5.5);
            
            gerenciador.adicionarVeiculo(carro2);
            gerenciador.adicionarVeiculo(caminhao1);
            
            gerenciador.salvarDadosEmArquivo("frota.txt");
            
            gerenciador.lerDadosDoArquivo("frota.txt");

        } catch (PlacaInvalidaException e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
