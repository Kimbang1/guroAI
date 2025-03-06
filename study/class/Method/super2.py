class Unit:
    def __init__(self):
        print("Unit생성자")

class Flyable:
    def __init__(self):
        print("Flyable 생성자")

class FlyableUnit(Unit, Flyable):
    def __init__(self):
        #super().__init__()
        Unit.__init__(self)
        FlyableUnit.__init__(self)
#두개 이상의 클래스를 상속받을때 super를 쓰게 되면 현재 예시 처럼 앞의 값만 받게 되는 문제가 발생함

#드랍쉽
dropship = FlyableUnit()