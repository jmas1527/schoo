import java.util.Random;
import java.util.Scanner;
	
	class Ex7_8 {
	
	static int random (int a, int b) {
		Random rand = new Random();
		int random = rand.nextInt((b - a) + a);
		return random;
		}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a以上b未満の乱数を生成します。");
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.println();
		
		if (b < a) {
			System.out.println(a);
		} else {
			int random = random (a, b);
			System.out.println(random);
		}
	}
	}