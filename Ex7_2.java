import java.util.Scanner;
	
	class Ex7_2 {
	
	static int min (int a, int b, int c) {
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		System.out.print("整数値：");
		int b = stdIn.nextInt();
		System.out.print("整数値：");
		int c = stdIn.nextInt();
		
		
		System.out.println("最小値は" + min(a, b, c) + "です。");
	}
}