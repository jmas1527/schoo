import java.util.Random;
import java.util.Scanner;

class Ex4_2
 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90)+10;
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int n;
		do {
			do {
				System.out.print("�������ȁF");
				n = stdIn.nextInt();
			} while (n < 10 || n > 99);
			
			if (n > no) {
				System.out.println("�����Ə����Ȑ�����B");
			}
			else if (n < no) {
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}
		} while (n != no);
		
		System.out.println("�����ł��B");
	}
 }
 
