## Quick Sort


```python
def swap(l, i1, i2):
    t = l[i1]
    l[i1] = l[i2]
    l[i2] = t

# use l[s] is a pivot, for all i in [s+1, ss), l[i] < l[s], for all i in [ss, e) l[i] >= l[s] 
def divide(l, s, e):
    ss = s + 1
    ee = e - 1
    while ss <= ee:
        while ss <= ee and l[ss] < l[s]:
            ss += 1
        while ss <= ee and l[ee] >= l[s]:
            ee -= 1
        if ss < ee:
            swap(l, ss, ee)
    return ss
def qsort(l, s, e):
    if s >= e-1:
        return
    mid = (s+e)//2
    swap(l, s, mid)
    ss = divide(l, s, e)
    swap(l, ss-1, s)
    qsort(l, s, ss-1)
    qsort(l, ss, e)
```
After while ss 


> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE1NDE3OTEwNjAsLTExNTUxOTMzNTMsMj
UwMTI1MjQ4LDE3NjIwNzA5MjFdfQ==
-->