## 내답
def solution(n):
    answer = []
    new = str(n)
    new = new[::-1]
    for i in range(len(new)):
        answer.append(int(new[i]))
    return answer


## 다른사람 풀이
'''
def digit_reverse(n):
    return list(map(int, reversed(str(n))))


def digit_reverse(n):
    return [int(i) for i in str(n)][::-1]

'''
