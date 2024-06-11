package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributos
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidado(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite){
        Convidados convidadosParaRemover = null;
        for(Convidados c : convidadosSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadosParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadosParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    } 

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de conzidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1236);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de conzidados");

        conjuntoConvidado.removerConvidadoPorCodigoDoConvite(1234);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de conzidados");

        conjuntoConvidado.exibirConvidados();
    }
}
