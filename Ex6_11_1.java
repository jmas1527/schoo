import java.util.Random;
import java.util.Scanner;

public class Ex6_11_1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int yousosu;
		do {
			System.out.print("�v�f���F");
			yousosu = stdIn.nextInt();				// �v�f����ǂݍ���
		} while (yousosu > 10);
		int[] youso = new int[yousosu];					// �z��𐶐�

		for (int i = 0; i < yousosu; i++) {
			int j;
			do {
				j = 0;
				youso[i] = 1 + rand.nextInt(10);
				for ( ; j < i; j++)
					if (youso[j] == youso[i]) break;
			} while (j < i);
		}

		for (int i = 0; i < yousosu; i++) {
			System.out.println("a[" + i + "] = " + youso[i]);
		}
	}

}
