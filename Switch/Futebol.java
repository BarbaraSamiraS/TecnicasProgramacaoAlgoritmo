import java.util.Scanner; 
public class Futebol{
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe sua idade:");
        idade = ler.nextInt();
        
        switch(idade) {
        case 6: 
            System.out.println("Categoria: Dente de leite," +idade);
            break;
            
        case 7: 
            System.out.println("Categoria: J�nior," +idade);
            break;
            
        case 8: 
            System.out.println("Categoria: J�nior max," +idade);
            break;
            
        case 9: 
            System.out.println("Categoria: J�nior master," +idade);
            break;
            
        case 10: 
            System.out.println("Categoria: Master," +idade);
            break;
            
        default:
        	System.out.println("Idade Inv�lida ");
    	}
        ler.close(); 
            
    } 
}