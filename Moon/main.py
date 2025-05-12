# TO-DO List 
# 최초 작성자 : 문세언
# 회사 업무리스트 알림

#업무 리스트
work_List = ['시제','자금일보 작성', '해외송금 목록작성', '해외송금']


print("업무리스트:")
while work_List:
    print("\n현재 남은 업무:",work_List)
    done = input("완료한 업무를 입력하세요:")

#완료한 업무 입력시 remove함수로 인해서 work_List에서 삭제
    if done in work_List:
        work_List.remove(done)
        print(f'"{done}"업무를 완료했습니다.')
    else:
        print("업무리스트에 없는 항목입니다.")

print("\n 모든 업무를 완료했습니다.")