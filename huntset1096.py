n=int(input())
if n<10:
	print(n)
else:
	num=n%9
	if num==0:
		print("9"*int(n/9))
	else:
		s=str(num)
		print(s,"9"*int(n/9),sep="")
