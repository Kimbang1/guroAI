def open_account():
    print("새로운 계좌가 생성되었습니다.")

open_account()


#전달값과 반환값

def deposit(balance, money):  #입금하라는 함수
    print("입급이 완료 되었습니다. 잔액은{0}원 입니다.".format(balance + money))
    return balance + money


#출금
def withdraw(balance,money): # 출금
    if balance >= money: # 잔액이 출금보다 많으면
        print("출금이 완료 되었습니다. 잔액은 {0}원 입니다.".format(balance-money))
        return balance - money
    else:
        print("출금이 완료되지 않았습니다. 잔액은{0} 입니다.".format(balance))
        return balance
    

def withdraw_night(balance, money):  #저녁에 출금
    commission = 100 #수수료 100원
    return commission, balance - money -commission

balance = 0
balance = deposit(balance , 1000)
# balance = withdraw(balance, 2000)
# balance = withdraw(balance, 500)
commision,balance = withdraw_night(balance, 500)
print("수수료는 {0}원이며, 잔액은 몇 {1}원 입니다".format(commision, balance))
# print(balance)
#함수는 def로 시작하고 변수명() : 이렇게 작성을 해야 정의가 됨
#그후 함수를 open_account() 이런 식으로 호출을 해야 함