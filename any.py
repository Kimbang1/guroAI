import numpy as np

data = np.array([[1, -2, 3], [-4, 5, -6]])

# 배열 출력
print(f"data :\n\t{data}")

# 각 요소가 0 이상인지 확인하고, 0 이상이면 값을 그대로, 그렇지 않으면 0으로 설정
print("각 요소 값이 0이상인지 개별 체크 :")
print(np.where(data >= 0, data, 0))
