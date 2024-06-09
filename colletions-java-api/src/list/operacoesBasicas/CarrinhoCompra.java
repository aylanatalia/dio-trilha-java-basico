package list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra{
    // atributos
    private List<Produto> produtoLista;

    public CarrinhoCompra(){
        this.produtoLista = new ArrayList<>();
    }

    public void adiconarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        this.produtoLista.add(produto);
    }

    public void removerProduto(String nome){
        List<Produto> produtosParaRemover = new ArrayList<>();
        if (!produtoLista.isEmpty()) {
            for(Produto p: produtoLista){
                if (p.getNome().equalsIgnoreCase(nome)) {
                    produtosParaRemover.add(p);
                }
            }
            produtoLista.removeAll(produtosParaRemover);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public double calcularTotal(){
        double valorTotal = 0d;
        if (!produtoLista.isEmpty()) {
            for(Produto produto: produtoLista){
                double valorPorduto = produto.getPreco() * produto.getQuantidade();
                valorTotal += valorPorduto; //valor total + valor do produto
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirProdutos(){
        if(!produtoLista.isEmpty()){
            System.out.println(this.produtoLista);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public String toString(){
        return produtoLista.toString();
    }

    public static void main(String[] args) {
        //criando uma instancia de carrinho de compra
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        //adicionando itens ao carrinho

        carrinhoCompra.adiconarProduto("Bolacha", 2d, 4);
        carrinhoCompra.adiconarProduto("Achocolatado", 15d, 2);
        carrinhoCompra.adiconarProduto("Salgadinho", 6d, 1);
        carrinhoCompra.adiconarProduto("Leite", 5.6d, 6);

        //exibindo os itens do carrinho
        carrinhoCompra.exibirProdutos();

        //removendo itens do carrinho
        carrinhoCompra.removerProduto("Bolacha");

        //lista atualiada
        carrinhoCompra.exibirProdutos();

        //calculando o total
        System.out.println("O valor do carrinho de compra é " + carrinhoCompra.calcularTotal());
    }
}
