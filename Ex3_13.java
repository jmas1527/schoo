import java.util.Scanner;

class Ex3_13
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");	int a = stdIn.nextInt();
		System.out.print("�����l�F");	int b = stdIn.nextInt();
		System.out.print("�����l�F");	int c = stdIn.nextInt();
		
		int median = a;
		if ( (median <= b && b <= c) || (c <= b && b <= median) ) median = b;
		if ( (median <= c && c <= b) || (b <= c && c <= median) ) median = c;
		
		System.out.println("�����l��" + median + "�ł��B");

	}
}
