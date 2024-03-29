import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int codigo;
		
		System.out.println("Qual é o seu codigo? ");
		codigo = ler.nextInt();
		
		switch(codigo) {
		case 1: 
			System.out.println("Descrição: Cachorro-Quente");
			System.out.println("Valor: R$ 8,00");
			break;
		case 2:
			System.out.println("Descrição: Cheeseburger");
			System.out.println("Valor: R$ 12,00");
			break;
		case 3:
			System.out.println("Descrição: X-Salada");
			System.out.println("Valor: R$ 15,00");
			break;
		case 4:
			System.out.println("Descrição: Misto Quente");
			System.out.println("Valor: R$ 11,00");
			break;
		case 5:
			System.out.println("Descrição: Pão na chapa");
			System.out.println("Valor: R$ 6,00");
			break;
			default:
				System.out.println("Código Inválido");
		}
		
		ler.close();
		
	}
}
