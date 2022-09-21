package TI82ManipulaStrings;
import java.util.Scanner;

public class TI82ManipulaStrings {
    public static Scanner ler = new Scanner (System.in);
    
        public static void main(String[] args){
        int op;
        do{
            System.out.println("1 - Tamanho String");


            System.out.println("0 - Sair");
            System.out.println("Insira a opçao pretendida");
            op=ler.nextInt();
            switch (op) {
                case 0:
                    
                    break;
            
                case 1:
                System.out.println("A string inserida tem: "+ExerciciosStrings.contaCaracteres()+"Caracteres");
                /* int t = ExerciciosStrings.contaCaracteres();
                 * System.out.println("A string inserida tem: "+t+"caracteres");
                  */
                    break;
                default:
                    System.out.println("Insira opção Valida");
                    
            }
        } while(op!=0);
    }
}
