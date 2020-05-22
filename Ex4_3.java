import java.util.Scanner;

class Ex4_3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”F");	int max = stdIn.nextInt();
		System.out.print("®”F");	int min = stdIn.nextInt();
		
		if (max < min) {
			int t = max;
			max = min;
			min = t;
		}
		
		int a = min;
		do {
			System.out.print(a);
			a = a + 1;
			System.out.print(" ");
		} while (a < max);
		
		System.out.print(a);
	}
}
