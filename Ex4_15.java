import java.util.Scanner;

class Ex4_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("何cmから：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int y;
		do {
			System.out.print("何cmまで：");
			y = stdIn.nextInt();
		} while (y <= 0);
		
		int z;
		do {
			System.out.print("何cmごと：");
			z = stdIn.nextInt();
		} while (z <= 0);
		
		System.out.println("身長 標準体重");
		
		int b = 0;
		double c;
		
		for (int i = 0; b < y; i++) {
			b = x + z * i;
			c = (b - 100) * 0.9;
			System.out.println(b + "　" + c);
		}
	}
}
