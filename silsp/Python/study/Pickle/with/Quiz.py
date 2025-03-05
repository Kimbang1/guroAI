# Quiz) 당신의 회사에서는 매주 1회 작성해야 하는 보고서가 있습니다.
# 보고서는 항상 아래와 같은 형태로 출력되어야 합니다.

# -X 주차 주간 보고-
# 부서 :
# 이름 :
# 업무 요약 :

# 1주차부터 50주차까지의 보고서 파일을 만드는 프로그램을 작성하시오.

# with open("report.txt", "w", encoding="utf8") as report:
#     weekly = range(1,50)
#     report.write(" {0}주차 주간보고 \n 부서 : \n 이름 : \n 업무 요약:".format(weekly))


for week in range(1,6):        #1주차부터 50주차 까지 반복

    filename = f"{week}주차.txt" #파일명 설정
    with open(filename,"w",encoding="utf8") as report:
        report.write(f"-{week}주차 주간보고 - \n")  #n주차 출력
        report.write("부서 :\n")  
        report.write("이름 :\n")  
        report.write("업무 요약 :\n")