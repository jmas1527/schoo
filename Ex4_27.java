import java.util.Random;
import java.util.Scanner;

class Ex4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		final int MAX = rand.nextInt(10);
		
		System.out.println("�����ăQ�[���J�n�I�I");
		System.out.println("0�`99�̐���" + MAX + "��œ��Ăĉ������B");

		int x;
		int count = 0;

		Game:
		while (true) {
			if (count == MAX) {
				System.out.println("������" + no + "�ł����B\n�Q�[�����I�����܂��B");
				break Game;
			}

			System.out.print("�������ȁH�F");
			x = stdIn.nextInt();
			count++;
			
			if (x > no) {
				if (count != MAX) {
					System.out.println("�����Ə����Ȑ�����B");
				}
			} else if (x < no) {
				if (count != MAX) {
					System.out.println("�����Ƒ傫�Ȑ�����B");
				}
			} else {
				System.out.println("�����ł��B");
				break Game;
			}
		}
	}
}