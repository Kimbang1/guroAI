# #같은 경로에 있는 모듈이어야지 사용 가능
# import theater_module
# theater_module.price(3)     #3명이서 영화 보러 갔을 때 가격
# theater_module.price_moring(4)  #4명이서 조조 할인 보러 갔을때
# theater_module.price_soldier(5) #5명의 군인이 영화 보러 갔을때


# import theater_module as mv         #이렇게 as 00 이런식으로 작성하면 임포트한 모듈의 별명으로 짧게 사용할 수 있음
# mv.price(3)
# mv.price_moring(4)
# mv.price_soldier(5)

# from theater_module import *
# price(3)
# price_soldier(5)
# price_moring(4)

# from theater_module import price, price_moring
# price_moring(6)
# price(5)

from theater_module import price_soldier as soldier
soldier(5)