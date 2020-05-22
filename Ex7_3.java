import java.util.Scanner;
	
	class Ex7_3 {
	
	static int med (int a, int b, int c) {
		int med = a;
		if ((med <= b && b <= c) || (c <= b && b <= med)) med = b;
		if ((med <= c && c <= b) || (b <= c && c <= med)) med = c;
		return med;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		System.out.print("整数値：");
		int b = stdIn.nextInt();
		System.out.print("整数値：");
		int c = stdIn.nextInt();
		
		
		System.out.println("中央値は" + med(a, b, c) + "です。");
	}
}