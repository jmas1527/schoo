import java.util.Scanner;

class Ex4_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1����n�܂ł̘a�����߂܂��B");
		int n;
		
		do {
			System.out.print("n�̒l�F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		int i;
		
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1����"+ n +"�܂ł̘a��" + sum + "�ł��B");
	}
}
