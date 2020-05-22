class TotalDist extends Car {
	
	private double totalDist = 0;
	
	TotalDist(String name, int width, int height, int length, double fuel) {
		super(name, width, height, length, fuel);
	}
	
	public double totalDist(double dist) {
		totalDist += dist;
		return totalDist;
	}
}