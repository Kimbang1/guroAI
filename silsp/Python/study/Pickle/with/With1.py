# import pickle
# #with를 사용하면 close를 사용할필요 없음
# with open("profile.pickle","rb") as profile_file:
#     print(pickle.load(profile_file))

# with open("study.txt", "w", encoding="utf8") as study_file:
#     study_file.write("파이썬 공부를 하고 있어요")

# 열어라  #해당 파일을 #읽기모드 #한글인코딩    #변수명(파일명)
with open("study.txt","r",encoding="utf8") as studyFile:
    print(studyFile.read())