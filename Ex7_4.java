import java.util.Scanner;
	
	class Ex7_4 {
	
	static int sumUp (int n) {
		int sumUp = 0;
		do {
			sumUp += n;
		} while (n-- > 0);
		return sumUp;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();		
		
		System.out.println("1から" + n + "の合計は" + sumUp(n) + "です。");
	}
}