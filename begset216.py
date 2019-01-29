st,en=input().split(" ")
start=int(st)
end=int(en)
for i in range(start+1,end):
	if i==1:
		continue
	flag=0
	for j in range(2,int(i/2)+1):
		#print(i)
		#print(j)
		if i%j==0:
			flag=1
			break
	if flag==0:
		print(i,end=" ")
