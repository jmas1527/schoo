import java.util.Random;
import java.util.Scanner;

class Ex6_14 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};

		System.out.println("�p��̌�������͂��Ă��������B");
		System.out.println("�Ȃ��A�擪�͑啶���ŁA�Q�����ڈȍ~�͏������Ƃ��܂��B");

		int retry;
		int last = -1;

		do {
			int month;
			do {
				month = rand.nextInt(12);
			} while (month == last);

			while (true) {
				System.out.print((month + 1) + "���F");
				String s = stdIn.next();

				if (s.equals(monthString[month])) break;
				System.out.println("�Ⴂ�܂�");
			}
			System.out.print("�����ł��B������x�H 1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}