import java.util.Scanner;

class Ex3_4
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		
		if (a != b)
			if (a > b)
				System.out.println("a�̂ق����傫���ł��B");
			else
				System.out.println("b�̂ق����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
		

	}
}
