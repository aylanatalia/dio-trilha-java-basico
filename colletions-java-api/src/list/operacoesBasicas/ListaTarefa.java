package list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //
    private List<Tarefa> tarefaLista;

    public ListaTarefa(){
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("Numero total de elementos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Numero total de elementos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
