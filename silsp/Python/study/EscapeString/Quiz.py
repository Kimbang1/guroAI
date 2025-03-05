#사이트 별로 비밀번호를 만들어 주는 프로그램을 작성하세요

#예) http://naver.com
#규칙1 : http:// 부분은 제외 => naver.com
#규칙2 :  처음 만나는 점(.) 이후 부분은 제외 => naver
#규칙3 : 남은 글자 중 처을 세자리 + 글자 갯수 + 글자 내 'e' 갯수 + "!" 로 구성
                    #(nav)               (5)             (1)         (!)

#예) 생성된 비밀번호 : nav51!

url = "http://naver.com"
# my_str = url.replace("http://","")  #규칙 1
# print(my_str)
# #my_str = my_str[-9:-4]
# my_str = my_str[:my_str.index(".")] #규칙 2
# print(my_str)

# password = my_str[:3] + str(len(my_str)) + str(my_str.count("e"))+"!"
# print("{0}의 비밀번호는 {1}입니다." .format(url,password))
rule1 = url[7:]
print(rule1)

rule2 =rule1.replace(".com","")
print(rule2)

rule3 = rule2[0:3] + str(len(rule2))+ str(rule2.count("e"))+"!"
print(rule3)
