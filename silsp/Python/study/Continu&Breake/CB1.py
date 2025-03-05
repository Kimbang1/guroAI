absent = [2,5]  #결석
no_book = [7] #책을 안가져옴


for student in range(1,11):
    if student in absent:
        continue
    elif student in no_book:
        print("오늘 수업 끝, {0}이는 교무실로".format(student))
        break
    print("{0} 야 책을 읽어봐".format(student))