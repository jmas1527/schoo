import java.util.Scanner;

class TotalDistTester {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�́F");
		String name = scanner.next();
		System.out.print("�ԕ��́F");
		int width = scanner.nextInt();
		System.out.print("�����́F");
		int height = scanner.nextInt();
		System.out.print("�����́F");
		int length = scanner.nextInt();
		System.out.print("�K�\�����ʂ́F");
		double fuel = scanner.nextDouble();
		
		TotalDist totalDist = new TotalDist(name, width, height, length, fuel);
		
	    while (true) {
	    	System.out.println("���ݒn�i" + totalDist.getX() + ", " + totalDist.getY() + "�j�E�c��R�� " + totalDist.getFuel());
	    	System.out.print("�ړ����܂���[0�E�E�ENo�^1�E�E�EYes]:");
	    	if (scanner.nextInt() == 0) break;
	    	
	    	System.out.print("X�����̈ړ������F");
	    	double dx = scanner.nextDouble();
	    	System.out.print("Y�����̈ړ������F");
	    	double dy = scanner.nextDouble();
	    	
			double dist = Math.sqrt(dx * dx + dy * dy);
			
	    	if (!totalDist.move(dx, dy)) {
	    		System.out.println("�R��������܂���I");
	    	} else {
	    		System.out.print("�����s�����́F");
	    		System.out.println(totalDist.totalDist(dist));
	    	}
	    }
			
	}
}