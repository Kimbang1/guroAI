#파일 입출력
#1.파일 입력
# score_file = open("score.txt", "w", encoding="utf8")
# print("수학 : 0", file=score_file)
# print("영어 : 50", file=score_file)
# score_file.close()
#이렇게 하면 파일이 생성됨

#2.파일 덮어쓰기
# score_file = open("score.txt", "a", encoding="utf8")
# score_file.write("과학:80")
# score_file.write("\n코딩 : 100")
# score_file.close()

#3.파일열기
# #3-1.한번에 열기
# score_file = open("score.txt", "r", encoding="utf8")
# print(score_file.read())
# score_file.close()


#3-2.하나씩 열기
# score_file = open("score.txt", "r", encoding="utf8")
# print(score_file.readline(),end="") #한줄로 읽기, 한줄읽고 커서는 다음 줄로 이동
# print(score_file.readline(),end="") #한줄로 읽기, 한줄읽고 커서는 다음 줄로 이동
# print(score_file.readline(),end="") #한줄로 읽기, 한줄읽고 커서는 다음 줄로 이동
# print(score_file.readline(), end="") #한줄로 읽기, 한줄읽고 커서는 다음 줄로 이동
# score_file.close()

#3-3. 몇줄인지 모를때
# score_file = open("score.txt", "r", encoding="utf8")
# while True:
#     line = score_file.readline()
#     if not line:
#         break
#     print(line, end=".")
# score_file.close()

#3-4. 리스트에 다 넣어서 해결
score_file = open("score.txt", "r", encoding="utf8")
lines = score_file.readlines()  #list 형태로 저장
for line in lines:
    print(line, end="")
score_file.close()