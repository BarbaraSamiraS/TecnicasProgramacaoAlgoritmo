import java.util.Scanner;
public class Signo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int d, m;
        
        System.out.print("Digite o dia do seu nascimento: ");
        d = ler.nextInt();
        
        System.out.print("Digite o mês do seu nascimento: ");
        m = ler.nextInt();

            switch (m) {
                case 1:
                    if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo é Capricórnio");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo é Aquário");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 2:
                	if  (d >= 1 && d <= 19){
                        System.out.println("Seu signo é Aquário");
                    } else if ((d >= 20 && d <= 29)){
                        System.out.println("Seu signo é Peixes");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 3:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo é Peixes");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo é Áries");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 4:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo é Áries");
                    } else if ((d >= 21 && d <= 30)){
                        System.out.println("Seu signo é Touro");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 5:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo é Touro");
                    } else if ((d >= 21 && d <= 31)){
                        System.out.println("Seu signo é Gêmeos");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 6:
                	if  (d >= 1 && d <= 20){
                        System.out.println("Seu signo é Gêmeos");
                    } else if ((d >= 21 && d <= 30)){
                        System.out.println("Seu signo é Câncer");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 7:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo é Câncer");
                    } else if ((d >= 22 && d <= 31)){
                        System.out.println("Seu signo é Leão");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 8:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo é Leão");
                    } else if ((d >= 23 && d <= 31)){
                        System.out.println("Seu signo é Virgem");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 9:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo é Virgem");
                    } else if ((d >= 23 && d <= 30)){
                        System.out.println("Seu signo é Libra");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 10:
                	if  (d >= 1 && d <= 22){
                        System.out.println("Seu signo é Libra");
                    } else if ((d >= 23 && d <= 31)){
                        System.out.println("Seu signo é Escorpião");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 11:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo é Escorpião");
                    } else if ((d >= 22 && d <= 30)){
                        System.out.println("Seu signo é Sagitário");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                case 12:
                	if  (d >= 1 && d <= 21){
                        System.out.println("Seu signo é Sagitário");
                    } else if ((d >= 22 && d <= 31)){
                        System.out.println("Seu signo é Capricórnio");
                    }else {
                    	System.out.println("Dia invalido");
                    }
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }

        ler.close();
    }
}