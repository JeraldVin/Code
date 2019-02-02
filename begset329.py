min=int(input())
hours=0
if min>60:
	hours=int(min/60)
	min%=60
print(hours,min)
