package projetos;

	/*
	 * 7) Verificar Ano Bissexto: Desenvolva um método que determine se um ano é bissexto ou não.
	 */

public class Ex07_AnoBissexto {
	
	public static void main(String[] args) {
        int ano = 2024; // Você pode alterar o ano aqui para testar
        boolean ehBissexto = verificarAnoBissexto(ano);
        
        if (ehBissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
    
    // Método para verificar se um ano é bissexto
    public static boolean verificarAnoBissexto(int ano) {
        // Um ano é bissexto se for divisível por 4, exceto se for divisível por 100,
        // a menos que também seja divisível por 400
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

}
