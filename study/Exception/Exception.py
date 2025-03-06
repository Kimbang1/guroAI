#예외 처리
try:
    print("나누기 전용 계산기 입니다.")
    nums=[]
    nums.append(int(input("첫번째 숫자를 입력하세요 :")))
    nums.append(int(input("두번째 숫자를 입력하세요 :")))
   # nums.append(int(nums[0]/nums[1]))
    print("{0}/{1} = {2}".format(nums[0],nums[1],nums[2]))
except ValueError:
    print("에러가 발생")
except ZeroDivisionError as err:
    print(err)
except Exception as err:
    print("알수 없는 오류 발생")
    print(err)
