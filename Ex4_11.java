import java.util.Scanner;

class Ex4_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
		int x;
		
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		for (; x >= 0; x--) {
			System.out.println(x);
		}
	}
}
