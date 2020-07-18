#python
import math
x1=int(input())
y1=int(input())
r1=int(input())
x2=int(input())
y2=int(input())
r2=int(input())
c=(int)(math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2)));
if(c==r1+r2):
  print("Tangential");
elif(c>r1+r2):
  print("Do not overlap");
else:
  print("overlap");