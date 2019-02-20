arr=[]
for i in range(4):
	dup=[]
	dup=list(map(int,input().split()))
	arr.append(dup)
flag=0
x=0
y=0
for i in range(4):
	if i<3:
		if arr[i][0]==arr[i+1][0]:
			x+=1
			continue
		elif arr[i][1]==arr[i+1][1]:
			y+=1
			continue
		else:
			flag=1
			break
	else:
		if arr[3][0]==arr[0][0]:
			x+=1
			continue
		elif arr[3][1]==arr[0][1]:
			y+=1
			continue
		else:
			flag=1
			break
if flag==0 and x==2 and y==2:
	print("yes")
else:
	print("no")
