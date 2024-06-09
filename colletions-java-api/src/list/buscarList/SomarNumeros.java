package list.buscarList;
import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
    //atributos
    private List<Integer> numeros;

    //construtor
    public SomarNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int numeroMaior = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros){
                if (numero >= numeroMaior) {
                    numeroMaior = numero;
                }
            }
            return numeroMaior;
        }else{
            throw  new RuntimeException("A lista esta vazia");
        }
    }

    public int encontrarMenorNumero(){
        int numeroMenor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros){
                if ( numero <= numeroMenor) {
                    numeroMenor = numero;
                }
            }
            return numeroMenor;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        // criando uma instacia de numero
        SomarNumeros somarNumeros = new SomarNumeros();

        //adicionando numeros a lista
        somarNumeros.adicionarNumeros(5);
        somarNumeros.adicionarNumeros(0);
        somarNumeros.adicionarNumeros(0);
        somarNumeros.adicionarNumeros(-2);
        somarNumeros.adicionarNumeros(10);

        //exibir lista de numeros
        System.out.println("Números adicionados: ");
        somarNumeros.exibirNumeros();

        //calculando e exibindo a soma dos numeros
        System.out.println("Soma dos numeros igual a :" + somarNumeros.calcularSoma());

        //encontrando e exibindo o maior numero
        System.out.println("Maior numero= " + somarNumeros.encontrarMaiorNumero());

        //encontrando e exibindo o menor numero
        System.out.println("O menor numero= " + somarNumeros.encontrarMenorNumero());
    }
}
