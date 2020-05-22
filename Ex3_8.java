import java.util.Scanner;

class Ex3_8
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("“_”F");
		int a = stdIn.nextInt();
		
		if (a >= 80 && a <= 100)
			System.out.println("—D");
		else if (a >= 70 && a <= 79)
			System.out.println("—Ç");
		else if (a >= 60 && a <= 69)
			System.out.println("‰Â");
		else if (a <= 59)
			System.out.println("•s‰Â");
		

	}
}
