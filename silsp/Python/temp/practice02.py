#금액을 입력받기
amount = int(input("금액을 입력하세요 :"))

Manwon=int(amount/10000) 
Chenwon = int((amount-Manwon*10000)/1000)
BackWon = int((amount-((Manwon*10000)+(Chenwon*1000)))/100)
SipWon = int((amount-(((Manwon*10000)+(Chenwon*1000)+(BackWon*100))))/10)
IlWon = int((amount-(((Manwon*10000)+(Chenwon*1000)+(BackWon*100)+(SipWon*10))))/1)

print(f"만원자릿 수:{Manwon}")
print(f"천원자릿 수:{Chenwon}")
print(f"백원자릿 수:{BackWon}")
print(f"십원자릿 수:{SipWon}")
print(f"일원자릿 수:{IlWon}")

#화폐 단위 리스트
#MoneyList=[10000,1000,100,10,1]
#MoneyList_name=["만원","천원","백원","십원","일원"]
#
##각 화폐 단위로 분리하여 출력
#for Money,name in zip(MoneyList,MoneyList_name):
#    count = amount//Money   # // 나눈값의 몫만 구함
#    amount %= Money         # % 나눈 결과의 나머지만 구함
#    print(f"{name}:{count}장")

