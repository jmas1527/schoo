import java.util.Scanner;

class Ex4_21_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�E�����p�̎O�p�`��\�����܂��B");
		int n;
		
		do {
			System.out.print("�i���́F");
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

