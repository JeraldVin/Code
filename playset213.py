n=int(input())
num=n
sum=0
while num>0:
	t=num%10
	sum+=t**2
	num=int(num/10)
print(sum)
