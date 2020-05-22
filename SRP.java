public class SRP extends RobotPet implements Skinnable {
	private int skin = BLACK;
	
	public SRP(String name, String masterName) {
		super(name, masterName);
	}
	
	public int getSkin() {
		return skin;
	}
	
	public void changeSkin(int skin) {
		System.out.print("�X�L�����F");
		switch (skin) {
		case BLACK:		System.out.print("����");	break;
		case RED:		System.out.print("�[�g");	break;
		case GREEN:		System.out.print("���t");	break;
		case BLUE:		System.out.print("�I��");	break;
		case LEOPARD:	System.out.print("�^��");	break;
		default:		System.out.print("���n");	break;
		}
		System.out.println("�ɕύX���܂����B");
	}
}