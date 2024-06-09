package list.buscarList;

public class Livros {
    //atributos
    private String titulo;
    private String autor;
    private int ano;

    public Livros(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    public String toString(){
        return "Livro{" +
                "titulo= " + titulo + '\'' +
                ", autor= " + autor + '\'' +
                ", ano= " + ano +
                '}';
    }
}
