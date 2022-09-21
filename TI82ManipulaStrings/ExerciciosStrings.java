package TI82ManipulaStrings;

public class ExerciciosStrings {
    

    static int contaCaracteres() {
        String s,s1;
        System.out.println("Insira um texto");
        s = TI82ManipulaStrings.ler.next();
        s1 = TI82ManipulaStrings.ler.nextLine();
        s = s+s1;
        return s.length();
    }
}
