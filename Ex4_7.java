import java.util.Scanner;

class Ex4_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("���\�����܂����F");
			n = stdIn.nextInt();
		} while (n <= 0); 
		
		if (n == 1) {
			System.out.print('*');
		} else {
			int m = n / 2;
			int i = 1;
			do {
				System.out.print('*');
				System.out.print('+');
				i++;
			} while (i <= m);
			
			if (n % 2 == 1) {
				System.out.print('*');
		}
		}
	}
}
