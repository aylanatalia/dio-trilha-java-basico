package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("O dicionario esta vasio");
        }
    }

    public String buscarPalavra(String palavra){
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada";
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }else{
            System.out.println("O dicionario esta vasio");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programacao orientada a objetos");
        dicionario.adicionarPalavra("Typescript", "Superset de linguagem JavaScript que adiciona tipagem estetica");
        dicionario.adicionarPalavra("Kotlin", "Linguagem moderna de programacao para a jvm");
        dicionario.exibirPalavras();

        String definicao = dicionario.buscarPalavra("Java");
        System.out.println("Java: " + definicao);

        dicionario.removerPalavra("Typescript");
        dicionario.exibirPalavras();
    }
}
        