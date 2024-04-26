package projetos;

public class Ex02_Fatorial {
	
	 public static void main(String[] args) {
	        int numero = 5; // Você pode alterar o número aqui para testar
	        long resultado = calcularFatorial(numero);
	        System.out.println("O fatorial de " + numero + " é: " + resultado);
	    }
	    
	    // Método para calcular o fatorial de um número
	    public static long calcularFatorial(int num) {
	        if (num < 0) {
	            throw new IllegalArgumentException("O número deve ser positivo.");
	        }
	        long fatorial = 1;
	        for (int i = 1; i <= num; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }

}
