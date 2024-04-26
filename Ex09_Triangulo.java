package projetos;
import java.util.Scanner;

/*
 * 9) Verificar Triângulo: Implemente um método que receba três números inteiros como argumentos e retorne verdadeiro
 *  se eles podem ser os comprimentos dos lados de um triângulo, e falso caso contrário.
 */
public class Ex09_Triangulo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int lado1 = 3; // Você pode alterar os lados aqui para testar
        int lado2 = 4;
        int lado3 = 5;
        
        boolean resultado = verificarTriangulo(lado1, lado2, lado3);
        
        if (resultado) {
            System.out.println("Os lados " + lado1 + ", " + lado2 + ", " + lado3 + " podem formar um triângulo.");
        } else {
            System.out.println("Os lados " + lado1 + ", " + lado2 + ", " + lado3 + " não podem formar um triângulo.");
        }
    }
    
    // Método para verificar se os comprimentos dos lados formam um triângulo
    public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
        // Condição de existência de um triângulo:
        // A soma de dois lados quaisquer deve ser maior que o terceiro lado
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
