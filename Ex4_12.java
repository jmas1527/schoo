import java.util.Scanner;

class Ex4_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントアップします。");
		int x;
		
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int i;
		for (i = 0; x >= i; i++) {
			System.out.println(i);
		}
	}
}
