import java.util.ArrayList;
import java.util.Scanner;

class E2_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���v��1000�𒴂���܂Œl��ǂݍ��݂܂��B");
		ArrayList<Double> db = new ArrayList<Double>();
		
		double sum = 0;
		
		while (true) {
			System.out.print("�����F");
			double t = stdIn.nextDouble();
			db.add(t);
			
			sum += t;

			if (sum > 1000) {
				System.out.println("���v��1000�𒴂��܂����B");
				break;
			}
			
			
		}
			
		System.out.println("���`�T���Ɉڂ�܂��B");
			
		System.out.print("�T���l�F");
		double key = stdIn.nextDouble();
			
		int j;
		for(j = db.size() - 1; j >= 0; j--) {
			if(db.get(j) == key) {
				break;
			}
		}
			
		if ( j < db.size()) {
			System.out.println("�����" + j + "�ڂɂ���܂��B");
		} else {
			System.out.println("����͂���܂���B");
		}
	}
}