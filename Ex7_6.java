import java.util.Scanner;
	
	class Ex7_6 {
	
	static void printSeason (int m) {
		switch (m) {
		case 3:
		case 4:
		case 5: System.out.println("�t");
				break;
		case 6:
		case 7:
		case 8: System.out.println("��");
				break;
		case 9:
		case 10:
		case 11: System.out.println("�H");
				break;
		case 12:
		case 1:
		case 2: System.out.println("�~");
				break;
		default: break; 
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�G�߂�\�����܂��B");
		System.out.print("�����ł����H�F");
		int m = stdIn.nextInt();
		
		printSeason(m);
	}
}