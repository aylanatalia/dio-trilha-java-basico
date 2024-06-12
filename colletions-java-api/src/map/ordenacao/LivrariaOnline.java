package map.ordenacao;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline(){
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for(String chave : chavesRemover){
            livrosMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenadosPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosOrdenadosPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosOrdenadosPorPreco){
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
    }

    public Map<String, Livro> exibirLivroPorAutor(){
        List<Map.Entry<String, Livro>> LivrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(LivrosParaOrdenarPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : LivrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> exibirLivroMaisCaro(){
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if ((!livrosMap.isEmpty())) {
            for(Livro l : livrosMap.values()){
                if (l.getPreco() > precoMaisAlto) {
                    precoMaisAlto = l.getPreco();
                }
            }
        }else{
            throw new NoSuchElementException("A livraria esta vasia");
        }

        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> exibirLivroMaisBarato(){
        List<Livro> livroMaisBarato = new ArrayList<>();
        double precoMaisBarato = Double.MAX_VALUE;

        if ((!livrosMap.isEmpty())) {
            for(Livro l : livrosMap.values()){
                if (l.getPreco() < precoMaisBarato) {
                    precoMaisBarato = l.getPreco();
                }
            }
        }else{
            throw new NoSuchElementException("A livraria esta vasia");
        }

        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getPreco() == precoMaisBarato) {
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livroMaisBarato.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livraria.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livraria.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livraria.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livraria.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livraria.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
        System.out.println("Livros ordenados por preco:  \n" +livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println("Livros ordenados por autor:  \n" +livraria.exibirLivroPorAutor());

        String autorPesquisa = "Josh Malerman";
        livraria.pesquisarPorAutor(autorPesquisa);
        
        System.out.println("Livro mais caro: " + livraria.exibirLivroMaisCaro());
        System.out.println("Livro mais barato: " + livraria.exibirLivroMaisBarato());


    }
}
