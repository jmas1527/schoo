import java.util.Scanner;

class Ex4_24 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�f���ł��邩���f���܂��B");
		int n;
		int retry;
		
		do {
			do {
				System.out.print("���̐����l�F");
				n = stdIn.nextInt();
			} while (n <= 0);
			
			int i;
			for (i = 2; i <= n; i++) {
				if (n == i) {
					System.out.println("�f���ł��B");
				}
				else if (n % i == 0) {
					System.out.println("�f���ł͂���܂���B");
					break;
				}
			}
			System.out.print("������x�H1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

