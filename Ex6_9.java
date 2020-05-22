import java.util.Scanner;
import java.util.Random;

class Ex6_9 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int yousosu= stdIn.nextInt();
		int[] youso = new int[yousosu];
		
		for (int i = 0; i < yousosu; i++) {
			youso[i] = 1 + rand.nextInt(10);
			System.out.println("a[" + i + "] = " + youso[i]);
		}
	}
}

