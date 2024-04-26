package projetos;

/*1)Verificar Número Primo:
Crie um método que receba um número inteiro
como argumento e retorne verdadeiro se o número for primo, e falso caso contrário.
*/

public class Ex01_NumeroPrimo {
	
	public static void main(String[] args) {
        int numero = 17; // Você pode alterar o número aqui para testar
        boolean resultado = ehPrimo(numero);
        
        
        if (resultado) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
    
    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


}
