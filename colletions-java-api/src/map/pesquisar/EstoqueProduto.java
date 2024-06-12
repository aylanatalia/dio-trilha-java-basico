package map.pesquisar;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> produtoMap;
    
    public EstoqueProduto(){
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }

    public double calcularEstoque(){
        double valorTotal = 0;
        if(!produtoMap.isEmpty()){
            for(Produto p : produtoMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
             for(Produto p: produtoMap.values()){
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
        }
        }
       return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtoMap.isEmpty()) {
            for(Produto p: produtoMap.values()){
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }
    
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = null;
        double maiorValorTotal = 0d;
        if (!produtoMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : produtoMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotal) {
                    maiorValorTotal = valorProdutoEmEstoque;
                    produtoMaiorQuantidade = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Notebook", 1500d, 1);
        estoque.adicionarProduto(2L, "Mouse", 25d, 5);
        estoque.adicionarProduto(3L, "Monitor", 400d, 10);
        estoque.adicionarProduto(4L, "Teclado", 40d, 2);
        estoque.exibirProdutos();
        System.out.println("Valor total em estoque: " + estoque.calcularEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("O produto mais caro é: " + produtoMaisCaro);

        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("O produto mais barato é: " + produtoMaisBarato);

        Produto produtoMaiorQuantidade = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("O produto com maior quantidade em estoque e valor total em estoque é: " + produtoMaiorQuantidade);
        
    }
}
