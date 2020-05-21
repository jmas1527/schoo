// キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力

import java.util.Scanner;

class Ex2_3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値：");
		int x = stdIn.nextInt();
		
		System.out.println(x+"と入力しましたね。");
	}
}
