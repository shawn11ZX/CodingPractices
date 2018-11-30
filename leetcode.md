
### 22 permutation of parenthesis

### 28 strstr
for pattern pat, we build an info[] array
each element info[i] at i means, if info[i] is differerent from src[x], we should change i to info[i], that is comparing info[info[i]] with src[x] instead. -1 means advancing x. only info[i] is -1

print(s.preprocess("aaaa"))
[-1, 0, 1, 2] 
print(s.preprocess("abaa"))
[-1, 0, 0, 1] 

### 31 Next Permutation
be aware of array with same elements, such as
[5,1,1]

### 40 Combine sum
When start reaches len(nums) - 1, it's a success if:

 - target % divisor == 0
 - dividends << counts[start] 
 - **dividents >= 0**, note that dividents can be less then zero

> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTMwMzk2MzM2OSw0NTc1NDU0NDgsLTE3OD
QzNTY1ODAsODQzNjUxODA0XX0=
-->