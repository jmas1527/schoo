import java.util.Scanner;

class Ex5_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		System.out.printf("8進数では%oです。\n", n);
		System.out.printf("16進数では%xです。", n);
	}
}