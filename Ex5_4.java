import java.util.Scanner;

class Ex5_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("3�̐����l�̍��v�ƕ��ς��v�Z���܂��B");

		System.out.print("�����la�F");
		int a = stdIn.nextInt();

		System.out.print("�����lb�F");
		int b = stdIn.nextInt();

		System.out.print("�����lc�F");
		int c = stdIn.nextInt();

		int sum = (a + b + c);
		double avg = (sum / 3.0);

		System.out.println("���v��" + sum + "�ł��B���ς�" + avg + "�ł��B");
	}
}