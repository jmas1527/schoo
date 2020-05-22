class Tester {
	static void intro(SRP p) {
		p.introduce();
	}
	
	static void change(SRP p) {
		p.changeSkin(Skinnable.GREEN);
	}
	
	public static void main(String[] args) {
		SRP[] a = {
				new SRP("Kurt", "�A�C"),
				new SRP("R2D2", "���[�N"),
				new SRP("�}�C�P��", "�p�j"),
		};
		
		for (SRP p : a) {
			intro(p);
			change(p);
			System.out.println();

		}
	}
}