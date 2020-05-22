import java.util.Random;
import java.util.Scanner;

class Ex4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		final int MAX = rand.nextInt(10);
		
		System.out.println("数当てゲーム開始！！");
		System.out.println("0～99の数を" + MAX + "回で当てて下さい。");

		int x;
		int count = 0;

		Game:
		while (true) {
			if (count == MAX) {
				System.out.println("正解は" + no + "でした。\nゲームを終了します。");
				break Game;
			}

			System.out.print("いくつかな？：");
			x = stdIn.nextInt();
			count++;
			
			if (x > no) {
				if (count != MAX) {
					System.out.println("もっと小さな数だよ。");
				}
			} else if (x < no) {
				if (count != MAX) {
					System.out.println("もっと大きな数だよ。");
				}
			} else {
				System.out.println("正解です。");
				break Game;
			}
		}
	}
}