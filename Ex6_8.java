import java.util.Scanner;

class Ex6_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int yousosu= stdIn.nextInt();
		double[] youso = new double[yousosu];
		
		System.out.println(yousosu + "����͂���B");
		for (int i = 0; i < yousosu; i++) {
			System.out.print((i + 1) + "�F");
			youso[i] = stdIn.nextDouble();
		}
		
		double sum = 0;
		for (double i : youso) {
			sum += i;
		}
		System.out.println("���v�l�F" + sum);
		
		double ave = 0;
		for (double i : youso) {
			ave = sum / yousosu;
		}
		System.out.println("���ϒl�F" + ave);
	}
}
