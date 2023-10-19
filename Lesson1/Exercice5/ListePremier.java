import java.util.Scanner;

public class ListePremier{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre :");
		int x = scanner.nextInt();
		scanner.close();
		
		int primarysLength = 0;
		int[] primarys = new int[x];
		int notPrimarysLength = 0;
		int[] notPrimarys = new int[x];

		for(int i = 1;i < x;i++){
			boolean isPrimary = true;

			for(int j = 2; j< i/2 ;j++){
				if(i % j == 0){
					isPrimary = false;
					break;
				}
			}

			if(isPrimary){
				primarys[primarysLength] = i;
				primarysLength++;
			}else{
				notPrimarys[notPrimarysLength] = i;
				notPrimarysLength++;
			}
		}
		
		System.out.println("Nombres premiers :");

		for(int i = 0;i < primarysLength;i++){
			System.out.print(" "+ primarys[i] + " |");
		}

		System.out.println();
		System.out.println("Nombres non premiers :");

		for(int i = 0;i < notPrimarysLength;i++){
			System.out.print(" "+ notPrimarys[i] + " |");
		}
	}
}