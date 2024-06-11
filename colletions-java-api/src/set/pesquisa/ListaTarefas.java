package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("O conjunto esta vazio");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (t.isFinalido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (!t.isFinalido()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFinaliado(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isFinalido()){
                tarefaParaMarcarComoPendente.setFinaliado(false);
            }
        }else{
            System.out.println("Tarefa não encontrada na lista");
        }
    }

    public void limparLista(){
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já esta vazia");
        }else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar java");
        listaTarefas.adicionarTarefa("Fazer exercicios fisicos");
        listaTarefas.adicionarTarefa("Organiar a mesa");
        listaTarefas.adicionarTarefa("Ler livros");
        listaTarefas.adicionarTarefa("Preparar apresentacao");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercicios fisico");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livros");
        listaTarefas.marcarTarefaConcluida("Estudar java");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparLista();
        listaTarefas.exibirTarefas();
    }

}
