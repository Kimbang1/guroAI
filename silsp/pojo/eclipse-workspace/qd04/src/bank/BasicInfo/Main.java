package bank.BasicInfo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌번호 입력 (6자리 숫자) :");
		double account = sc.nextDouble();

		while (true) {
		System.out.println("\n온라인 뱅킹 메뉴 선택");
		System.out.print("1. 잔액확인 2. 입금 3.출금 9.종료 :");
		int num = sc.nextInt();
			if (num == 1) {
				BasicInfo balance = new BasicInfo();
				balance.mtdBalance();
				break;
			} else if (num == 2) {
				Deposit dep = new Deposit(num);
				dep.mtdDeposit();
				break;
			} else if (num == 3) {
				Withdraw wit = new Withdraw(num);
				wit.mtdWithdraw();
				break;
			} else {
			}
			}
		System.out.println("온라인 뱅킹을 종료합니다.");

		sc.close();

	}

}
