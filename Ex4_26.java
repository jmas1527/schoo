import java.util.Scanner;

class Ex4_26 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = stdIn.nextInt();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count++;
		}
		
		double avg = (double) sum / count;
		System.out.println("���v��" + sum + "�ł��B���ς�" + avg + "�ł��B");

	}
}