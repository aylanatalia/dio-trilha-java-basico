package map.pesquisar;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavra {
    private Map<String, Integer> palavrasMap;
    
    public ContagemPalavra(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem){
        palavrasMap.put(linguagem, contagem);
    }

    public void removerPalavras(String linguagem){
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(linguagem);
        }else{
            System.out.println("O map esta vasio");
        }
    }

    public int exibirContagem(){
        int contagemTotal = 0;
        for(int contagem : palavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry. getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavra contagemPalavra = new ContagemPalavra();

        contagemPalavra.adicionarPalavras("Java", 2);
        contagemPalavra.adicionarPalavras("Python", 8);
        contagemPalavra.adicionarPalavras("JavaScript", 1);
        contagemPalavra.adicionarPalavras("C#", 6);
        System.out.println("Total de palavras: " + contagemPalavra.exibirContagem());

        String linguagemMaisFrequente = contagemPalavra.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
