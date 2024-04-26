package projetos;
/*
 4) Calcular Média: Crie uma função que calcule a média de uma lista de números passada como parâmetro.
  
  */
 
public class Ex04_CalcularMedia {
	
	
	 public static void main(String[] args) {
	        double[] lista = {3.5, 7.2, 5.1, 8.6, 4.9}; // Você pode alterar a lista de números aqui para testar
	        double media = calcularMedia(lista);
	        System.out.println("A média dos números é: " + media);
	    }
	    
	    // Método para calcular a média de uma lista de números
	    public static double calcularMedia(double[] numeros) {
	        if (numeros == null || numeros.length == 0) {
	            throw new IllegalArgumentException("A lista de números está vazia.");
	        }
	        
	        double soma = 0;
	        for (double numero : numeros) {
	            soma += numero;
	        }
	        
	        return soma / numeros.length;
	    }
}
