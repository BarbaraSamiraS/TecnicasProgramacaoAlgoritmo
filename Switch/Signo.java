import java.util.Scanner;
public class Signo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int d, m;
        
        System.out.print("Digite o dia do seu nascimento: ");
        d = ler.nextInt();
        
        System.out.print("Digite o m�s do seu nascimento: ");
        m = ler.nextInt();

            switch (m) {
                case 1:
                    if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo � Capric�rnio");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo � Aqu�rio");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 2:
                	if  (d >= 1 && d <= 19){
                        System.out.println("Seu signo � Aqu�rio");
                    } else if ((d >= 20 && d <= 29)){
                        System.out.println("Seu signo � Peixes");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 3:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo � Peixes");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo � �ries");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 4:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo � �ries");
                    } else if ((d >= 21 && d <= 30)){
                        System.out.println("Seu signo � Touro");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 5:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo � Touro");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo � G�meos");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 6:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo � G�meos");
                    } else if ((d >= 21 && d <= 30)){
                        System.out.println("Seu signo � C�ncer");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 7:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo � C�ncer");
                    } else if ((d >= 22 && d <= 31)){
                        System.out.println("Seu signo � Le�o");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 8:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo � Le�o");
                    } else if ((d >= 23 && d <= 31)){
                        System.out.println("Seu signo � Virgem");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 9:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo � Virgem");
                    } else if ((d >= 23 && d <= 30)){
                        System.out.println("Seu signo � Libra");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 10:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo � Libra");
                    } else if ((d >= 23 && d <= 31)){
                        System.out.println("Seu signo � Escorpi�o");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 11:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo � Escorpi�o");
                    } else if ((d >= 22 && d <= 30)){
                        System.out.println("Seu signo � Sagit�rio");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 12:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo � Sagit�rio");
                    } else if ((d >= 22 && d <= 31)){
                        System.out.println("Seu signo � Capric�rnio");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                default:
                    System.out.println("M�s inv�lido");
                    break;
            }

        ler.close();
    }
}