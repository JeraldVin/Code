n,m=map(int,input().split(" "))
num1=list(map(int,input().split(" ")))
num2=list(map(int,input().split(" ")))
flag=0
if n<m:
	print("NO")
else:
	for i in range(0,m):
		if num2[i] in num1:
			continue
		else:
			print("NO")
			flag=1
if flag==0:
	print("YES")
