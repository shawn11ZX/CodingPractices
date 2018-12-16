## Quick Sort
```python
def qsort(l, s, e):
	if s >= e:
		return
	mid = (s+e)//2
	swap(l, s, mid)
	pivot = l[s]
	ss = s+1
	ee = e-1
	while ss <= ee:
		while ss<=ee and l[ss] < l[s]:
			ss+=1
		while ss<=ee and l[ee] >= l[s]:
			ee-=1
		if ss < ee:
			swap(l, ss, ee)
	
```



> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTEzNzE0OTUzNDJdfQ==
-->