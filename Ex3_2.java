import java.util.Scanner;

class Ex3_2
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int x = stdIn.nextInt();
		
		System.out.print("����B�F");
		int y = stdIn.nextInt();
		
		if (x % y == 0)
			System.out.println("B��A�̖񐔂ł��B");
		
		else
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		
		

	}
}
