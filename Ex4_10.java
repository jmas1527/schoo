import java.util.Scanner;

class Ex4_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("����*��\�����܂����F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
	}
}
