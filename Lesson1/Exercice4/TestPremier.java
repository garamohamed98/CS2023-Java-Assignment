import java.util.Scanner;
class TestPremier{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrer un nombre entier : ");
		int input = scanner.nextInt();
        
        scanner.close();
		
		boolean isPrime = true;
		for(int i = input -1; i> 1 ;i--){
			if( input % i == 0){
				isPrime = false;
			}
		}

		if (isPrime) {
            System.out.println(input + " est un nombre premier.");
        } else {
            System.out.println(input + " n'est pas un nombre premier.");
        }

	}
}