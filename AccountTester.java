class AccountTester {
	
	public static void main(String[] args) {
		
		TimeAccount adachi = new TimeAccount("�����K��", "123456", 1000, 1000);
		TimeAccount nakata = new TimeAccount("���c�^��", "654321", 200, 500);
		
		System.out.println("�������N�̌���");
		System.out.println("�@�������`�F" + adachi.getName());
		System.out.println("�@�����ԍ��F" + adachi.getNo());
		System.out.println("�@�a���c���F" + adachi.getBalance());
		System.out.println("�@����a���c���F" + adachi.getTimeBalance());
		System.out.println("�@���v�c���F" + adachi.getTotalBalance());
		
		
		System.out.println("�����c�N�̌���");
		System.out.println("�@�������`�F" + nakata.getName());
		System.out.println("�@�����ԍ��F" + nakata.getNo());
		System.out.println("�@�a���c���F" + nakata.getBalance());
		System.out.println("�@����a���c���F" + nakata.getTimeBalance());
		System.out.println("�@���v�c���F" + nakata.getTotalBalance());
		
		switch (TimeAccount.compTimeBalance(adachi, nakata)) {
		case  0 : System.out.println("�����N�ƒ��c�N�̍��v�c���͓����B");
		break;
		case  1 : System.out.println("�����N�̂ق������v�c���������B");
		break;
		case -1 : System.out.println("���c�N�̂ق������v�c���������B");
		break;
		}
	}
	
	
}
