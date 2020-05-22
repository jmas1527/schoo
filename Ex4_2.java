import java.util.Random;
import java.util.Scanner;

class Ex4_2
 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90)+10;
		
		System.out.println("数当てゲーム開始!!");
		System.out.println("10～99の数を当ててください。");
		
		int n;
		do {
			do {
				System.out.print("いくつかな：");
				n = stdIn.nextInt();
			} while (n < 10 || n > 99);
			
			if (n > no) {
				System.out.println("もっと小さな数だよ。");
			}
			else if (n < no) {
				System.out.println("もっと大きな数だよ。");
			}
		} while (n != no);
		
		System.out.println("正解です。");
	}
 }
 
