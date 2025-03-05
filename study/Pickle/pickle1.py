#피클: 프로그램 상에서 데이터를 파일로 바꿈
#{}사전 형태
#[] 리스트 형태
import pickle
#wjwkd
# profile_file = open("profile.pickle","wb")      #w= 쓰기, b= 바이너리
# profile={"이름":"박명수","나이":"30","취미":["축구","골프","코딩"]}
# print(profile)
# pickle.dump(profile,profile_file)   #pickl.dump는 profile 에 있는 정보를 file에 저장
# profile_file.close()

profile_file = open("profile.pickle","rb")      #r= 읽기모드, b= 바이너리
profile = pickle.load(profile_file)             #file 에 있는 정보를 profile 에 불러오기
print(profile)
profile_file.close()