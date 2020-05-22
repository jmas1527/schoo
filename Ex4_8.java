import java.util.Scanner;

class Ex4_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("整数値：");
			n = stdIn.nextInt();
		} while (n <= 0); 
		
		int a = 0;
		while (n > 0) {
			a ++;
			n /= 10;
		}
		
		System.out.print("その値は" + a + "桁です。");
	}
}
