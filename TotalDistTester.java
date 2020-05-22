import java.util.Scanner;

class TotalDistTester {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("車のデータを入力せよ。");
		System.out.print("名前は：");
		String name = scanner.next();
		System.out.print("車幅は：");
		int width = scanner.nextInt();
		System.out.print("高さは：");
		int height = scanner.nextInt();
		System.out.print("長さは：");
		int length = scanner.nextInt();
		System.out.print("ガソリン量は：");
		double fuel = scanner.nextDouble();
		
		TotalDist totalDist = new TotalDist(name, width, height, length, fuel);
		
	    while (true) {
	    	System.out.println("現在地（" + totalDist.getX() + ", " + totalDist.getY() + "）・残り燃料 " + totalDist.getFuel());
	    	System.out.print("移動しますか[0・・・No／1・・・Yes]:");
	    	if (scanner.nextInt() == 0) break;
	    	
	    	System.out.print("X方向の移動距離：");
	    	double dx = scanner.nextDouble();
	    	System.out.print("Y方向の移動距離：");
	    	double dy = scanner.nextDouble();
	    	
			double dist = Math.sqrt(dx * dx + dy * dy);
			
	    	if (!totalDist.move(dx, dy)) {
	    		System.out.println("燃料が足りません！");
	    	} else {
	    		System.out.print("総走行距離は：");
	    		System.out.println(totalDist.totalDist(dist));
	    	}
	    }
			
	}
}