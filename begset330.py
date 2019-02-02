hours1,min1=map(int,input().split(" "))
hours2,min2=map(int,input().split(" "))
min1+=hours1*60
min2+=hours2*60
min=abs(min1-min2)
hours=0
if min>=60:
	hours=int(min/60)
	min%=60
print(hours,min)
