import java.util.Scanner;

class Ex4_25_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�������v�Z���܂��B");
		System.out.print("���v�Z���܂����F");
		int n = stdIn.nextInt();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("���v��1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum += t;
			count++;
		}

		double avg = ((double) sum / count);
		System.out.println("���v��" + sum + "�ł��B\n���ς�" + avg + "�ł��B");
	}
}