package projetos;
	/*
3) Verificar Palíndromo: Desenvolva um método que receba uma string como entrada e retorne verdadeiro
 se ela for um palíndromo (ou seja, se ela pode ser lida da mesma forma de trás para frente), e falso caso contrário.
	*/

public class Ex03_Palíndromo {
	
	 public static void main(String[] args) {
	        String texto = "arara"; // Você pode alterar o texto aqui para testar
	        boolean resultado = ehPalindromo(texto);
	        
	        if (resultado) {
	            System.out.println("'" + texto + "' é um palíndromo.");
	        } else {
	            System.out.println("'" + texto + "' não é um palíndromo.");
	        }
	    }
	    
	    // Método para verificar se uma string é um palíndromo
	    public static boolean ehPalindromo(String texto) {
	        int esquerda = 0;
	        int direita = texto.length() - 1;
	        
	        while (esquerda < direita) {
	            if (texto.charAt(esquerda) != texto.charAt(direita)) {
	                return false;
	            }
	            esquerda++;
	            direita--;
	        }
	        return true;
	    }

}
