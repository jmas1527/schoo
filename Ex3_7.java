import java.util.Scanner;

class Ex3_7
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���̐����l�F");
		int a = stdIn.nextInt();
		
		if (a > 0)
			if (a % 3 == 0)
				System.out.println("���̒l��3�Ŋ���؂�܂��B");
				else if (a % 3 == 1)
					System.out.println("���̒l��3�Ŋ������]���1�ł��B");
				else
					System.out.println("���̒l��3�Ŋ������]���2�ł��B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");
		

	}
}
