package projetos;

/*
 6) Contar Vogais: Escreva uma função que conte o número de vogais em uma string.
 */

public class Ex06_Vogais {
	
	public static void main(String[] args) {
        String texto = "Hello, world!"; // Você pode alterar o texto aqui para testar
        int numVogais = contarVogais(texto);
        System.out.println("O número de vogais na string é: " + numVogais);
    }
    
    // Método para contar o número de vogais em uma string
    public static int contarVogais(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        
        int contador = 0;
        texto = texto.toLowerCase(); // Converter para minúsculas para facilitar a comparação
        
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        
        return contador;
    }
	

}
