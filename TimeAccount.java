class TimeAccount {
	private String name;
	private String no;
	private long balance;
	private long timeBalance;
	
	TimeAccount(String n, String num, long z, long y) {
		name = n;
		no = num;
		balance = z;
		this.timeBalance = y;
	}
	
	String getName() {
		return name;
	}
	
	String getNo() {
		return no;
	}
	
	long getBalance() {
		return balance;
	}
	
	void deposit(long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -= k;
	}
	
	long getTimeBalance() {
		return timeBalance;
	}
	
	long getTotalBalance() {
		return TotalBalance();
	}
	
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	long TotalBalance() {
		return this.getTimeBalance() + this.getBalance();
	}
	
	static int compTimeBalance(TimeAccount adachi, TimeAccount nakata) {
		if (adachi.TotalBalance() > nakata.TotalBalance()) {
			return 1;
		} else if (adachi.TotalBalance() < nakata.TotalBalance()) {
			return -1;
		} 
		return 0;
	}	
	
}