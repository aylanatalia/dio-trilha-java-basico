package map.operacoesbasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContatoPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Joao", 5665);
        agendaContatos.adicionarContato("Carlos", 111111);
        agendaContatos.adicionarContato("Ana", 654978);
        agendaContatos.adicionarContato("Maria", 111111);
        agendaContatos.adicionarContato("Camila", 44444);
        agendaContatos.exibirContato();

        agendaContatos.removerContatoPorNome("Maria");
        agendaContatos.exibirContato();

        String nomePesquisado = "João";
        Integer numeroPesquisado = agendaContatos.pesquisarPorNome("Joao");
        System.out.println("Numero de telefone de " + nomePesquisado + ": " + numeroPesquisado);

        String nomePesquisadoNãoExistente = "Paula";
        Integer numeroPesquisadoNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisadoNãoExistente);
        System.out.println("Numero de t4elefone de " + nomePesquisadoNãoExistente + ":" + numeroPesquisadoNaoExistente);
    }
}
