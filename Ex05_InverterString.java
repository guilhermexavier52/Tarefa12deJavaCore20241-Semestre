package projetos;

public class Ex05_InverterString {
	/*
	 5) Inverter String: Implemente um método que inverta uma string passada como argumento.
	 */
	public static void main(String[] args) {
        String texto = "Hello, world!"; // Você pode alterar o texto aqui para testar
        String textoInvertido = inverterString(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }
    
    // Método para inverter uma string
    public static String inverterString(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("A string passada está vazia ou nula.");
        }
        
        char[] caracteres = texto.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }

}
