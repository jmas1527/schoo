import java.util.ArrayList;
import java.util.Scanner;

class E2_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("合計が1000を超えるまで値を読み込みます。");
		ArrayList<Double> db = new ArrayList<Double>();
		
		double sum = 0;
		
		while (true) {
			System.out.print("小数：");
			double t = stdIn.nextDouble();
			db.add(t);
			
			sum += t;

			if (sum > 1000) {
				System.out.println("合計が1000を超えました。");
				break;
			}
			
			
		}
			
		System.out.println("線形探索に移ります。");
			
		System.out.print("探す値：");
		double key = stdIn.nextDouble();
			
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