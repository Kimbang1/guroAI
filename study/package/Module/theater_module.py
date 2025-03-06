#모듈이란?
# 잘 만들어진 부품


#일반 가격
def price(poeple):
    print("{0}명 가격은  {1}원 입니다.".format(poeple, poeple *10000))

#조조할인 가격
def price_moring(poeple):
    print("{0}명 조조할인 가격은 {1}원 입니다.".format(poeple, poeple *60000))

#군인할인 가격
def price_soldier(poeple):
    print("{0}명 군인할인 가격은 {1}원 입니다,".format(poeple, poeple * 4000))