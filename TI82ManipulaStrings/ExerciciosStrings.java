package TI82ManipulaStrings;

public class ExerciciosStrings {
    static String s,s1;
    static void leStrings(String texto){
        String s,s1;
        System.out.println("Insira um texto");
        s = TI82ManipulaStrings.ler.next();
        s1 = TI82ManipulaStrings.ler.nextLine();
        s = s+s1;
    }

    static int contaCaracteres() {
        leStrings("insira um texto");
        return s.length();
    }

    public static void arvoreCharAt() {
        int x,y;
        
        System.out.println("Insira uma palavra");
        s = TI82ManipulaStrings.ler.next();
        s1 = TI82ManipulaStrings.ler.nextLine();
        s = s+s1;
        for(x=0;x<s.length();x++){
            for(y=0;y<=x;y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        for(x = s.length()-1; x>0;x--){
            for(y=0;y<x;y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
            
                
        

    }
}
