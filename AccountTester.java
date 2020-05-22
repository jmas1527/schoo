class AccountTester {
	
	public static void main(String[] args) {
		
		TimeAccount adachi = new TimeAccount("足立幸一", "123456", 1000, 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);
		
		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());
		System.out.println("　定期預金残高：" + adachi.getTimeBalance());
		System.out.println("　合計残高：" + adachi.getTotalBalance());
		
		
		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
		System.out.println("　定期預金残高：" + nakata.getTimeBalance());
		System.out.println("　合計残高：" + nakata.getTotalBalance());
		
		switch (TimeAccount.compTimeBalance(adachi, nakata)) {
		case  0 : System.out.println("足立君と仲田君の合計残高は同じ。");
		break;
		case  1 : System.out.println("足立君のほうが合計残高が多い。");
		break;
		case -1 : System.out.println("仲田君のほうが合計残高が多い。");
		break;
		}
	}
	
	
}
