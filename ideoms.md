## Quick Sort
```python
def swap(l, i1, i2):
	t = l[i1]
	l[i1] = l[i2]
	l[i2] = t
	
def qsort(l, s, e):
	if s >= e-1:
		return
	mid = (s+e)//2
	swap(l, s, mid)
	ss = s+1
	ee = e-1
	while ss <= ee:
		while ss<=ee and l[ss] < l[s]:
			ss+=1
		while ss<=ee and l[ee] >= l[s]:
			ee-=1
		if ss < ee:
			swap(l, ss, ee)
	swap(l, ss-1, s)
	qsort(l, s, ss-1)
	qsort(l, ss, e)
```



> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTEwMDI1NzQ1OCwxNzYyMDcwOTIxXX0=
-->