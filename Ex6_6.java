import java.util.Scanner;

class Ex6_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数：");
		int ninzu= stdIn.nextInt();
		int[] tensu = new int[ninzu];
		
		System.out.println(ninzu + "人の点数を入力せよ。");
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn.nextInt();
		}
		
		int sum = 0;
		double ave = 0;
		int max = tensu[0];
		int min = tensu[0];
		
		for (int i = 0; i < tensu.length; i++) {
			sum += tensu[i];
		}
		System.out.println("合計点は" + sum + "点です。");

		
		for (int i = 0; i < tensu.length; i++) {
			ave = (double) sum / tensu.length;
		}
		System.out.println("平均点は" + ave + "点です。");
			
		for (int i = 0; i < tensu.length; i++) {
			if (max < tensu[i]) max = tensu[i];
		}
		System.out.println("最高点は" + max + "点です。");
		
		for (int i = 0; i < tensu.length; i++) {
			if (tensu[i] < min) min = tensu[i];
		}
		System.out.println("最低点は" + min + "点です。");
	}
}

