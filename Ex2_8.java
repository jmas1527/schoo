import java.util.Scanner;
import java.util.Random;

class Ex2_8
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値=");

		int x = stdIn.nextInt();
		
		Random rand = new Random();
		
		int y = x + rand.nextInt(10)-5;
		
		System.out.println("その値の±5の乱数を生成しました。それは"+y+"です。");

	}
}
