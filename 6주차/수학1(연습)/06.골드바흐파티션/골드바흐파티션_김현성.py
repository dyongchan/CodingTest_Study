import sys

prime = []
check = [0] * 1000001 # c언어에서 처럼 파이썬도 0은 false를 의미하면 0이 아닌 정수는 true를 의미한다.
check[0] = 1
check[1] = 1
# 따라서 0이면 false로 소수
for i in range(2, 1000001):
    if check[i] == 0:# 소수라면 if문 작동
        prime.append(i)
        for j in range(2*i, 1000001, i):# 앞에 if문에서 작동 된 숫자들의 배수들을 1,000,000까지 true로 소수가 아님을 체크  그러면 다음에 9번째 if문에서 넘어가게된다.
            check[j] = 1

T = int(sys.stdin.readline())

for _ in range(T):
    count = 0
    N = int(sys.stdin.readline())
    for i in prime: # 위에서 소수들만 남긴다.
        if i >= N:
            break
        if not check[N - i] and i <= N-i:  # 순서만 다른거 counting 하지 않기 위해
            count += 1
    print(count)