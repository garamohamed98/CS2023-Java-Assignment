import java.util.Scanner;

class Comparaison2{

	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		
		System.out.println("Donnez le premier entier: ");
		int a = e.nextInt();

		System.out.println("Donnez le deuxième entier: ");
		int b = e.nextInt();

		e.close();

		if(a>b){
			System.out.println("Le maximum de deux entier " + a);
		}else{
			System.out.println("Le maximum de deux entier "+ b);
		}
	}

}