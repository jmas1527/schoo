import java.util.Scanner;

class Ex3_1
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		int y;
		
		if (x < 0)
			y = x * -1;
		else
			y = x;
		
		System.out.print("���̐�Βl��" + y + "�ł��B");
		

	}
}
