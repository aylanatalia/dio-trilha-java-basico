package list.buscarList;

import java.util.ArrayList;
import java.util.List;

public class CatalagosLivros {
    //atributo
    private List<Livros> livrosLista;


    public CatalagosLivros(){
        this.livrosLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livrosLista.add(new Livros(titulo, autor, ano));
    }

    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livrosLista.isEmpty()) {
            for(Livros l : livrosLista){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervalosAno(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAno = new ArrayList<>();
        if (!livrosLista.isEmpty()) {
            for(Livros l : livrosLista){
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livros pesquisarPorTitulos(String titulo){
        Livros livroPorTitulo = null;
        if(!livrosLista.isEmpty()){
            for(Livros l : livrosLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagosLivros catalagosLivros = new CatalagosLivros();
        catalagosLivros.adicionarLivro("O conto de aia", "Margarete", 2000);
        catalagosLivros.adicionarLivro("It a coisa", "Stephan king", 1990);
        catalagosLivros.adicionarLivro("Jogos Vorazes", "Ketness", 2006);
        catalagosLivros.adicionarLivro("Em chamas", "Ketness", 2008);

        System.out.println(catalagosLivros.pesquisarPorAutor("Ketness"));
        System.out.println(catalagosLivros.pesquisarPorIntervalosAno(2000, 2006));
        System.out.println(catalagosLivros.pesquisarPorTitulos("Jogos Vorazes"));
    }
}
