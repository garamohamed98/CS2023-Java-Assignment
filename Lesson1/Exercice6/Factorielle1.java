import java.util.Scanner;

class Factorielle1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier :");
		int x = scanner.nextInt();
        scanner.close();

        int resultat = 1;
        for(int i = x; i>1; i--){
            resultat *= i;
        }

        System.out.println(resultat);
    }
}