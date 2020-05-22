class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private int number;
	
	Car(String name, int width, int height, int length, double fuel, int number) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.number = number;
		x = y = 0.0;
	}
	
	double getX() { return x; }
	double getY() { return y; }
	double getFuel() { return fuel; }
	
	void putSpec() {
		System.out.println("���O" + name);
	    System.out.println("�ԕ�" + width + "mm");
	    System.out.println("�ԍ���" + height + "mm");
	    System.out.println("�Ԓ���" + length + "mm");
	    System.out.println("�i���o�[��" + number);
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if (dist > fuel) {
			return false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}
