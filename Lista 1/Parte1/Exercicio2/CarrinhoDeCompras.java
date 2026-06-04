package Exercicio2;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaProdutos;

    public CarrinhoDeCompras() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : listaProdutos) {
            total += p.getPreco();
            
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : listaProdutos) {
            p.aplicarDesconto(percentual);
        }
    }
}
