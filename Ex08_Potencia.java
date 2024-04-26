package projetos;

/*
  8) Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.
 */

public class Ex08_Potencia {
	
	 public static void main(String[] args) {
	        int base = 2; // Você pode alterar a base aqui para testar
	        int expoente = 5; // Você pode alterar o expoente aqui para testar
	        
	        long resultado = calcularPotencia(base, expoente);
	        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	    }
	    
	    // Método para calcular a potência de um número base elevado a um expoente
	    public static long calcularPotencia(int base, int expoente) {
	        if (expoente < 0) {
	            throw new IllegalArgumentException("O expoente deve ser um número inteiro positivo.");
	        }
	        
	        long resultado = 1;
	        for (int i = 0; i < expoente; i++) {
	            resultado *= base;
	        }
	        
	        return resultado;
	    }

}
