#애완동물을 소개해 주세요~

animal ="강아지"
name = "연탄이"
age = 4
hobby = "산책"
is_adult = age >=3

print("우리집 "+ animal+" 이름은 "+name+"에요")

hobby = "낮잠"
#age는 str로 감싸주어야 함 그래야 정수형을 문장으로 나타내줌
print(name +"는"+str(age)+"살이며, "+hobby+"을 아주 좋아해요")

print(name+"이는 어른일까요?"+ str(is_adult))