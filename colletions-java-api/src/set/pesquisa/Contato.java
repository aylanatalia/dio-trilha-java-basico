package set.pesquisa;

import java.text.MessageFormat;
import java.util.Objects;

public class Contato {
    // atributo
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean equals(Object obj){
        if (this == obj)  return true;
        if (!(obj instanceof Contato contato)) {
            return false;
        }
        return Objects.equals(getNome(), contato.getNome()); 
    }

    public int hashCode(){
        return Objects.hash(getNome());
    }

    public String toString(){
        return "{" + nome + "," + numero + "}";
    }
}
