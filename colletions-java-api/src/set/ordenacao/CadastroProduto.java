package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //consegue deixar organisado por nome
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();

        cadastro.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastro.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastro.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastro.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println(cadastro.produtoSet);

        System.out.println(cadastro.exibirProdutoPorNome());

        System.out.println(cadastro.exibirPorPreco());
    }

}
