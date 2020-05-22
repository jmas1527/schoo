import java.util.Scanner;

class Ex4_24 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("素数であるか判断します。");
		int n;
		int retry;
		
		do {
			do {
				System.out.print("正の整数値：");
				n = stdIn.nextInt();
			} while (n <= 0);
			
			int i;
			for (i = 2; i <= n; i++) {
				if (n == i) {
					System.out.println("素数です。");
				}
				else if (n % i == 0) {
					System.out.println("素数ではありません。");
					break;
				}
			}
			System.out.print("もう一度？1…Yes／0…No：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

