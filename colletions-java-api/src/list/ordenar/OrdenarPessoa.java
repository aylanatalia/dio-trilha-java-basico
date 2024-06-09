package list.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoa {
    //atributo
    private List<Pessoa> pessoaLista;

    public OrdenarPessoa(){
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaLista);
        Collections.sort(pessoaPorAltura, new CompararPessoasPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenarPessoa ordenarPessoa = new OrdenarPessoa();

        ordenarPessoa.adicionarPessoa("Ayla", 24, 1.88);
        ordenarPessoa.adicionarPessoa("Jocimari", 44, 1.77);
        ordenarPessoa.adicionarPessoa("Felipe", 18, 1.82);
        ordenarPessoa.adicionarPessoa("Luis", 23, 1.83);

        System.out.println(ordenarPessoa.pessoaLista);
        System.out.println(ordenarPessoa.ordenarPorIdade());
        System.out.println(ordenarPessoa.ordenarPorAltura());
    }
}

 
