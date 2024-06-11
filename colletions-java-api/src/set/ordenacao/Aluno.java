package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Aluno aluno)){
            return false;
        }
        return Objects.equals(getMatricula(), aluno.getMatricula());
        }
    
    public int hashCode(){
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Aluno aluno) {
        // TODO Auto-generated method stub
        return nome.compareTo(aluno.getNome());
    }

    public String toString(){
        return "Aluno: " + nome + " - " + matricula + " - " + media;
    }
}


class ComparatorNota implements Comparator<Aluno>{
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}