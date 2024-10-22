package bank;

import java.text.DecimalFormat;

public class BasicInfo {
	
	//슈퍼 클래스
	
	protected String account;	//계좌번호	- 계산의 목적이 아니기에 스트링도 괜춘
	protected int balance; 		//계좌잔액\
	
	public BasicInfo(String account) {
		this.account = account;
	}

	public void mtdBalance( ) {		//잔액처리
		System.out.println(account + "계좌잔액 : "+ comma(balance));
	}
	private String comma(int balance) {
		DecimalFormat df = new DecimalFormat("#,### 원");
		return df.format(balance);
	}

	public void mtdDeposit(int depositMoney) { } 	//입금
}
