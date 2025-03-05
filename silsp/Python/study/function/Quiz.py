# Quiz) 표준 체중을 구하는 프로그램을 구하시오

# *표준 체중 : 각 개인의 키에 적당한 체중

# (성별에 따른 공식)
# 남자 : 키(m) X 키(m) X 22
# 여자 : 키(m) X 키(m) X 21

# 조건1 : 표준 체중은 별도의 함수 내에서 계산
#         *함수명 : std_weight
#         *전달값 : 키(height),성별(gender)
# 조건2 : 표준 체중은 소수점 둘째자리까지 표시

# (출력 예제)
# 키  175cm 남자의 표준 체중은  67.38kg 입니다.

# def std_weight(height, gender):
#     height_m =height /100
#     if gender == "남자" :
#         weight = height_m * height_m * 21
#     elif gender == "여자":
#         weight = height_m * height_m * 22
#     else:
#         return None #잘못된 성별 입력
#     return round(weight,2)


# height = 174
# gender = "남자"

# weight = std_weight(height, gender)
# if weight is not None:
#     print("키 {0}cm {1}의 표준 체중은 {2}입니다.".format(height,gender,weight))
# else:
#     print("올바른 성별을 입력하세요")

def std_weight(height,gender):
    if gender == "남자":
        return height*height*22
    else:
        return height*height*21
    
height = 175
gender = "남자"
weight = round(std_weight(height/100 , gender),2)          #소수점 n자리까지 나타내기 round(a,n)
print("키 {0}cm {1}의 표준 체중은 {2}입니다.".format(height,gender,weight))