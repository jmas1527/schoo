import java.util.Scanner;

class Ex4_21_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
		int n;
		
		do {
			System.out.print("�i���́F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n; i++) {
			for (int j = (n - i); j > 0; j--) {
				System.out.print('*');
			} System.out.println();
		}
	}
}

