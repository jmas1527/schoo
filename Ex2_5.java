// キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力

import java.util.Scanner;

class Ex2_5 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
	}
}
