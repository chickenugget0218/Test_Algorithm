def solution(n):
    if n**(1/2) == int(n**(1/2)):
        sqr = int(n**(1/2))+1
        answer = sqr*sqr
        return answer
    else:
        return -1