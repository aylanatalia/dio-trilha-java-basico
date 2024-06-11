package set.operacoesbasicas;

import java.util.Objects; 

public class Convidados{
    //atributos
    private String nome;
    private int codigoConvite;

    public Convidados(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Convidados convidados)) return false;
        return getCodigoConvite() == convidados.getCodigoConvite();
    }

    public String toString(){
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}