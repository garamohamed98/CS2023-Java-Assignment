import java.util.Scanner;

public class Factorielle2 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier :");
		int x = scanner.nextInt();

        int resultat = 1;
        int i = x;
        while(i>1){
            resultat *= i;
            i--;
        }

        System.out.println(resultat);
    }
}
