gname=input("상품명 :")
gprice=input("가격:")
gcnt=input("개수:")

#list={gname :[gprice,gcnt]}
#print(f"목록: {list}")


dataTuple=tuple((gprice,gcnt))
dataDict =dict({gname:dataTuple})
print(f"{dataDict}" )
