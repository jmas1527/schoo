import java.util.Scanner;

class Ex4_25_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を計算します。");
		System.out.print("何個計算しますか：");
		int n = stdIn.nextInt();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("整数(0で終了)：");
			int t = stdIn.nextInt();
			if (t == 0) {
				break;
			}
			sum += t;
			count++;
		}
		double avg = ((double) sum / count);
		System.out.println("合計は" + sum + "です。\n平均は" + avg + "です。");
	}
}