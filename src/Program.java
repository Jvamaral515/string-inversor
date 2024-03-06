import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra (ou frase): ");
		String frase = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = frase.length() - 1; i >= 0; i--) {
			sb.append(frase.charAt(i));
			
		}
		
		String inverso = sb.toString();
		System.out.println(inverso);
	}
}
