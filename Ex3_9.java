import java.util.Scanner;

class Ex3_9
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		
		System.out.println("�傫���ق��̒l��" + ( a > b ? a : b) + "�ł��B");

	}
}
