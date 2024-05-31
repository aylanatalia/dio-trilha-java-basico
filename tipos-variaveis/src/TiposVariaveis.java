public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        // tipos String de texto

        String meuNome = "Ayla Natalia";

        double salario = 2500;  //para representar milhares, não se deve usar o ponto

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        int numero = 1;
        numero = 2; //nos tipos int o valor da variável pode mudar
        
        final double VALOR_DE_PI = 3.14; // O final garante que a variável não será alterada
    }
}
