import java.util.Scanner;
public class Peso {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo;
		int r=1;
		double peso, pesoIdeal;
        
        do {
        	System.out.print("Qual � o seu sexo? (f ou m) ");
            sexo = ler.next();
            
            System.out.print("Qual � seu peso ");
            peso = ler.nextDouble();
            
        	if(sexo.equalsIgnoreCase("f")) {
        		pesoIdeal = 52+(0.67*(peso-152.4));
        		System.out.println("O seu peso ideal �:" +pesoIdeal);
        		System.out.println("Deseja continuar a execu��o? (1-para SIM ou 2-para N�O)");
                r = ler.nextInt();
                
        	}else if(sexo.equalsIgnoreCase("m")) {
        		pesoIdeal = 52+(0.75*(peso-152.4));
        		System.out.println("O seu peso ideal �:" +pesoIdeal);
        		System.out.println("Deseja continuar a execu��o? (1-para SIM ou 2-para N�O)");
                r = ler.nextInt();
        	}else {
        		System.out.println("Informa��es invalidas! ");
        		System.out.println("Tente novamente escrevendo (f ou m) ");
        	}
        	
        }while(r==1);
        System.out.println("Execu��o Concluida!");
		
		ler.close();
	}
}
