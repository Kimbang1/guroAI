#가변 인자
# *가변인자 형식으로 기재

#사용 이유 아래의 예시와 같이 lang1~5까지 있는데 더 늘어난다면 함수를 변경해주는것이 번거롭기에
#가변 인자를 생성해서 함수에 대입해주기

# def profile(name,age,lang1,lang2,lang3,lang4, lang5):
#     print("이름 : {0}\t 나이:{1}\t ".format(name, age), end=" ")
#     print(lang1,lang2,lang3,lang4,lang5)


def profile(name,age,*language):
    print("이름 : {0}\t 나이:{1}\t ".format(name, age), end=" ")
    for lang in language:
        print(lang, end=" ")
    print()

profile("유재석", 20, "Python","Java","c", "c++", "c3","Swift")
profile("김태호", 25, "Kotlin","Swift", "", "", "")