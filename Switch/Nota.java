import java.util.Scanner;
public class Nota {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String pergunta;
		int alunos, mbAluno, bAluno, rAluno, iAluno ;
		double resul;
		
		System.out.println("Quantos alunos s�o? ");
		alunos = ler.nextInt();
		
		System.out.println("De qual nota sera feita a estimativa? ");
		pergunta = ler.next();
		
		switch (pergunta) {
		case "mb":
			System.out.println("Quantos alunos tirar�o nota MB? ");
			mbAluno = ler.nextInt();
			
			resul= ((double) mbAluno/alunos)*100;
			System.out.println("A estatistica da nota MB �:" +resul+ "%");
			break;
		case "b":
			System.out.println("Quantos alunos tirar�o nota B? ");
			bAluno = ler.nextInt();
			
			resul = ((double) bAluno/alunos)*100;
			System.out.println("A estatistica da nota B �:" +resul+ "%");
			break;
		case "r":
			System.out.println("Quantos alunos tirar�o nota R? ");
			rAluno = ler.nextInt();
			
			resul = ((double) rAluno/alunos)*100;
			System.out.println("A estatistica da nota R �:" +resul+ "%");
			break;
		case "i":
			System.out.println("Quantos alunos tirar�o nota I? ");
			iAluno = ler.nextInt();
			
			resul = ((double) iAluno/alunos)*100;
			System.out.println("A estatistica da nota I �:" +resul+ "%");
			break;
		default:
			System.out.println("Men��o Inv�lida");
		}
		ler.close();
		
		
	}
}
