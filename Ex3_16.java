import java.util.Scanner;

class Ex3_16
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");	int a = stdIn.nextInt();
		System.out.print("�����l�F");	int b = stdIn.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");

	}
}
