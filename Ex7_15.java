import java.util.Random;
import java.util.Scanner;

class Ex7_15 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		
		System.out.println("�z��num�փ����_����1�`10�܂ł̒l�������܂����B");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		int sum = sumOf(a);
		System.out.println("���v�́F" + sum);
	}
		
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
