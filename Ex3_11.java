import java.util.Scanner;

class Ex3_11
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		
		System.out.println(a - b <= 10 || b - a <= 10 ? "�����̍���10�ȉ��ł��B" : "�����̍���11�ȏ�ł��B");

	}
}
