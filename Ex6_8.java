import java.util.Scanner;

class Ex6_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int yousosu= stdIn.nextInt();
		double[] youso = new double[yousosu];
		
		System.out.println(yousosu + "を入力せよ。");
		for (int i = 0; i < yousosu; i++) {
			System.out.print((i + 1) + "：");
			youso[i] = stdIn.nextDouble();
		}
		
		double sum = 0;
		for (double i : youso) {
			sum += i;
		}
		System.out.println("合計値：" + sum);
		
		double ave = 0;
		for (double i : youso) {
			ave = sum / yousosu;
		}
		System.out.println("平均値：" + ave);
	}
}
