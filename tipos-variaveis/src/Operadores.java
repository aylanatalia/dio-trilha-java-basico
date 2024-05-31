public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "Linguagem" + "Java"; // concatena duas palavras
        
        int numero = 5;

        numero = - numero; //alterar o valor da variável principal

        //System.out.println(- numero); //imprime negativo, mas não altera a varável principall

        numero = numero * -1; // transformar número em positivo

        int valor = 5;
         //adiciona 1 
        //System.out.println(++ valor);  // se usar o -- ele subrtrai 1


        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";  // operador ternario que é uma operação booleana

        System.out.println(resultado);
    }
}
