import java.util.Scanner;

class Ex8_2 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("�Ԃ̃f�[�^����͂���B");
		
		System.out.print("���O�́F");
		String name = stdIn.next();
		
	    System.out.print("�ԕ��́F");
	    int width = stdIn.nextInt();
	    
	    System.out.print("�����́F");
	    int height = stdIn.nextInt();
	    
	    System.out.print("�����́F");
	    int length = stdIn.nextInt();
	    
	    System.out.print("�̏d(kg)�́F");
	    double fuel = stdIn.nextDouble();
	    
	    System.out.print("�i���o�[�́F");
	    int number = stdIn.nextInt();
	    
	    Car myCar = new Car(name, width, height, length, fuel, number);
	    	    
	    while (true) {
	    	System.out.println("���ݒn�i" + myCar.getX() + ", " + myCar.getY() + "�j�E�c��R�� " + myCar.getFuel());
	    	System.out.print("�ړ����܂���[0�E�E�ENo�^1�E�E�EYes]:");
	    	if (stdIn.nextInt() == 0) break;
	    	
	    	System.out.print("X�����̈ړ������F");
	    	double dx = stdIn.nextDouble();
	    	System.out.print("Y�����̈ړ������F");
	    	double dy = stdIn.nextDouble();
	    	
	    	if (!myCar.move(dx, dy))
	    		System.out.println("�R��������܂���I");
	    }
	}
}
