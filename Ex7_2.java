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
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		System.out.print("�����l�F");
		int c = stdIn.nextInt();
		
		
		System.out.println("�ŏ��l��" + min(a, b, c) + "�ł��B");
	}
}