class Tester {
	static void intro(SRP p) {
		p.introduce();
	}
	
	static void change(SRP p) {
		p.changeSkin(Skinnable.GREEN);
	}
	
	public static void main(String[] args) {
		SRP[] a = {
				new SRP("Kurt", "アイ"),
				new SRP("R2D2", "ルーク"),
				new SRP("マイケル", "英男"),
		};
		
		for (SRP p : a) {
			intro(p);
			change(p);
			System.out.println();

		}
	}
}