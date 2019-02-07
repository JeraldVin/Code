n=int(input())
stairs=list(map(int,input().split()))
sum=0
for i in range(1,len(stairs)):
	for j in range(0,i):
		if(stairs[j]<stairs[i]):
			sum+=stairs[j]
print(sum)
