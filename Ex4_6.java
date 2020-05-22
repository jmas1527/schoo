import java.util.Scanner;

class Ex4_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
			n = stdIn.nextInt();
		} while (n <= 0); 
		
		int i = 1;
		while (i <= n) {
			System.out.print('*');
			i++;
		}
	}
}
