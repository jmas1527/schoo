public class WelcomeJava {
	public static void main(String[] args) {
	
		final String[] COLOR = {"��", "��", "�u���[", "��", "��", "�z���C�g", "��", "�� ��", "��"}; 
		char myName[] = {'�O', '��', '�D','��',};
		int myNameCode = 0;
		
		System.out.print("���̖��O��");
		for (int i = 0; i < myName.length; i++) {
			System.out.print(myName[i]);
			myNameCode += myName[i];
		}
		System.out.println("�ł��B");
		System.out.println("���̃l�[���R�[�h��" + myNameCode + "�ł��B");
		System.out.println("���b�L�[�J���[��" + COLOR[myNameCode % 9] + "�ł��B");
	}
}