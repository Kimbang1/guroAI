#지역변수 : 함수 내에서만 쓸수 있음
#전역변수 : 프로그램 내에서 어디서든 쓸수 있음
gun = 10

# def checkpoint(soldiers): #경계근무
#     global gun #전역 공간에 있는 gun 사용하겠다
#     # gun = 20 #지역변수
#     gun = gun - soldiers
#     print("[함수 내] 남은 총 : {0}".format(gun))

def checkpont_ret(gun, soldier): 
    gun = gun - soldier
    print("[함수 내] 남은 총 : {0}".format(gun))
    return gun



print("전체 총:{0}".format(gun))
# checkpoint(3)
gun = checkpont_ret(gun,2)
print("남은 총 : {0}".format(gun))