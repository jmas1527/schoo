import java.util.Scanner;

class Ex4_25_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�������v�Z���܂��B");
		System.out.print("���v�Z���܂����F");
		int n = stdIn.nextInt();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("����(0�ŏI��)�F");
			int t = stdIn.nextInt();
			if (t == 0) {
				break;
			}
			sum += t;
			count++;
		}
		double avg = ((double) sum / count);
		System.out.println("���v��" + sum + "�ł��B\n���ς�" + avg + "�ł��B");
	}
}