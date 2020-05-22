import java.util.Scanner;

class Ex4_21_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("右下直角の三角形を表示します。");
		int n;
		
		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int k = 0; k <= n - i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

