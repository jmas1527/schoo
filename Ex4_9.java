import java.util.Scanner;

class Ex4_9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n�̒l�F");
			n = stdIn.nextInt();
		} while (n <= 0); 
		
		int seki = 1;
		int i = 1;
		while (i <= n) {
			seki *= i;
			i++;
		}
		
		System.out.print("1����" + n + "�܂ł̐ς�" + seki + "�ł��B");
	}
}
