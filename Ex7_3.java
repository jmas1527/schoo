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
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		System.out.print("�����l�F");
		int c = stdIn.nextInt();
		
		
		System.out.println("�����l��" + med(a, b, c) + "�ł��B");
	}
}