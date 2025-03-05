#while 반복문
#조건이 만족할때까지 반복해라

customer ="토르"
index = 5
while index >=1:
    print("{0}, 님 커피가 준비되었습니다.{1}번 남았어요.".format(customer, index))
    index -=1
    
    if index == 0:
        print("커피는 폐기 처분 되었습니다.")