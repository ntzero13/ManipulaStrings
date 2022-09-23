package TI82ManipulaStrings;

public class ExerciciosStrings {
    static String s,s1;

    static void leStrings(String texto){
        System.out.println(texto);
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

    public static void capitalizaLetras() {
        
        leStrings("Insira um texto");
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());




        
        


        
    }
}
