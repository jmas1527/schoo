import java.util.Scanner;

class Ex4_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		System.out.print("®”’lF");
		n = stdIn.nextInt();
		
		int i;
		int a = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				a++;
			}
		}
		System.out.println("–ñ”‚Í" + a + "ŒÂ‚Å‚·B");
	}
}

