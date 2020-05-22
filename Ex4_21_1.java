import java.util.Scanner;

class Ex4_21_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("左上直角の三角形を表示します。");
		int n;
		
		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n; i++) {
			for (int j = (n - i); j > 0; j--) {
				System.out.print('*');
			} System.out.println();
		}
	}
}

