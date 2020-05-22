import java.util.ArrayList;
import java.util.Scanner;

class E3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Double> db = inputDataUntil1000();
		
		System.out.println("線形探索に移ります。");
		System.out.print("探す値：");
		double key = stdIn.nextDouble();
		
		linerSerchR(key, db);
	}
	
	static ArrayList<Double> inputDataUntil1000 () {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("合計が1000を超えるまで値を読み込みます。");
		
		int idx = 0;
		ArrayList<Double> a = new ArrayList<Double>(); 

		double sum = 0;
		
		while (true) {
			System.out.print("小数：");
			double t = stdIn.nextDouble();
			a.add(t);
			
			sum += t;

			if (sum > 1000) {
				System.out.println("合計が1000を超えました。");
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
			System.out.println("それは" + j + "個目にあります。");
		} else {
			System.out.println("それはありません。");
		}
	}
}