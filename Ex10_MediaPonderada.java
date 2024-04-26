package projetos;

/*
 * 10) Calcular Média Ponderada: Escreva uma função que calcule a média ponderada de três valores, onde os pesos são passados como argumentos.
 */

public class Ex10_MediaPonderada {
	
	public static void main(String[] args) {
        double valor1 = 5.0;
        double valor2 = 7.0;
        double valor3 = 8.0;
        double peso1 = 2.0; // Você pode alterar os pesos aqui para testar
        double peso2 = 3.0;
        double peso3 = 4.0;
        
        double mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
        System.out.println("A média ponderada dos valores é: " + mediaPonderada);
    }
    
    // Método para calcular a média ponderada de três valores
    public static double calcularMediaPonderada(double valor1, double valor2, double valor3,
                                                double peso1, double peso2, double peso3) {
        if (peso1 <= 0 || peso2 <= 0 || peso3 <= 0) {
            throw new IllegalArgumentException("Os pesos devem ser números positivos.");
        }
        
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / somaPesos;
        
        return mediaPonderada;
    }

}
