import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorFrota {

    public GerenciadorFrota() {
        this.frota = new ArrayList<>();
    }

    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v){
        this.frota.add(v);
    }
    
    public void salvarDadosEmArquivo(String nomeArquivo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                String tipoVeiculo = v instanceof Carro ? "Carro" : "Caminhao";
                String linha = String.format("%s,%s,%.2f,%.2f", tipoVeiculo, v.getPlaca(), v.getCustoFixo(), v.calcularCustoTotal());
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }
    // Ler e processar dados do arquivo em tela utilizando BufferedReader
    
    public void lerDadosDoArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 4) {
                    String tipoVeiculo = partes[0];
                    String placa = partes[1];
                    double custoFixo = Double.parseDouble(partes[2]);
                    double custoTotal = Double.parseDouble(partes[3]);
                    System.out.printf("Tipo: %s, Placa: %s, Custo Fixo: %.2f, Custo Total: %.2f%n", tipoVeiculo, placa, custoFixo, custoTotal);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler dados do arquivo: " + e.getMessage());
        }
    }
}