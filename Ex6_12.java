import java.util.Random;
import java.util.Scanner;

public class Ex6_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�v�f���F");
		int yousosu = stdIn.nextInt();				// �v�f����ǂݍ���
		int[] youso = new int[yousosu];					// �z��𐶐�

		for (int i = 0; i < yousosu; i++) {
			System.out.print("youso[" + i + "] = ");
			youso[i] = stdIn.nextInt();
		}

		for (int i = 0; i < 2 * yousosu; i++) {
			int idx1 = rand.nextInt(yousosu);
			int idx2 = rand.nextInt(yousosu);
			int t = youso[idx1];
			youso[idx1] = youso[idx2];
			youso[idx2] = t;
		}

		System.out.println("�v�f�����������܂����B");
		for (int i = 0; i < yousosu; i++) {
			System.out.println("a[" + i + "] = " + youso[i]);
		}
	}

}
