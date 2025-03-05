import pandas as pd
import numpy as np

pyData = pd.DataFrame([[8000,21,'칠레'],
                       [3500,53,'미국'],
                       [12000,16,'한국']],
                       ['블루베리','레몬','딸기'],
                       columns=['price','재고','원산지']
                       )
print(pyData)