import java.util.Scanner;

class Ex4_25_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を計算します。");
		System.out.print("何個計算しますか：");
		int n = stdIn.nextInt();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1000を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum += t;
			count++;
		}

		double avg = ((double) sum / count);
		System.out.println("合計は" + sum + "です。\n平均は" + avg + "です。");
	}
}