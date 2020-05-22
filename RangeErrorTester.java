import java.util.Scanner;

public class RangeErrorTester {
	
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}
	
	static int add(int a, int b) {
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ResultRangeError(result);
		return result;
	}
	
	public static void main(String[] args ) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		try {
			System.out.println("それらの和は" + add(a, b) + "です。");
		} catch (RangeError e) {
			if (e instanceof ParameterRangeError) {
				System.out.println("加える数が範囲外です。" + e.getMessage());
			} else {
				System.out.println("計算結果が範囲外です。" + e.toString());
			}
		}
	}
}