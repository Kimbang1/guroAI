python = "Python is Amazing"
print(python.lower())
print(python.upper())
print(python[0].isupper())  #변수의 첫번째 값이 대문자인지 아닌지 옳다면 true
print(len(python))      #변수의 총 길이
print(python.replace("Python","Java"))


index = python.index("n")
print(index)
index =python.index("n", index+1)
print(index)

print(python.find("Java"))      #원하는 값이 아니면 -1로 반환을 함.
#print(python.index("Java"))     #오류나면서 종료


print(python.count("n"))