class Ex6_2 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for (int i = 0, j = 5; i < a.length; i++, j--) {
			a[i] = j;
			System.out.println("a[" + i + "] = " + j);
		}
	}
}
