import java.util.Scanner;

class Ex4_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		System.out.print("®”’lF");
		n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int a = i * i;
			System.out.println(i + "‚Ì2æ‚Í" + a);
		}
	}
}

