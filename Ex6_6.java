import java.util.Scanner;

class Ex6_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�l���F");
		int ninzu= stdIn.nextInt();
		int[] tensu = new int[ninzu];
		
		System.out.println(ninzu + "�l�̓_������͂���B");
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "�Ԃ̓_���F");
			tensu[i] = stdIn.nextInt();
		}
		
		int sum = 0;
		double ave = 0;
		int max = tensu[0];
		int min = tensu[0];
		
		for (int i = 0; i < tensu.length; i++) {
			sum += tensu[i];
		}
		System.out.println("���v�_��" + sum + "�_�ł��B");

		
		for (int i = 0; i < tensu.length; i++) {
			ave = (double) sum / tensu.length;
		}
		System.out.println("���ϓ_��" + ave + "�_�ł��B");
			
		for (int i = 0; i < tensu.length; i++) {
			if (max < tensu[i]) max = tensu[i];
		}
		System.out.println("�ō��_��" + max + "�_�ł��B");
		
		for (int i = 0; i < tensu.length; i++) {
			if (tensu[i] < min) min = tensu[i];
		}
		System.out.println("�Œ�_��" + min + "�_�ł��B");
	}
}

