import java.util.Scanner;
import java.util.Random;

class Ex6_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêîÅF");
		int yousosu= stdIn.nextInt();
		int[] youso = new int[yousosu];
		
		for (int i = 0; i < yousosu; i++) {
			if (i == 0) {
				youso[i] = 1 + rand.nextInt(10);
			} else if (i > 0) {
				do {
					youso[i] = 1 + rand.nextInt(10);
				} while (youso[i] == youso[i - 1]);
			}
			System.out.println(youso[i]);
		}
	}
}

