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
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();		
		
		System.out.println("1����" + n + "�̍��v��" + sumUp(n) + "�ł��B");
	}
}