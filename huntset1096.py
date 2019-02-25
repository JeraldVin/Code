n=int(input())
if n<10:
	print(n)
else:
	num=n%9
	s=str(num)
	print(s,"9"*int(n/9),sep="")
