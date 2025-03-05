#마린 :  공격 유닌, 군인. 총을 쏠 수 있음
name ="마린"
hp =50
damage=5

print("{}유닛이 생성되었습니다.".format(name))
print("체력 {0}, 공격력{1} \n".format(hp, damage))

#탱크 ; 공격 유니, 탱크, 포를 쏠 수 있음. 일반모드/ 시즈 모드
tank_name = "탱크"
tank_hp = 150
tank_damage = 35

print("{}유닛이 생성되었습니다.".format(tank_name))
print("체력 {0}, 공격력{1} \n".format(tank_hp, tank_damage))


tank2_name = "탱크2"
tank2_hp = 150
tank2_damage = 35

print("{}유닛이 생성되었습니다.".format(tank2_name))
print("체력 {0}, 공격력{1} \n".format(tank2_hp, tank2_damage))

def attack(name,location, damage):
    print("{0}:{2} 방향으로 적군을 공격합니다. [공격력 {1}]".format(\
        name,damage,location))
    
attack(name,"1시",damage)
attack(tank_name,"1시",tank_damage)
attack(tank2_name,"1시",tank2_damage)