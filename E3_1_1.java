import java.util.ArrayList;
import java.util.Scanner;

class E3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Double> db = inputDataUntil1000();
		
		System.out.println("���`�T���Ɉڂ�܂��B");
		System.out.print("�T���l�F");
		double key = stdIn.nextDouble();
		
		linerSerchR(key, db);
	}
	
	static ArrayList<Double> inputDataUntil1000 () {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���v��1000�𒴂���܂Œl��ǂݍ��݂܂��B");
		
		int idx = 0;
		ArrayList<Double> a = new ArrayList<Double>(); 

		double sum = 0;
		
		while (true) {
			System.out.print("�����F");
			double t = stdIn.nextDouble();
			a.add(t);
			
			sum += t;

			if (sum > 1000) {
				System.out.println("���v��1000�𒴂��܂����B");
				break;
			}
		}
		return a;
	}
	
	static void linerSerchR(double key, ArrayList<Double> db) {
		
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