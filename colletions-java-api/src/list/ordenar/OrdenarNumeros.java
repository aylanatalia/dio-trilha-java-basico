package list.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {
    //atributos
    private List<Integer> numerosLista;

    //construtor
    public OrdenarNumeros(){
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosLista.add(numero);
    }

    public List<Integer> ordenarCrescente(){
        List<Integer> numerosCrescentes = new ArrayList<>(this.numerosLista);
        if (!numerosLista.isEmpty()) {
            Collections.sort(numerosCrescentes);
            return numerosCrescentes;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDecrescente(){
        List<Integer> numerosCrescentes = new ArrayList<>(this.numerosLista);
        if (!numerosLista.isEmpty()) {
            numerosCrescentes.sort(Collections.reverseOrder());
            return numerosCrescentes;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros(){
        if (!numerosLista.isEmpty()) {
            System.out.println(this.numerosLista);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        //criando uma instancia de classe
        OrdenarNumeros numeros = new OrdenarNumeros();

        //adicionando numeros na lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // exibir lista de numeros adicionados
        numeros.exibirNumeros();

        //ordenar crescente
        System.out.println(numeros.ordenarCrescente());

        //exibindo a lista
        numeros.exibirNumeros();

        // ordenar decrescente
        System.out.println(numeros.ordenarDecrescente());

        //exibir lista
        numeros.exibirNumeros();
    }
}
