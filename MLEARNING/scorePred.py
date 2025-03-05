import pandas as pd
import seaborn as sb
import matplotlib.pyplot as plt



# print(pd.__version__)
path="./dataSet/Student_Marks.csv"
stu_data=pd.read_csv(path)
print("\n----------- 데이터 원본-------------")
print(stu_data)

print("\n----------- 데이터 기초 정보-------------")
print(stu_data.info())

print("\n----------- 데이터 통계량 정보-------------")
print(stu_data.describe())

print("\n----------- 데이터 상관관계 분석-------------")
#상관관계는 1이 최대값이고
#전혀 관계가 없다면 0이다.
print(stu_data.corr())


print("\n----------- 산점도 -------------")
fig, ax = plt.subplots(ncols=2, figsize=(12,6))
sb.scatterplot(data=stu_data, x='number_courses', y='Marks', ax=ax[0])
sb.scatterplot(data=stu_data, x='time_study', y='Marks', ax=ax[1])
plt.show()