import java.util.Scanner;
public class Nota {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String pergunta;
		int alunos, mbAluno, bAluno, rAluno, iAluno ;
		double resul;
		
		System.out.println("Quantos alunos são? ");
		alunos = ler.nextInt();
		
		System.out.println("De qual nota sera feita a estimativa? ");
		pergunta = ler.next();
		
		switch (pergunta) {
		case "mb":
			System.out.println("Quantos alunos tirarão nota MB? ");
			mbAluno = ler.nextInt();
			
			resul= ((double) mbAluno/alunos)*100;
			System.out.println("A estatistica da nota MB é:" +resul+ "%");
			break;
		case "b":
			System.out.println("Quantos alunos tirarão nota B? ");
			bAluno = ler.nextInt();
			
			resul = ((double) bAluno/alunos)*100;
			System.out.println("A estatistica da nota B é:" +resul+ "%");
			break;
		case "r":
			System.out.println("Quantos alunos tirarão nota R? ");
			rAluno = ler.nextInt();
			
			resul = ((double) rAluno/alunos)*100;
			System.out.println("A estatistica da nota R é:" +resul+ "%");
			break;
		case "i":
			System.out.println("Quantos alunos tirarão nota I? ");
			iAluno = ler.nextInt();
			
			resul = ((double) iAluno/alunos)*100;
			System.out.println("A estatistica da nota I é:" +resul+ "%");
			break;
		default:
			System.out.println("Menção Inválida");
		}
		ler.close();
		
		
	}
}
