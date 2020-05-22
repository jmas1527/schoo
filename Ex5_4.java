import java.util.Scanner;

class Ex5_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("3つの整数値の合計と平均を計算します。");

		System.out.print("整数値a：");
		int a = stdIn.nextInt();

		System.out.print("整数値b：");
		int b = stdIn.nextInt();

		System.out.print("整数値c：");
		int c = stdIn.nextInt();

		int sum = (a + b + c);
		double avg = (sum / 3.0);

		System.out.println("合計は" + sum + "です。平均は" + avg + "です。");
	}
}