import sys

a , b = int(input().split())

m = int(sys.stdin.readline())
arr = list(map(int,input().split()))
arr.reverse() # 첫번째 자리 숫자 16이 먼저 1의 자리로 계산 되어야 하니까
trans = 0
for i in range (m):
    trans += arr[i]*(a**i)   #17진법에 따라서 17^(각자리숫자-1)

result = list()
while trans//b:#0이 아니라면 true 0이된다면 false로 반복문 종료
    result.append(trans%b)
    trans /= b
result.append(trans)

print(' '.join(map(str,result)))
