import java.util.Scanner;
import java.util.Random;

class Ex6_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		final int n = 12;
		int[] a = new int[n];
		
		for (int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}
		
			System.out.print("�z��a�̑S�v�f�̒l\n{ ");
				for (int j = 0; j < n; j++) {
					System.out.print(a[j] + " ");
				}
				System.out.println("}");
		
		System.out.print("�T���l�F");
		int key = stdIn.nextInt();
		
		int i;
		for (i = n - 1; i >= 0; i--) {
			if (a[i] == key)
			break;
		}
		
		if (i < n) {
			System.out.println("�����a[" + i + "]�ɂ���܂��B");
		} else {
			System.out.println("����͂���܂���B");
		}
	}
}

