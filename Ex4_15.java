import java.util.Scanner;

class Ex4_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("��cm����F");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int y;
		do {
			System.out.print("��cm�܂ŁF");
			y = stdIn.nextInt();
		} while (y <= 0);
		
		int z;
		do {
			System.out.print("��cm���ƁF");
			z = stdIn.nextInt();
		} while (z <= 0);
		
		System.out.println("�g�� �W���̏d");
		
		int b = 0;
		double c;
		
		for (int i = 0; b < y; i++) {
			b = x + z * i;
			c = (b - 100) * 0.9;
			System.out.println(b + "�@" + c);
		}
	}
}
