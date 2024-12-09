my_tuple=1,2,3,4,5
print(f"튜플: {my_tuple}, 자료형:{type(my_tuple)}, 개수:{len(my_tuple)}")
a =my_tuple[0] 
b = my_tuple[-1] 
c = my_tuple[-2] 
print (f"인덱싱[0] : {a}, 자료형： {type(a)}") 
print (f"인덱싱[-1]: {b}, 자료형＝ {type(b)}") 
print (f"인덱싱[-2]= {c}, 자료형： {type(c)}") 

e=my_tuple[0:2]
f=my_tuple[-2:]

print(f"슬라이싱[0:2], {e}, 자료형: {type(e)}")
print(f"슬라이싱[0:2], {f}, 자료형: {type(f)}")