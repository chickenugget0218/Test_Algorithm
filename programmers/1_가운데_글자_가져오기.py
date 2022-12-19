def solution(s):
    long = len(s)
    answer = ''
    
    if long%2 == 0:
        #짝수
        answer = long//2
        return s[answer-1:answer+1]
    else:
        answer =long//2 
        return s[answer]
    