import java.util.Scanner;
public class Equation2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Solveur d'équation quadratique: ax^2 + bx + c = 0");
		System.out.println("Saisissez le coefficient a:");
		double a = scanner.nextDouble();
		System.out.println("Saisissez le coefficient b:");
		double b = scanner.nextDouble();
		System.out.println("Saisissez le coefficient c:");
		double c = scanner.nextDouble();

        scanner.close();

		double delta = b*b-4*a*c;
		if(delta >=0){
			Double x1 = (-b - Math.sqrt(delta)) / 2 *a;
			Double x2 = (-b + Math.sqrt(delta)) / 2 *a;

			System.out.println("Les solutions sont :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
		}else{
			System.out.println("Aucune vraie solution n\'existe pour les coefficients donnés.");
		}
	}
}