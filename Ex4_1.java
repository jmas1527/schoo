import java.util.Scanner;

class Ex4_1
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("�����F");
			int n = stdIn.nextInt();
			
			if (n > 0) {
				System.out.println("���̒l�͐��ł��B");
			}
			else if (n < 0) {
				System.out.println("���̒l�͕��ł��B");
			}
			else {
				System.out.println("���̒l��0�ł��B");
			}
			
			System.out.print("������x�H�@1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
 }
 
