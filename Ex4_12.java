import java.util.Scanner;

class Ex4_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�J�E���g�A�b�v���܂��B");
		int x;
		
		do {
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int i;
		for (i = 0; x >= i; i++) {
			System.out.println(i);
		}
	}
}
