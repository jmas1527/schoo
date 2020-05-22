import java.util.Scanner;

class Ex3_18
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”F");
		int x = stdIn.nextInt();
		
		switch (x) {
			case 3 : 
			case 4 : 
			case 5 : System.out.print("t");
					 break;
			case 6 : 
			case 7 : 
			case 8 : System.out.print("‰Ä");
					 break;
			case 9 : 
			case 10 : 
			case 11 : System.out.print("H");
					  break;
			case 12 : 
			case 1 : 
			case 2 : System.out.print("“~");
					 break;
		}
	}
 }
 
