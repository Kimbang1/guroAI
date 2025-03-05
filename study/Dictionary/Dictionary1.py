cabinet = {3:"유재석", 100:"김태호"}
# print(cabinet[3])
# print(cabinet[100])

# print(cabinet.get(3))
# print(cabinet[5])
# print(cabinet.get(5,"사용가능"))

# print(3 in cabinet) #3이 있다면 True
# print(5 in cabinet) #5이 있다면 False

cabinet={"A-3": "유재석", "B-100":"김태호"}
print(cabinet["A-3"])
print(cabinet["B-100"])

#새손님이 들어옴
print(cabinet)
cabinet["A-3"] ="김종국"
cabinet["c-20"] = "조세호"      #c-20번에 조세호를 할당해줌
print(cabinet)


#간 손님
del cabinet["A-3"]
print(cabinet)

#key 들만 출력
print(cabinet.keys())

#value들만 출력
print(cabinet.values())

#key,value 쌍으로 출력
print(cabinet.items())

#목욕탕 폐점
cabinet.clear()
print(cabinet)