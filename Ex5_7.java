class Ex5_7 {
	public static void main(String[] args) {
		System.out.println("  float        2æ   ");
		System.out.println("---------------------");

		for (float x = 0.0f; x <= 1.0f; x += 0.001f) {
			System.out.printf("%.7f   %.7f\n", x, (x * x));
		}
	}
}