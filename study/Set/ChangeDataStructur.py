#자료구조의 변경
menu= {"커피","우유","주스"}
print(menu,type(menu))      #현재 자료는 class가 set으로 들어감

menu =list(menu)
print(menu,type(menu))

menu = tuple(menu)
print(menu,type(menu))

menu = set(menu)
print(menu,type(menu))