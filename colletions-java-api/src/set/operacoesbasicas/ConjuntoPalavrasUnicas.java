package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos 
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada dentro do conjunto");
            }
        }else{
            System.out.println("O conjunto esta vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirConjunto(){
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        }else{
            System.out.println("O conjunto esta vazio");
        }
    }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavras("Java");
        conjuntoPalavrasUnicas.adicionarPalavras("Python");
        conjuntoPalavrasUnicas.adicionarPalavras("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavras("Python");
        conjuntoPalavrasUnicas.adicionarPalavras("C++");
        conjuntoPalavrasUnicas.adicionarPalavras("Ruby");

        conjuntoPalavrasUnicas.exibirConjunto();

        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirConjunto();

        conjuntoPalavrasUnicas.removerPalavra("Swift");

        System.out.println("A palavra Java esta no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A palavra Python esta no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Pyhton"));

        conjuntoPalavrasUnicas.exibirConjunto();
    }
}
