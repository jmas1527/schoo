import java.util.Scanner;

class Ex3_3
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("���̒l�͐��ł��B");
		
		else if (n < 0)
			System.out.println("���̒l�͕��ł��B");
		
		else if (n == 0)
		System.out.println("���̒l��0�ł��B");
		
		else
		System.out.println("�Ȃ�");
		
		// �����l����͂���R�[�h�Ȃ̂ŁA�Ō��else�͏璷�ɂȂ�B

	}
}
