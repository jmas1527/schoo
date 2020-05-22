import java.util.Scanner;
	
	class Ex7_1 {
	
	static int signOf (int n) {
		int signOf = n;
		if (signOf > 0) signOf = 1;
		if (signOf == 0) signOf = 0;
		if (signOf < 0) signOf = -1;
		return signOf;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println();
		int n = stdIn.nextInt();
		
		System.out.println(signOf(n));
	}
}