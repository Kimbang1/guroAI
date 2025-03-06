class Unit:
    def __init__(self, name, hp, damage):           #__init__ 생성자 객체
        self.name = name
        self.hp = hp                                #self.name, self.hp, selg.damage가 멤버변수가 됨
        self.damage = damage
        print("{0}유닛이 생성 되었습니다.".format(self.name))
        print("체력{0} 공격력{1}.".format(self.hp, self.damage))

# marine1 = Unit("마린",40,5)
# marine2 = Unit("마린",40,5)
# tank = Unit("탱크", 150,35)


#레이스 : 공중 유닛, 비행기, 클로킹(상대방에게 보이지 않음)
wraith1 = Unit("레이스", 80 ,5)
print("유닛 이름: {0}, 공격력: {1}".format(wraith1.name, wraith1.damage))

#마인드 컨트롤 : 상대방 유닛을 내것으로 만드는 것(빼앗음)
wraith2 = Unit("뺏은레이스",80,5)
wraith2.clocking = 1

if wraith2.clocking == 1:
    print("{0}이 레이스의 상태는 클로킹 상태 입니다.".format(wraith2.name))
else:
    print("{0}의 상태는 클로킹 모드가 아닙니다.".format(wraith2.name))