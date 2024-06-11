package set.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean finalizado;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.finalizado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFinalido(){
        return finalizado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFinaliado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String toString(){
        return "Tarefa{" +
                "descricao= " + descricao +
                ", finalizado= " + finalizado +
                '}';
    }
}
