import java.util.Random;
import java.util.Scanner;

public class Ex6_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int yousosu = stdIn.nextInt();				// 要素数を読み込む
		int[] youso = new int[yousosu];					// 配列を生成

		for (int i = 0; i < yousosu; i++) {
			System.out.print("youso[" + i + "] = ");
			youso[i] = stdIn.nextInt();
		}

		for (int i = 0; i < 2 * yousosu; i++) {
			int idx1 = rand.nextInt(yousosu);
			int idx2 = rand.nextInt(yousosu);
			int t = youso[idx1];
			youso[idx1] = youso[idx2];
			youso[idx2] = t;
		}

		System.out.println("要素をかき混ぜました。");
		for (int i = 0; i < yousosu; i++) {
			System.out.println("a[" + i + "] = " + youso[i]);
		}
	}

}
