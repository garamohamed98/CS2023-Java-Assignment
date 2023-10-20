import java.util.Scanner;

public class Comparaison3{
	public static void main(String[] args){
		int[] values = new int[3];
		Scanner e = new Scanner(System.in);

		System.out.println("Donnez le premier entier: ");
		int a = e.nextInt();
		System.out.println("Donnez le deuxième entier: ");
		int b = e.nextInt();
		System.out.println("Donnez le troisième entier: ");
		int c = e.nextInt();

        e.close();

        System.out.println("L'ordre des trois entiers est :");
		if(a < b && b<c){
			System.out.println(a+" "+b+" "+c);
		}else if(a<b && b>c){
			System.out.println(a+" "+c+" "+b);

		}else if(b<a && a<c){
			System.out.println(b+" "+a+" "+c);

		}else if(b<a && a>c){
			System.out.println(b+" "+c+" "+a);

		}else if(c<a && a<b){
			System.out.println(c+" "+a+" "+b);

		}else{
			System.out.println(c+" "+b+" "+a);

		}
	}
}