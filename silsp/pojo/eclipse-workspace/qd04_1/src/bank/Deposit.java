package bank;

public class Deposit extends BasicInfo {

	public Deposit(String account) {
		super(account);
		
	}

	@Override
	public void mtdDeposit(int depositMoney) {
		super.balance +=  depositMoney;
		System.out.println("입금확인");
		
	}
}
