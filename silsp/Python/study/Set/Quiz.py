# Quiz) 당신의 학교에서는 파이썬 코딩 대회를 주최합니다.
# 참석률을 높이기 위해 댓글 이벤트를 진행하기로 했습니다.
# 댓글 작성자들 중에 추첨을 통해 1명은 치킨, 3명은 커피 쿠폰을 받게 됩니다.
# 추첨 프로그램을 작성하시오.

# 조건1 : 편의상 댓글은 20명이 작성하였고, 아이디는 1~20이라고 가정
# 조건2 : 댓글 내용과 상관 없이 무작위로 추첨하되 중복 불가
# 조건3 : random 모듈의 shuffle과 sample을 활용

# (출력 예제)
# -- 당첨 발표 --
# 치킨 당첨자 : 1
# 커피 당첨자 : [2,3,4]
# -- 축하합니다 --

from random import *

# participant = list(range(1,21))             #1부터 20까지의 숫자를 생성
# print(participant)

# shuffle(participant)
# print(participant)

# rule2 = participant.copy
# print(rule2)

# #치킨과 커피
# print(sample(participant,1))
# print(sample(participant,3))

users = range(1,21)
users = list(users)

print(users)
shuffle(users)
print(users)

winners = sample(users,4)       #4명 중에서 1명은 치킨, 3명은 커피

print("-- 당첨자 발표 --")
print("치킨 당첨자 : {0}".format(winners[0]))       #0번째만
print("커피 당첨자 : {0}".format(winners[1:]))      #1번째 부터 3번째 까지
print("-- 축하합니다 --")
