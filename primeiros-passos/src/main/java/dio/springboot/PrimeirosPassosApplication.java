package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);

		//Calculadora calculadora = new Calculadora(); // para aplicar os conceitos de springboot, não se usa o conceito new
		//System.out.println("Resultado= " + calculadora.somar(2, 7));

		
	}

}
