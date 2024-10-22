package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);){
		
			System.out.println("계좌번호 입력(6자리 숫자):");
			String account = sc.next();
			
			BasicInfo basicInfo = new Deposit(account);
		
			while(true) {
				
				System.out.println("\n온라인 뱅킹 메뉴 선택");
				System.out.print("1.잔액확인 2.입금 3.출금 9.종료 :");
				
				int bankMenu = sc.nextInt();
				
				if(bankMenu ==1) {
					//잔액확인
					
					basicInfo.mtdBalance();
					
				}else if(bankMenu ==2) {
					//입금
					System.out.println("입금액 : ");
					int depositMoney= sc.nextInt();
					basicInfo = new Deposit(account);
					
					
				}else if(bankMenu ==3) {
					//출금
					System.out.print("출금액 : ");
					int withdrawMoney = sc.nextInt();
							
					basicInfo = new Withdraw(account);
					bsicInfo.
				}else if(bankMenu ==9) {
					
				break;
			}
			}
			System.out.println("온라인 뱅킹을 종료합니다.");
			sc.close();
		} catch (Exception e) {
			
		}

	}

}

