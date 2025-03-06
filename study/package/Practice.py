# import travel.thailand
# trip_to = travel.thailand.ThailandPackage()
# trip_to.detail()

# from travel.thailand import ThailandPackage
# trip_to = ThailandPackage()
# trip_to.detail()

# from travel.vietnam import VietNam
# trip_to = VietNam()
# trip_to.detail()

from travel import *
# trip_to = vietnam.VietNamPackage()
# trip_to = thailand.ThailandPackage()

# trip_to.detail()

import inspect      #v파일의 위치를 찾을수 있음.
import random
print(inspect.getfile(random))
print(inspect.getfile(thailand))