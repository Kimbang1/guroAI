#표준 입출력
#sys.stdout 표준 출력에 관한것
#sys.stderr 표준 에러에 관한것 
#위 두개를 따로 log를 찍어서 확인할수 있음


#sep=" " 큰 따옴표 안에 들어가는  , + vs가 출력문 사이사이에 들어가서 띄어쓰기부터 , 등등 이 같이 출력됨
#end은 줄바꿈을 해주는데 end="?" 이런 형식이면 문장의 마지막이 ?가 되게 해달라는 것

# print("python", "java", sep=",", end="?")
# print("무엇이 더 재밌을 까요?")


# #.ljust(n), .rjust(n) 은 왼쪽에서부터n칸 확보후 왼쪽정렬, 오른쪽에서부터 n칸 확보후 오른쪽정렬
# score = {"수학":0, "영어":50,"코딩":100}
# for subject, score in score.items():
#     print(subject.ljust(5),str(score).rjust(4), sep=":")

# #은행 대기순번표
# #001,002, 003, ...
# #.zfil(n)은 n만큼 공간을 확보하고 빈공간을 0으로 채우라는 것

# for num in range(1,21):
#     print("대기번호 :"+str(num).zfill(3))

ansewr = input("아무 값이나 입력하세요:")
print('입력하신 값은'+ ansewr +'입니다.')