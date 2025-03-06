#메소드, 상속, 다중상속 관련 수업
#일반 유닛
class Unit:
    def __init__(self, name, hp):           #__init__ 생성자 객체
        self.name = name
        self.hp = hp                                #self.name, self.hp, selg.damage가 멤버변수가 됨
       

#공격 유닛
class AttackUnit(Unit):
      def __init__(self, name, hp, damage):           #__init__ 생성자 객체
        Unit.__init__(self,name,hp)                     #Unit 클래스의 인자를 넘겨줌 
        self.damage = damage
      
      def attack(self, location):
          print("{0} : {1}방향으로 적군을 공격합니다.[공격력 {2}]"\
                .format(self.name, location, self.damage))

      def damaged(self, damage):
          print("{0}: {1}데미지를 받았습니다. [데미지{1}]".format(self.name, damage))
          self.hp  -= damage
          print("{0}: 현재 hp는 {1}입니다.  ".format(self.name, self.hp))
          if self.hp <= 0:
              print("{0}유닛이 파괴되었습니다.".format(self.name))

#드랍쉽 : 공중 유닛, 수송기. 마린/ 파이어뱃 / 탱크 등을 수송, 공격 X
#날수 있는 기능을 가진 클래스
class Flyable:
    def __init__(self, flying_speed):
                self.flying_speed = flying_speed

    def fly(self, name, location):
        print("{0}:{1} 방향으로 날아갑니다, [속도 {2}]".format(name,location,self.flying_speed))


#공중 공격 유닛 클래스
class FlyalbeAttackUnit(AttackUnit, Flyable):
    def __init__(self, name, hp, damage, flying_speed):
         AttackUnit.__init__(self,name,hp, damage)              #공격 유닛에 대해서 상속
         Flyable.__init__(self, flying_speed)                   #공중 유닛에 대해서 상속
         print("{0}:적을 공격합니다. [공격력 : {1}]".format(self.name,self.damage))

#발키리 : 공중 공격 유닛, 한번에 14발 미사일 발사
valkyrie = FlyalbeAttackUnit("발키리", 200, 6, 5)

valkyrie.fly(valkyrie.name,'3시')

#파이어벳 ; 공격 유닛, 화염방사기.
# firebat1 = AttackUnit("파이어뱃", 50, 16)
# firebat1.attack("5시")
# #공격을 2번 받는다고 가정
# firebat1.damaged(25)
# firebat1.damaged(25)